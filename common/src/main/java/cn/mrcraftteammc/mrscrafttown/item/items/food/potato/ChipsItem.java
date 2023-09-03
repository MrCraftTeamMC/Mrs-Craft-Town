package cn.mrcraftteammc.mrscrafttown.item.items.food.potato;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.items.food.MrCTFoodProperties.CHIPS_PROPERTIES;

public class ChipsItem extends Item {
    public ChipsItem() {
        super(new Item.Properties().stacksTo(64).food(CHIPS_PROPERTIES).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
