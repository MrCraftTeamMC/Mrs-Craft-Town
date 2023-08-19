package cn.mrcraftteammc.mrscrafttown.item.items.diamond;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class DiamondShardItem extends Item {
    public DiamondShardItem() {
        super(new Item.Properties().stacksTo(64).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
