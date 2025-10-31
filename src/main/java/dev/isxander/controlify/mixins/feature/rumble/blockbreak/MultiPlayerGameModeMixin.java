package dev.isxander.controlify.mixins.feature.rumble.blockbreak;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import dev.isxander.controlify.api.ControlifyApi;
import dev.isxander.controlify.rumble.ContinuousRumbleEffect;
import dev.isxander.controlify.rumble.RumbleSource;
import dev.isxander.controlify.rumble.RumbleState;
import dev.isxander.controlify.utils.Easings;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MultiPlayerGameMode.class)
public class MultiPlayerGameModeMixin {
    @Unique
    private ContinuousRumbleEffect controlify$blockBreakRumble = null;

    @Inject(
            method = "lambda$startDestroyBlock$1",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/ClientLevel;destroyBlockProgress(ILnet/minecraft/core/BlockPos;I)V")
    )
    private void onStartBreakingBlock(CallbackInfoReturnable<Packet<?>> cir, @Local(argsOnly = true) BlockState state) {
        controlify$startRumble(state);
    }

    @Inject(
            method = "lambda$startDestroyBlock$1",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;destroyBlock(Lnet/minecraft/core/BlockPos;)Z")
    )
    private void onInstabreakBlockSurvival(CallbackInfoReturnable<Packet<?>> cir, @Local(argsOnly = true) BlockState state) {
        controlify$startRumble(state);
        // won't stop until 1 tick
        controlify$stopRumble();
    }

    @Inject(method = "stopDestroyBlock", at = @At("RETURN"))
    private void onStopBreakingBlock(CallbackInfo ci) {
        controlify$stopRumble();
    }

    @Inject(method = "continueDestroyBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;startPrediction(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/multiplayer/prediction/PredictiveAction;)V", ordinal = 1))
    private void onFinishBreakingBlock(BlockPos pos, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        controlify$stopRumble();
    }

    @ModifyExpressionValue(method = "continueDestroyBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;isAir()Z"))
    private boolean onAbortBreakingBlock(boolean original) {
        if (original)
            controlify$stopRumble();

        return original;
    }

    @Unique
    private void controlify$startRumble(BlockState state) {
        controlify$stopRumble();

        var effect = ContinuousRumbleEffect.builder()
                .byTick(tick -> new RumbleState(
                        0.02f + (float) Easings.easeInQuad(Math.min(1, state.getBlock().defaultDestroyTime() / 20f)) * 0.25f,
                        0.01f
                ))
                .minTime(1)
                .build();

        controlify$blockBreakRumble = effect;
        ControlifyApi.get().playRumbleEffect(RumbleSource.INTERACTION, effect);
    }

    @Unique
    private void controlify$stopRumble() {
        if (controlify$blockBreakRumble != null) {
            controlify$blockBreakRumble.stop();
            controlify$blockBreakRumble = null;
        }
    }
}
