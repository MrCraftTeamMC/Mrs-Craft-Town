package cn.mrcraftteammc.mrscrafttown.block;

import cn.mrcraftteammc.mrscrafttown.block.blocks.caidan.ChenMouRenLou233Block;
import cn.mrcraftteammc.mrscrafttown.block.blocks.caidan.MrLimr267Block;
import cn.mrcraftteammc.mrscrafttown.block.blocks.caidan.MrZmh5Block;
import cn.mrcraftteammc.mrscrafttown.block.blocks.wood.EbonyBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> MR_ZMH5_BLOCK = BLOCKS.register("mr_zmh5_block", MrZmh5Block::new);
    public static final RegistrySupplier<Block> CHEN_MOU_REN_LOU233_BLOCK = BLOCKS.register("chen_mou_ren_lou233_block", ChenMouRenLou233Block::new);
    public static final RegistrySupplier<Block> MR_LIMR267_BLOCK = BLOCKS.register("mr_limr267_block", MrLimr267Block::new);
    public static final RegistrySupplier<Block> EBONY_BLOCK = BLOCKS.register("ebony_block", EbonyBlock::new);

    // Load this.class
    public static void register() {
        BLOCKS.register();
    }
}
