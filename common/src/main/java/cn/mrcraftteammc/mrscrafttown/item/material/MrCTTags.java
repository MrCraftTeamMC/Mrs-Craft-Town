package cn.mrcraftteammc.mrscrafttown.item.material;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTTags {
    public static final TagKey<Block> COPPER = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "copper"));
}
