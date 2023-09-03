package cn.mrcraftteammc.mrscrafttown.item.tool;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MrCTBaseSwords extends SwordItem {
    public MrCTBaseSwords(Tier tier, int damage, float attackspeed, int defaultDurability, int durability) {
        super(tier, damage, attackspeed, new Item.Properties().defaultDurability(defaultDurability).durability(durability).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }

    public MrCTBaseSwords(Tier tier, int damage, float attackspeed, int durability) {
        super(tier, damage, attackspeed, new Item.Properties().defaultDurability(durability).durability(durability).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
