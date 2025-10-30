package dev.isxander.controlify.platform.client.util;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface RenderLayer extends IGuiOverlay
{
    void render(GuiGraphics graphics, float tickDelta);

    default void render(@NotNull ForgeGui gui, @NotNull GuiGraphics graphics, float partialTick, int screenWidth, int screenHeight) {
        this.render(graphics, partialTick);
    }
}
