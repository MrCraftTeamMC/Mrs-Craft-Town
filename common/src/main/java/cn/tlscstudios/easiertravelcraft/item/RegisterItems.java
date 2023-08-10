package cn.tlscstudios.easiertravelcraft.item;

import cn.tlscstudios.easiertravelcraft.creativetab.EasierTravelCraftCreativeTab;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static cn.tlscstudios.easiertravelcraft.util.Registers.REGISTRATE;

public class RegisterItems {
    static {
        REGISTRATE.creativeModeTab(() -> EasierTravelCraftCreativeTab.EASIERTRAVELCRAFT_TAB);
    }

    // Vanilla-Like Items
    public static final ItemEntry<Item> EXAMPLE_ITEM = REGISTRATE.item("example_item", Item::new).register();

    // Custom Items
    //public static final RegistryEntry<ExampleItem> EXAMPLE_ITEM = REGISTRATE.item("example_item", ExampleItem::new).register();

    // Load this.class
    public static void register() {}
}
