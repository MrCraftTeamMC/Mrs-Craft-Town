package cn.mrcraftteammc.mrscrafttown.item.armor;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTArmorMaterials;
import net.minecraft.world.item.ArmorItem;

public class YellowCopperArmors extends ArmorItem {
    public YellowCopperArmors(ArmorItem.Type type) {
        super(MrCTArmorMaterials.YELLOW_COPPER, type, new Properties().arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
