package cn.mrcraftteammc.mrscrafttown.item.armor;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class QuartzArmors extends ArmorItem {
    public QuartzArmors(ArmorItem.Type type) {
        super(MrCTArmorMaterials.QUARTZ, type, new Item.Properties().arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
