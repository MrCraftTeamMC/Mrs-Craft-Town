package cn.mrcraftteammc.mrscrafttown.item.items.lapislazuli;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class LapisLazuliShardItem extends Item {
    public LapisLazuliShardItem() {
        super(new Item.Properties().stacksTo(64).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
