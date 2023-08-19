package cn.mrcraftteammc.mrscrafttown.item.items.emerald;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class EmeraldShardItem extends Item {
    public EmeraldShardItem() {
        super(new Item.Properties().stacksTo(64).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
