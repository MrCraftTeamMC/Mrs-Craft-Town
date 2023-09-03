package cn.mrcraftteammc.mrscrafttown.item.items;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class MrCTBaseItems extends Item {
    public MrCTBaseItems(int maxStackSize, Rarity rarity) {
        super(new Item.Properties().stacksTo(maxStackSize).rarity(rarity).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
