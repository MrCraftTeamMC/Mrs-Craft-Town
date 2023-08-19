package cn.mrcraftteammc.mrscrafttown.item.items.glass;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class GlassShardItem extends Item {
    public GlassShardItem() {
        super(new Item.Properties().stacksTo(64).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
