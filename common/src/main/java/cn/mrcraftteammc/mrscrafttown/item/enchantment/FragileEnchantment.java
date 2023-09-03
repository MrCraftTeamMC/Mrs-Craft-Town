package cn.mrcraftteammc.mrscrafttown.item.enchantment;

import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FragileEnchantment extends MrCTBaseEnchantments {
    public FragileEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public Rarity getRarity() {
        return Enchantment.Rarity.UNCOMMON;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getMinCost(int level) {
        return 10 * level;
    }

    @Override
    public void doPostHurt(LivingEntity target, Entity attacker, int level) {
        if (attacker != null) {
            target.hurt(attacker.damageSources().thorns(attacker), level * 3.0f); // Debug
        }
    }

    @Override
    public boolean isCurse() {
        return true;
    }
}
