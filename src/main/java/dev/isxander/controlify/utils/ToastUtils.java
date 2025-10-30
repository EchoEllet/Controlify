package dev.isxander.controlify.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.toasts.SystemToast;
import net.minecraft.network.chat.Component;

public class ToastUtils {
    public static void sendToast(Component title, Component message, boolean longer) {
        SystemToast toast = SystemToast.multiline(
                Minecraft.getInstance(),
                /*? if >=1.20.4 {*/
                /*longer ? SystemToast.SystemToastId.UNSECURE_SERVER_WARNING : SystemToast.SystemToastId.PERIODIC_NOTIFICATION,
                *//*?} else {*/
                longer ? SystemToast.SystemToastIds.UNSECURE_SERVER_WARNING : SystemToast.SystemToastIds.PERIODIC_NOTIFICATION,
                /*?}*/
                title,
                message
        );
        //? if >=1.21.2 {
        /*Minecraft.getInstance().getToastManager().addToast(toast);
        *///?} else {
        Minecraft.getInstance().getToasts().addToast(toast);
        //?}
    }
}
