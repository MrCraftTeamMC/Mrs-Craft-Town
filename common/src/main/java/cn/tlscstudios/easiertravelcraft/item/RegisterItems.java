package cn.tlscstudios.easiertravelcraft.item;

import cn.tlscstudios.easiertravelcraft.util.Registers;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;

public class RegisterItems {
    // Vanilla Items
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = Registers.RegisterVanillaItem("example_item", 64);
}
