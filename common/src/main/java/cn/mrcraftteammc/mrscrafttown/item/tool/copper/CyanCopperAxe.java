package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class CyanCopperAxe extends AxeItem {
    public CyanCopperAxe() {
        super(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().durability(500).stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
