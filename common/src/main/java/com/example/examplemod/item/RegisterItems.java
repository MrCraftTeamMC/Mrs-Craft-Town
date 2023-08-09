package com.example.examplemod.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static com.example.examplemod.ExampleMod.MOD_ID;

public class RegisterItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    /*
    //public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", ExampleItem::new);
    // In case, you can use this:
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register(new ResourceLocation(MOD_ID, "example_item"), ExampleItem::new);
    */
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register(new ResourceLocation(MOD_ID, "example_item"), ExampleItem::new);

    public static void register() {
        ITEMS.register(); //DeferredRegister的register方法需要在init阶段被调用
    }
}
