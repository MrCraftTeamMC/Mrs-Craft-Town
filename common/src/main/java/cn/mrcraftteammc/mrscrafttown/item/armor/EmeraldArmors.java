package cn.mrcraftteammc.mrscrafttown.item.armor;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class EmeraldArmors extends ArmorItem {
    public EmeraldArmors(ArmorItem.Type type) {
        super(MrCTArmorMaterials.EMERALD, type, new Item.Properties().arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
