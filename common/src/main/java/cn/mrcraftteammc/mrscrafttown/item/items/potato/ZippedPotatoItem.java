package cn.mrcraftteammc.mrscrafttown.item.items.potato;

import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ZippedPotatoItem extends Item {
    public static final FoodProperties ZIPPED_POTATO_PROP = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();

    public ZippedPotatoItem() {
        super(new Item.Properties().stacksTo(64).food(ZIPPED_POTATO_PROP).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
