# 🎮 Controlify: Forgified

A simple, and unofficial port of [Controlify](https://modrinth.com/mod/controlify), made for Forge 1.20.1.

The goal is to make it "just work" without crashes or critical issues.
The newer features, such as split-screen or data-driven button guides, are not included.

This port is based on [v2.1.2 for Fabric 1.20.1](https://modrinth.com/mod/controlify/version/gYWWawgz), with manual
backports of some changes from Controlify 2.4.2 and additional adjustments needed to make it work on MinecraftForge
platform.

> **Note:** Unlike the official Controlify mod,  
> this backport does **not** support on-screen Controlify data-driven button guides,  
> as it is an unofficial backport of an older Controlify version.

## 📦 **Required Dependencies**

Make sure you have these mods installed:

- [**YetAnotherConfigLib (YACL)**](https://modrinth.com/mod/yacl)

## ✅ **Compatible mods**

- [Epic Fight](https://modrinth.com/mod/epic-fight) — Fully compatible in collaboration 
  with the Epic Fight project authors.
  Use the most up-to-date version for the best experience.
  - [Epic Fight - Invincible Lib](https://www.curseforge.com/minecraft/mc-mods/epic-fight-invincible) 
  - [Epic Fight - Sword Soaring](https://www.curseforge.com/minecraft/mc-mods/sword-soaring) 
  - [Weapons of Miracles](https://modrinth.com/mod/weapons-of-miracles) — Works well with Patreon 2.0. 
- [FancyMenu](https://modrinth.com/mod/fancymenu)
- [Simple Voice Chat](https://modrinth.com/plugin/simple-voice-chat)

## ❌ **Incompatible mods**

- [lazyyyyy](https://modrinth.com/mod/lazyyyyy) — There is
  a [known issue](https://github.com/SettingDust/lazyyyyy/issues/88)
  that causes the game to freeze when using the YACL config screen of Controlify.
  Consider trying [this workaround](https://github.com/SettingDust/lazyyyyy/issues/88#issuecomment-3532622474) to fix.

## 🐞 Bug Reports

This **is not an official port**, so any issues **should not be reported** to the original project.  
Please [**submit them to this GitHub repository**](https://github.com/EchoEllet/Controlify/issues) instead.

Note that we do **not** plan to add any features such as Controlify split-screen integration.

## 🧰 Maintenance

Many mods still target Forge 1.20.1. This port makes Controlify usable in those modpacks,
though support will eventually end once most mods move to NeoForge.

> We recommend starting to adapt to NeoForge or Fabric to avoid breakage, as Controlify only supports those platforms.
> We did not focus much on code quality or work polish.  
> That said, the port was not entirely straightforward and still required testing, effort, and time.

## 🏆 Credits

This project is an **unofficial backport** based on the original work by [**isXander**](https://github.com/isXander).  
Without their valuable work, this port would not exist.

## ⚠️ Disclaimer

> **This mod is NOT AN OFFICIAL MINECRAFT PRODUCT.  
> It is NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.**
>
> **This port is not affiliated with the Controlify project authors OR [**isXander**](https://github.com/isXander).**
> The logo/icon of this port has been generated using AI.

## 📜 License

The [original Controlify project license](https://github.com/isXander/Controlify/blob/multiversion/dev/LICENSE) remains unchanged.

This branch was created
from [this Controlify commit](https://github.com/isXander/Controlify/commit/b468effcc388ccf6fd9d50e64d9e180f327fca53)
with changes for Forge 1.20.1.
