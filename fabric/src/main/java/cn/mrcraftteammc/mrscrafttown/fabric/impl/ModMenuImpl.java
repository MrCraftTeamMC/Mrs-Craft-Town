package cn.mrcraftteammc.mrscrafttown.fabric.impl;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import eu.midnightdust.lib.config.MidnightConfig;
import org.jetbrains.annotations.ApiStatus;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

@ApiStatus.Experimental
public class ModMenuImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> MidnightConfig.getScreen(parent, MOD_ID);
    }
}
