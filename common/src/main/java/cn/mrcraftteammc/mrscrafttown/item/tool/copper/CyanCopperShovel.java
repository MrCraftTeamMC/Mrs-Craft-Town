package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

public class CyanCopperShovel extends ShovelItem {
    public CyanCopperShovel() {
        super(MrCTTiers.CYAN_COPPER, 1.5F, -3.0F, new Item.Properties().durability(500).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
