package cn.mrcraftteammc.mrscrafttown.item.tool.copper;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

public class YellowCopperIngot extends Item {
    public YellowCopperIngot() {
        super(new Item.Properties().stacksTo(64).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
