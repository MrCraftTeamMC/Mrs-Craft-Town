package cn.tlscstudios.easiertravelcraft.util;

import cn.tlscstudios.easiertravelcraft.creativetab.EasierTravelCraftCreativeTab;
import cn.tlscstudios.easiertravelcraft.util.exception.ExperminalMethodException;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

@SuppressWarnings("all")
public class Registers {
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> VANILLA_BLOCKITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Block> VANILLA_BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    public static RegistrySupplier<Item> RegisterVanillaItem(@NotNull String name, int stackSize) {
        return VANILLA_ITEMS.register(new ResourceLocation(MOD_ID, name),
                () -> new Item(new Item.Properties().stacksTo(stackSize).arch$tab(EasierTravelCraftCreativeTab.EASIERTRAVELCRAFT_TAB)));
    }
    public static RegistrySupplier<Item> RegisterVanillaBlockItem(@NotNull String name, int stackSize, Supplier<Block> b) {
        return VANILLA_BLOCKITEMS.register(new ResourceLocation(MOD_ID, name),
                () -> new BlockItem(b.get(), new Item.Properties().stacksTo(stackSize).arch$tab(EasierTravelCraftCreativeTab.EASIERTRAVELCRAFT_TAB)));
    }
    @ApiStatus.Experimental
    public static String RegisterVanillaBlock(@NotNull String name) throws ExperminalMethodException {
        //return VANILLA_BLOCKS.register(new ResourceLocation(MOD_ID, name),
                //() -> new VanillaBlockTemplate());
        throw new ExperminalMethodException("This Method is Experminal Noww!");
    }

    public static final void register() {
        VANILLA_ITEMS.register();
        VANILLA_BLOCKITEMS.register();
    }
}
