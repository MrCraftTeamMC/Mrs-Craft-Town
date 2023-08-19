package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class YellowCopperSword extends SwordItem {
    public YellowCopperSword() {
        super(MrCTTiers.YELLOW_COPPER, 3, -2.4F, new Item.Properties().durability(350).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
