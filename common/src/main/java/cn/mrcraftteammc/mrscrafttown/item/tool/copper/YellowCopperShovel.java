package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tiers;

public class YellowCopperShovel extends ShovelItem {
    public YellowCopperShovel() {
        super(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().durability(350).stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
