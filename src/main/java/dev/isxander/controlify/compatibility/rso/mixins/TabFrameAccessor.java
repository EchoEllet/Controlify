package dev.isxander.controlify.compatibility.rso.mixins;

import com.google.common.collect.Multimap;
import org.embeddedt.embeddium.gui.frame.AbstractFrame;
import org.embeddedt.embeddium.gui.frame.tab.Tab;
import org.embeddedt.embeddium.gui.frame.tab.TabFrame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;
import java.util.Optional;

@Mixin(value = TabFrame.class, remap = false)
public interface TabFrameAccessor {
    @Accessor("tabs")
    Multimap<String, Tab<?>> getTabs();

    @Accessor("selectedTab")
    Tab<?> getSelectedTab();

    @Accessor("selectedFrame")
    AbstractFrame getSelectedFrame();
}
