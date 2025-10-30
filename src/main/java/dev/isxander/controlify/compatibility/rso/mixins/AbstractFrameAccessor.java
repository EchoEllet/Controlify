package dev.isxander.controlify.compatibility.rso.mixins;

import me.jellysquid.mods.sodium.client.gui.options.control.ControlElement;
import org.embeddedt.embeddium.gui.frame.AbstractFrame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value = AbstractFrame.class, remap = false)
public interface AbstractFrameAccessor {
    @Accessor
    List<ControlElement<?>> getControlElements();
}
