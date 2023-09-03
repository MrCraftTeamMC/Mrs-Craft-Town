package cn.mrcraftteammc.mrscrafttown.item.material;

import cn.mrcraftteammc.mrscrafttown.item.MrCTItems;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum MrCTTiers implements Tier {
    CYAN_COPPER(1, 500, 5.2F, 1.7F, 9, () -> {
        return Ingredient.of(new ItemLike[]{MrCTItems.CYAN_COPPER_ITEM.get()});
    }),
    YELLOW_COPPER(1, 350, 4.7F, 1.2F, 18, () -> {
        return Ingredient.of(new ItemLike[]{MrCTItems.YELLOW_COPPER_ITEM.get()});
    }),
    EMERALD(3, 995, 7.2F, 3.7F, 21, () -> {
        return Ingredient.of(new ItemLike[]{Items.EMERALD});
    }),
    REDSTONE(4, 2000, 6.8F, 3.5F, 13, () -> {
        return Ingredient.of(new ItemLike[]{Items.REDSTONE});
    }),
    LAPIS_LAZULI(2, 1040, 6.5F, 2.4F, 21, () -> {
        return Ingredient.of(new ItemLike[]{Items.LAPIS_LAZULI});
    }),
    GLASS(2, 455, 6.8F, 2.1F, 19, () -> {
        return Ingredient.of(new ItemLike[]{Items.GLASS_PANE});
    }),
    AMETHYST_SHARD(3, 900, 7.4F, 3.2F, 20, () -> {
        return Ingredient.of(new ItemLike[]{Items.AMETHYST_SHARD});
    }),
    WOOL(1, 100, 1.5F, 1.0F, 3, () -> {
        return Ingredient.of(ItemTags.WOOL);
    }),
    QUARTZ(4, 2000, 6.3F, 4.0F, 17, () -> {
        return Ingredient.of(new ItemLike[]{Items.QUARTZ});
    }),
    OBSIDIAN(4, 1000000, 15.0F, 10.0F, 30, () -> {
        return Ingredient.of(new ItemLike[]{Items.OBSIDIAN});
    }),
    BEDROCK(4, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 100, () -> {
        return Ingredient.of(new ItemLike[]{Items.BEDROCK});
    }); // NBTs

    private final int material_level;
    private final int material_uses;
    private final float material_speed;
    private final float material_damage;
    private final int material_enchantmentValue;
    private final LazyLoadedValue<Ingredient> material_repairIngredient;

    private MrCTTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> supplier) {
        this.material_level = level;
        this.material_uses = uses; // 耐久
        this.material_speed = speed;
        this.material_damage = damage;
        this.material_enchantmentValue = enchantmentValue;
        this.material_repairIngredient = new LazyLoadedValue(supplier);
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
