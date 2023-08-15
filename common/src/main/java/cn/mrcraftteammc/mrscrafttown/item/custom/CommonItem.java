package cn.mrcraftteammc.mrscrafttown.item.custom;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class CommonItem extends Item {

    public CommonItem() {
        super(new Item.Properties()
                .stacksTo(64)
                .arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
