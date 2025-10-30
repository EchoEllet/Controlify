package dev.isxander.controlify.compatibility.rso.mixins;

import dev.isxander.controlify.compatibility.sodium.screenop.SodiumScreenOperations;
import dev.isxander.controlify.screenop.ScreenProcessorProvider;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.embeddedt.embeddium.gui.EmbeddiumVideoOptionsScreen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = EmbeddiumVideoOptionsScreen.class, remap = false)
public abstract class SodiumVideoOptionsScreenMixin extends Screen implements ScreenProcessorProvider, SodiumScreenOperations {
    protected SodiumVideoOptionsScreenMixin(Component p_96550_) {
        super(p_96550_);
    }
//    @Shadow
//    private FlatButtonWidget applyButton;
//    @Shadow
//    private FlatButtonWidget closeButton;
//    @Shadow
//    private FlatButtonWidget undoButton;

    // This feature was not ported to save development time,


}
