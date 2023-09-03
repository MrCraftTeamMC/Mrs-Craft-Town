package cn.mrcraftteammc.mrscrafttown.block;

import cn.mrcraftteammc.mrscrafttown.block.blockentity.MrCTBlockEntitiesTypes;
import cn.mrcraftteammc.mrscrafttown.block.blocks.MrCTBaseBlocks;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> MR_ZMH5_BLOCK = BLOCKS.register("mr_zmh5_block", () -> new MrCTBaseBlocks(MapColor.COLOR_BLACK, NoteBlockInstrument.BELL, 2.0F, 3.5F, SoundType.ANVIL));
    public static final RegistrySupplier<Block> CHEN_MOU_REN_LOU233_BLOCK = BLOCKS.register("chen_mou_ren_lou233_block", () -> new MrCTBaseBlocks(MapColor.COLOR_GREEN, NoteBlockInstrument.BELL, 2.0F, 3.5F, SoundType.BAMBOO));
    public static final RegistrySupplier<Block> MR_LIMR267_BLOCK = BLOCKS.register("mr_limr267_block", () -> new MrCTBaseBlocks(MapColor.COLOR_LIGHT_BLUE, NoteBlockInstrument.BELL, 2.0F, 3.5F, SoundType.STONE));
    public static final RegistrySupplier<Block> LIAN_GUI_114_BA_BLOCK = BLOCKS.register("lian_gui_114_ba", () -> new MrCTBaseBlocks(MapColor.COLOR_YELLOW, NoteBlockInstrument.BELL, 2.0F, 3.5F, SoundType.BONE_BLOCK));

    public static final RegistrySupplier<Block> EBONY_BLOCK = BLOCKS.register("ebony_block", () -> new MrCTBaseBlocks(MapColor.WOOD, NoteBlockInstrument.BASS, 2.5f, 2.5f, SoundType.WOOD));

    // Load this.class
    public static void register() {
        MrCTBlockEntities.register();
        MrCTPoiBlocks.register();

        BLOCKS.register();
    }
}
