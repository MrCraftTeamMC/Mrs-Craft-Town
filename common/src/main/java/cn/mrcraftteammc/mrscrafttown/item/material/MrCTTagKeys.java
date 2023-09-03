package cn.mrcraftteammc.mrscrafttown.item.material;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTTagKeys {
    public static final TagKey<Item> COPPER_TOOL = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "copper_tool"));
    public static final TagKey<Item> COPPER_ARMOR = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "copper_armor"));
    public static final TagKey<Block> EXTRA_WOOD = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "extra_wood"));
    public static final TagKey<Block> EXTRA_FURNACE = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "extra_furnace"));

    public static void register() {}
}
