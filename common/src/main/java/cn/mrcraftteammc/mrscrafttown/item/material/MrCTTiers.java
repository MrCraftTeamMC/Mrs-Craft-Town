package cn.mrcraftteammc.mrscrafttown.item.material;

import cn.mrcraftteammc.mrscrafttown.item.MrCTItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum MrCTTiers implements Tier {
    CYAN_COPPER(1, 500, 5.2F, 1.7F, 9, () -> {
        return Ingredient.of(new ItemLike[]{MrCTItems.CYAN_COPPER_ITEM.get()});
    }),
    YELLOW_COPPER(1, 350, 4.7F, 1.2F, 16, () -> {
        return Ingredient.of(new ItemLike[]{MrCTItems.YELLOW_COPPER_ITEM.get()});
    }),
    EMERALD(3, 940, 7.2F, 3.7F, 17, () -> {
        return Ingredient.of(new ItemLike[]{Items.EMERALD});
    }),
    REDSTONE(3, 1100, 6.8F, 3.5F, 12, () -> {
        return Ingredient.of(new ItemLike[]{Items.REDSTONE});
    }),
    LAPIS_LAZULI(2, 705, 6.5F, 2.4F, 21, () -> {
        return Ingredient.of(new ItemLike[]{Items.LAPIS_LAZULI});
    }),
    GLASS(2, 455, 6.8F, 2.1F, 18, () -> {
        return Ingredient.of(new ItemLike[]{Items.GLASS_PANE});
    }),
    AMETHYST_SHARD(3, 900, 7.4F, 3.2F, 20, () -> {
        return  Ingredient.of(new ItemLike[]{Items.AMETHYST_SHARD});
    }),
    STRING(1, 100, 1.5F, 1.0F, 3, () -> {
        return Ingredient.of(new ItemLike[]{Items.STRING});
    });

    public final int material_level;
    public final int material_uses;
    public final float material_speed;
    public final float material_damage;
    public final int material_enchantmentValue;
    public final LazyLoadedValue<Ingredient> material_repairIngredient;

    private MrCTTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier ItemSupplier) {
        this.material_level = level;
        this.material_uses = uses;
        this.material_speed = speed;
        this.material_damage = damage;
        this.material_enchantmentValue = enchantmentValue;
        this.material_repairIngredient = new LazyLoadedValue(ItemSupplier);
    }

    @Override
    public int getUses() {
        return this.material_uses;
    }

    @Override
    public float getSpeed() {
        return this.material_speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.material_damage;
    }

    @Override
    public int getLevel() {
        return this.material_level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.material_enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.material_repairIngredient.get();
    }
}
