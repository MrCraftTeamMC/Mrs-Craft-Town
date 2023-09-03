package cn.mrcraftteammc.mrscrafttown.item.material;

import cn.mrcraftteammc.mrscrafttown.item.MrCTItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum MrCTArmorMaterials implements ArmorMaterial {
    WOOL("wool", 3, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 1);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 2);
        enumMap.put(ArmorItem.Type.LEGGINGS, 1);
        enumMap.put(ArmorItem.Type.BOOTS, 1);
    }), 11, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.of(ItemTags.WOOL)),
    CYAN_COPPER("cyan_copper", 18, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.BOOTS, 2);
    }), 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.05f, () -> Ingredient.of(new ItemLike[]{MrCTItems.CYAN_COPPER_ITEM.get()})),
    YELLOW_COPPER("yellow_copper", 12, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
        enumMap.put(ArmorItem.Type.LEGGINGS, 4);
        enumMap.put(ArmorItem.Type.BOOTS, 2);
    }), 18, SoundEvents.ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.of(new ItemLike[]{MrCTItems.YELLOW_COPPER_ITEM.get()})),
    AMETHYST_SHARD("amethyst_shard", 23, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.BOOTS, 2);
    }), 20, SoundEvents.AMETHYST_BLOCK_STEP, 1.0f, 0.0f, () -> {
        return Ingredient.of(new ItemLike[]{Items.AMETHYST_SHARD});
    }),
    REDSTONE("redstone", 35, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 8);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.BOOTS, 3);
    }), 13, SoundEvents.REDSTONE_TORCH_BURNOUT, 2.45f, 0.05f, () -> {
        return Ingredient.of(new ItemLike[]{Items.REDSTONE});
    }),
    EMERALD("emerald", 28, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
        enumMap.put(ArmorItem.Type.LEGGINGS, 5);
        enumMap.put(ArmorItem.Type.BOOTS, 2);
    }), 21, SoundEvents.ARMOR_EQUIP_GOLD, 1.2f, 0.025f, () -> {
        return Ingredient.of(new ItemLike[]{Items.EMERALD});
    }),
    LAPIS_LAZULI("lapis_lazuli", 30, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
        enumMap.put(ArmorItem.Type.LEGGINGS, 5);
        enumMap.put(ArmorItem.Type.BOOTS, 3);
    }), 21, SoundEvents.ARMOR_EQUIP_GOLD, 0.9f, 0.005f, () -> {
        return Ingredient.of(new ItemLike[]{Items.LAPIS_LAZULI});
    }),
    QUARTZ("quartz", 35, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 8);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.BOOTS, 3);
    }), 17, SoundEvents.ARMOR_EQUIP_GOLD, 2.55f, 0.07f, () -> {
        return Ingredient.of(new ItemLike[]{Items.QUARTZ});
    }),
    GLASS("glass", 18, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
        enumMap.put(ArmorItem.Type.LEGGINGS, 5);
        enumMap.put(ArmorItem.Type.BOOTS, 3);
    }), 19, SoundEvents.ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> {
        return Ingredient.of(new ItemLike[]{Items.GLASS});
    }),
    OBSIDIAN("obsidian", 100, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 5);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 10);
        enumMap.put(ArmorItem.Type.LEGGINGS, 8);
        enumMap.put(ArmorItem.Type.BOOTS, 5);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 10.0f, 0.5f, () -> {
        return Ingredient.of(new ItemLike[]{Items.OBSIDIAN});
    }),
    BEDROCK("bedrock", 200000000, Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.HELMET, 100);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 100);
        enumMap.put(ArmorItem.Type.LEGGINGS, 100);
        enumMap.put(ArmorItem.Type.BOOTS, 100);
    }), 100, SoundEvents.ARMOR_EQUIP_NETHERITE, 20.0f, 1.0f, () -> {
        return Ingredient.of(new ItemLike[]{Items.BEDROCK});
    });

    private final String armor_name;
    private final int armor_durabilityMultiplier;
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.BOOTS, 13);
        enumMap.put(ArmorItem.Type.LEGGINGS, 15);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 16);
        enumMap.put(ArmorItem.Type.HELMET, 11);
    });
    private final EnumMap<ArmorItem.Type, Integer> armor_protectionFunctionForType;
    private final int armor_enchantmentValue;
    private final SoundEvent armor_sound;
    private final float armor_toughness;
    private final float armor_knockbackResistance;
    private final LazyLoadedValue<Ingredient> armor_repairIngredient;

    private MrCTArmorMaterials(String name, int durabilityMultiplier, EnumMap enumMap, int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> supplier) {
        this.armor_name = name;
        this.armor_durabilityMultiplier = durabilityMultiplier;
        this.armor_protectionFunctionForType = enumMap;
        this.armor_enchantmentValue = enchantmentValue;
        this.armor_sound = soundEvent;
        this.armor_toughness = toughness;
        this.armor_knockbackResistance = knockbackResistance;
        this.armor_repairIngredient = new LazyLoadedValue<Ingredient>(supplier);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return HEALTH_FUNCTION_FOR_TYPE.get(type) * this.armor_durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.armor_protectionFunctionForType.get(type);
    }

    @Override
    public int getEnchantmentValue() {
        return this.armor_enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.armor_sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.armor_repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.armor_name;
    }

    @Override
    public float getToughness() {
        return this.armor_toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.armor_knockbackResistance;
    }
}
