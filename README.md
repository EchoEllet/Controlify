# 🎮 Controlify: Forgified

![Controlify - Controller support for Minecraft Java](https://raw.githubusercontent.com/isXander/Controlify/multiversion/dev/assets/controlify-banner.png)

A quick, simple, unofficial and dummy port of [Controlify](https://modrinth.com/mod/controlify), made for Forge 1.20.1.

The goal is to make it "just work" without crashes or critical issues. Use with caution—bugs, crashes, and missing
features are likely.

This port is based on [v2.1.2 for Fabric 1.20.1](https://modrinth.com/mod/controlify/version/gYWWawgz), with manual
backports of some changes from Controlify 2.4.2 and additional adjustments needed to make it work on MinecraftForge
platform.

> By "dummy port" we mean that we did not focus on code quality or work polish at all.  
> That said, the port was not entirely straightforward and still required testing, effort and time.

## 🐞 Bug Reports

This **is not an official port**, so any issues **should not be reported** to the original project.  
Please [**submit them to this GitHub repository**](https://github.com/EchoEllet/Controlify/issues) instead.

Note that we do **not** plan to add any features such as Controlify split-screen integration.

## 🧰 Maintenance

Controlify integration was added in [Epic Fight 21.13.3.2](https://modrinth.com/mod/epic-fight/version/21.13.3.2).  
The main issue is that this version targets NeoForge 1.21.1, while many Epic Fight addons and modpacks still use Forge
1.20.1. This port serves as a hacky workaround to enable controller support on Epic Fight Forge 1.20.1.

Once Epic Fight addons move to NeoForge 1.21.1, this port will be deprecated.

> This port does **not** include Epic Fight integration and does **not** require it—you can use it independently.
> We recommend starting to adapt to NeoForge or Fabric to avoid breakage, as Controlify only supports those platforms.

## 🏆 Credits

This project is an **unofficial backport** based on the original work by [**isXander**](https://github.com/isXander).  
Without their valuable work, this port would not exist.

## ⚠️ Disclaimer

> **This mod is NOT AN OFFICIAL MINECRAFT PRODUCT.  
> It is NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.**
>
> **This mod is not affiliated with the Controlify project authors OR [**isXander**](https://github.com/isXander).**

## 📜 License

The [original Controlify project license](https://github.com/isXander/Controlify/blob/multiversion/dev/LICENSE) remains unchanged.

This branch was created
from [this Controlify commit](https://github.com/isXander/Controlify/commit/b468effcc388ccf6fd9d50e64d9e180f327fca53)
with changes for Forge 1.20.1.
