package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public class YellowCopperPickaxe extends PickaxeItem {
    public YellowCopperPickaxe() {
        super(Tiers.STONE, 1, -2.8F, new Item.Properties().durability(350).stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
