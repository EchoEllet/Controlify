package dev.isxander.controlify.mixins.feature.screenop.vanilla;

import dev.isxander.controlify.screenop.ScreenProcessor;
import dev.isxander.controlify.screenop.ScreenProcessorProvider;
import dev.isxander.controlify.screenop.compat.vanilla.RecipeBookScreenProcessor;
import net.minecraft.client.gui.screens.inventory.*;
import net.minecraft.client.gui.screens.recipebook.RecipeBookComponent;
import net.minecraft.client.gui.screens.recipebook.RecipeUpdateListener;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import javax.annotation.Nullable;

//? if >=1.21.2 {
/*@Mixin(AbstractRecipeBookScreen.class)
*///?} else {
@Mixin(value = {
        InventoryScreen.class,
        AbstractFurnaceScreen.class,
        CraftingScreen.class
})
//?}
public abstract class AbstractRecipeBookScreenMixin
        extends AbstractContainerScreenMixin
        implements ScreenProcessorProvider, RecipeUpdateListener, RecipeBookScreenProcessor.RecipeBookScreenAccessor {

    /**
     * Workaround: lazily create the processor to fix a crash when opening the inventory.
     *
     * <p>Caused by:
     * <pre>
     * java.lang.NoClassDefFoundError: dev.isxander.controlify.mixins.feature.screenop.vanilla.AbstractContainerScreenMixin is invalid
     * 	at org.spongepowered.asm.service.modlauncher.ModLauncherClassTracker.handlesClass(ModLauncherClassTracker.java:91)
     * 	at org.spongepowered.asm.launch.MixinLaunchPluginLegacy.handlesClass(MixinLaunchPluginLegacy.java:109)
     * </pre>
     *
     * <p>See also (not directly related):
     * <ul>
     *   <li><a href="https://github.com/SpongePowered/Mixin/issues/584">Mixin Issue #584</a></li>
     *   <li><a href="https://github.com/isXander/Controlify/commit/b468effcc388ccf6fd9d50e64d9e180f327fca53">Controlify commit</a></li>
     * </ul>
     */
    @Unique
    @Nullable
    private RecipeBookScreenProcessor<?> processor;

    //? if >=1.21.2 {
    /*@Shadow
    @Final
    private RecipeBookComponent<?> recipeBookComponent;

    @Unique
    private RecipeBookComponent<?> getRecipeBookComponent() {
        return recipeBookComponent;
    }
    *///?}

    @Override
    public RecipeBookComponent/*? if >=1.21.2 >>*//*<?>*/ controlify$getRecipeBookComponent() {
        return this.getRecipeBookComponent();
    }

    @Override
    public ScreenProcessor<?> screenProcessor() {
        if (processor == null) {
            processor = new RecipeBookScreenProcessor<>(
                    /*? if >=1.21.2 {*/ /*(AbstractRecipeBookScreen<?>) *//*?} else {*/ (AbstractContainerScreen<?>) /*?}*/ (Object) this,
                    this,
                    () -> hoveredSlot,
                    this::slotClicked,
                    this::handleControllerItemSlotActions
            );
        }
        return processor;
    }
}
