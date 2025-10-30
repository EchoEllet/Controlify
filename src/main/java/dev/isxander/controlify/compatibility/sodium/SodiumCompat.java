package dev.isxander.controlify.compatibility.sodium;

public class SodiumCompat {
    public static final boolean SODIUM_06 = /*? if sodium: >=0.6 {*/ /*true *//*?} else {*/ false /*?}*/;

    public static final String SODIUM_PACKAGE = SODIUM_06
            ? "net.caffeinemc.mods.sodium"
            : "me.jellysquid.mods.sodium";

    public static final String SODIUM_PACKAGE_MIXIN = SODIUM_06
            ? "Lnet/caffeinemc/mods/sodium"
            : "Lme/jellysquid/mods/sodium";
}
