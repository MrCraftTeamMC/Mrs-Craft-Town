package cn.mrcraftteammc.mrscrafttown.item.items.caidan;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.DebugStickItem;
import net.minecraft.world.item.Item;

public class BugStickItem extends DebugStickItem {
    public BugStickItem() {
        super(new Item.Properties().arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
