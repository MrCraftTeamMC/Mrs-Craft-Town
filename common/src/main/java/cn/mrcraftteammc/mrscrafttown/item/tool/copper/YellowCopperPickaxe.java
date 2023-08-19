package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class YellowCopperPickaxe extends PickaxeItem {
    public YellowCopperPickaxe() {
        super(MrCTTiers.YELLOW_COPPER, 1, -2.8F, new Item.Properties().durability(350).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
