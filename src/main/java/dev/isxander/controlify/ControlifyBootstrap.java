package dev.isxander.controlify;

import dev.isxander.controlify.server.ControlifyServer;

import dev.isxander.controlify.gui.screen.ModConfigOpenerScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod("controlify")
public class ControlifyBootstrap {
    @SuppressWarnings("removal")
    public ControlifyBootstrap(FMLJavaModLoadingContext context) {
        ControlifyServer.getInstance().onInitialize();

        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory(
                        (client, parent) -> new ModConfigOpenerScreen(parent))
        );

        if (FMLEnvironment.dist == Dist.CLIENT) {
            Controlify.instance().preInitialiseControlify();
        }
        if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
            ControlifyServer.getInstance().onInitializeServer();
        }
    }
}
