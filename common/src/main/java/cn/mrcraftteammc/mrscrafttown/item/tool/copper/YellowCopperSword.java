package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class YellowCopperSword extends SwordItem {
    public YellowCopperSword() {
        super(Tiers.STONE, 3, -2.4F, new Properties().stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
