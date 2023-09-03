package cn.mrcraftteammc.mrscrafttown.item.tool;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class MrCTBasePickaxes extends PickaxeItem {
    public MrCTBasePickaxes(Tier tier, int damage, float attackspeed, int defaultDurability, int durability) {
        super(tier, damage, attackspeed, new Item.Properties().defaultDurability(defaultDurability).durability(durability).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }

    public MrCTBasePickaxes(Tier tier, int damage, float attackspeed, int durability) {
        super(tier, damage, attackspeed, new Item.Properties().defaultDurability(durability).durability(durability).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
