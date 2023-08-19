package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTiers;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class CyanCopperHoe extends HoeItem {
    public CyanCopperHoe() {
        super(MrCTTiers.CYAN_COPPER, -1, -2.0F, new Item.Properties().durability(500).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
