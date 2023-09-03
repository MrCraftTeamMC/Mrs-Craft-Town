package cn.mrcraftteammc.mrscrafttown.item.tool;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class MrCTBaseChiselItem extends DiggerItem {
    public MrCTBaseChiselItem(float damage, float attackspeed, Tier tier, TagKey<Block> tagKey, int defaultDurability, int durability, Rarity rarity) {
        super(damage, attackspeed, tier, tagKey, new Item.Properties().defaultDurability(defaultDurability).durability(durability).rarity(rarity).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
