# creeper-no-grief

A tiny Paper plugin: creeper explosions no longer break blocks, item frames or paintings.
The explosion still happens and still damages players and mobs. Everything else
(TNT, withers, ghasts, endermen, villager farming) behaves normally, so the
`mob_griefing` game rule can stay on.

## Install

Download the latest build:

```
https://github.com/angelocordon/creeper-no-grief/releases/latest/download/creeper-no-grief.jar
```

With the `itzg/minecraft-server` image, add that URL to `PLUGINS`.

## Release

Push a tag like `v1.0.0`. GitHub Actions builds the jar and attaches it to a release.
