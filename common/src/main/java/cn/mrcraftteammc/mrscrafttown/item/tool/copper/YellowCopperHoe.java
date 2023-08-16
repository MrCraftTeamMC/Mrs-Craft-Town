package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tiers;

public class YellowCopperHoe extends HoeItem {
    public YellowCopperHoe() {
        super(Tiers.STONE, -1, -2.0F, new Properties().stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
