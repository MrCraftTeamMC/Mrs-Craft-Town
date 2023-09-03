package cn.mrcraftteammc.mrscrafttown.mixin.item;

import cn.mrcraftteammc.mrscrafttown.util.annotations.Testing;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Testing
@Mixin(Items.class)
public abstract class SugarItemMixin {
    /**
     * @author Mr_limr267
     * @reason Bruh
     */
    @Overwrite
    public static Item registerItem(String key, Item item) {
        if (key.equals("suagr")) {
            item = new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().fast().nutrition(1).saturationMod(0.0f).build()));
        }
        return Items.registerItem(new ResourceLocation(key), item);
    }
}
