<center><div align="center">

<img height="100" src="src/main/resources/icon.png" width="100"/>

# Forgematica for NeoForge

Litematica unofficial NeoForge port.

<img alt="neoforge" height="56" src="https://raw.githubusercontent.com/KessokuTeaTime/badges-extra/main/assets/cozy/supported/neoforge_vector.svg">

<a href="https://modrinth.com/mod/mafglib">
<img alt="modrinth" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg">
</a>
<a href="https://www.curseforge.com/minecraft/mc-mods/mafglib">
<img alt="curseforge" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg">
</a>

</div></center>

Forgematica is a client-side Minecraft mod using NeoForge. It is more or less a re-creation of or a substitute for [Schematica](https://minecraft.curseforge.com/projects/schematica).

[Original Repo Readme](Original-README.md)

## How to use in Minecraft
See [litematica wiki](https://github.com/maruohon/litematica/wiki)

## Development

This mod use modrinth maven.

```gradle
repositories {
    maven { url 'https://api.modrinth.com/maven' }
}

dependencies {
    modImplementation "maven.modrinth:forgematica:${forgematica_version}"
}
```

or use KessokuTeaTime maven (only 0.4.1 and above)

```gradle
repositories {
    maven { url 'https://maven.kessokuteatime.work/releases' }
}

dependencies {
    modImplementation "team.cagayakegirls.forgematica:forgematica:${forgematica_version}"
}
```

> Note: "${forgematica_version}" can be found in [Modrinth](https://modrinth.com/mod/forgematica)

## Compiling
- Clone the repository
- Open a command prompt/terminal to the repository directory
- run 'gradlew build'
- The built jar file will be in build/libs/

## Credits
- [maruohon/litematica](https://github.com/maruohon/litematica)
- [sakura-ryoko/litematica](https://github.com/sakura-ryoko/litematica)