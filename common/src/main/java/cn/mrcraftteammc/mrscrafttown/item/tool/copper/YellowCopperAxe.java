package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class YellowCopperAxe extends AxeItem {
    public YellowCopperAxe() {
        super(MrCTTiers.YELLOW_COPPER, 7.0F, -3.2F, new Item.Properties().durability(350).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
