package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class CyanCopperPickaxe extends PickaxeItem {
    public CyanCopperPickaxe() {
        super(Tiers.STONE, 1, -2.8F, new Item.Properties().stacksTo(1).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
