# CustomNPCsAPI
Work in progress, is used by scripting and mods who want to hook into CustomNPCs 1.8.9 or higher

## Howto use in a Mod
Basically just download the api code and include it in your mod. 

In your mod you can check if customnpcs is installed with `NpcAPI.IsAvailable()` 

To use the events, register your events with `NpcAPI.Instance().events().register(youreventclass)`

## Extra
JavaDocs go to http://www.kodevelopment.nl/customnpcs/api/
Discord for CustomNpcs Scripting/API go to https://discord.gg/2jZm88M
Discord for my mods in general go to https://discord.gg/0qZ6X3cHl8Pupttr