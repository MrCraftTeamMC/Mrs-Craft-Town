package cn.tlscstudios.easiertravelcraft.block;

import cn.tlscstudios.easiertravelcraft.block.custom.CommonBlock;
import cn.tlscstudios.easiertravelcraft.block.custom.CustomBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

public class ETCBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);

    // Vanilla-Like ETCBlocks
    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", CommonBlock::new);

    // Custom ETCBlocks
    public static final RegistrySupplier<Block> CUSTOM_BLOCK = BLOCKS.register("custom_block", CustomBlock::new);

    // Load this.class
    public static void register() {
        BLOCKS.register();
    }
}
