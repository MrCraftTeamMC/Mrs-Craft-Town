package cn.mrcraftteammc.mrscrafttown.item.armor;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTArmorMaterials;
import net.minecraft.world.item.ArmorItem;

public class WoolArmors extends ArmorItem {
    public WoolArmors(ArmorItem.Type type) {
        super(MrCTArmorMaterials.WOOL, type, new Properties().arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
