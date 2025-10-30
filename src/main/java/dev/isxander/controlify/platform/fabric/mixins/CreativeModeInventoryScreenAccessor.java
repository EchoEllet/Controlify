package dev.isxander.controlify.platform.fabric.mixins;

import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.client.gui.CreativeTabsScreenPage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

//import java.util.List;
//
//@Mixin(CreativeModeInventoryScreen.class)
//public interface CreativeModeInventoryScreenAccessor {
//    @Accessor
//    static CreativeModeTab getSelectedTab() {
//        throw new AssertionError();
//    }
//
//    @Invoker
//    void invokeSelectTab(CreativeModeTab tab);
//}
