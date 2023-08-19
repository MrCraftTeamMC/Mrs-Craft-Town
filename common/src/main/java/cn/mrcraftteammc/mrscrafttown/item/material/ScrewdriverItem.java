package cn.mrcraftteammc.mrscrafttown.item.material;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class ScrewdriverItem extends DiggerItem {
    public ScrewdriverItem(float f, float g, Tier tier, TagKey<Block> tagKey, int durability) {
        super(f, g, tier, tagKey, new Item.Properties().durability(durability).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
