package cn.mrcraftteammc.mrscrafttown.item.items.copper;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class CyanCopperItem extends Item {
    public CyanCopperItem() {
        super(new Item.Properties().stacksTo(64).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
