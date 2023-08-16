package cn.mrcraftteammc.mrscrafttown.item.food.potato;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.food.MrCTFoodProperties.ZIPPED_POTATO_PROP;

public class ZippedPotatoItem extends Item {
    public ZippedPotatoItem() {
        super(new Item.Properties().stacksTo(64).food(ZIPPED_POTATO_PROP).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
