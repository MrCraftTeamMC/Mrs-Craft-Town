package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public class YellowCopperPickaxe extends PickaxeItem {
    public YellowCopperPickaxe() {
        super(Tiers.STONE, 1, -2.8F, new Properties().stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
