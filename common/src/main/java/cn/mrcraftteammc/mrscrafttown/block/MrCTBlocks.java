package cn.mrcraftteammc.mrscrafttown.block;

import cn.mrcraftteammc.mrscrafttown.block.custom.CommonBlock;
import cn.mrcraftteammc.mrscrafttown.block.custom.CustomBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    // Vanilla-Like MrCTBlocks
    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", CommonBlock::new);

    // Custom MrCTBlocks
    public static final RegistrySupplier<Block> CUSTOM_BLOCK = BLOCKS.register("custom_block", CustomBlock::new);

    // Load this.class
    public static void register() {
        BLOCKS.register();
    }
}
