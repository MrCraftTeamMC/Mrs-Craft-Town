package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tiers;

public class YellowCopperAxe extends AxeItem {
    public YellowCopperAxe() {
        super(Tiers.STONE, 7.0F, -3.2F, new Properties().stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
