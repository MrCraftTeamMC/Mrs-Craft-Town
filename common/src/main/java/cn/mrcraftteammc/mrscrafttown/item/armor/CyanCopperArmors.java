package cn.mrcraftteammc.mrscrafttown.item.armor;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class CyanCopperArmors extends ArmorItem {
    public CyanCopperArmors(ArmorItem.Type type) {
        super(MrCTArmorMaterials.CYAN_COPPER, type, new Item.Properties().arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
