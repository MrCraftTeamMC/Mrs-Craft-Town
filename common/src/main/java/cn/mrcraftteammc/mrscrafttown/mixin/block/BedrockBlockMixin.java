package cn.mrcraftteammc.mrscrafttown.mixin.block;

import cn.mrcraftteammc.mrscrafttown.util.annotations.Testing;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Testing
@Mixin(Blocks.class)
public abstract class BedrockBlockMixin {
    private @Unique static final boolean open = true;
    /**
     * @author Mr_limr267
     * @reason Bruh
     * @Todo Add Breaking Things
     */
    @Overwrite
    public static Block register(String key, Block block) {
        if (!open) {
            if (key.equals("bedrock")) { // structure_void , barrier , command_block , debug_stick , light_block (Any Things in OP Tab)
                block = new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(300.0f, 5.0f).dropsLike(Blocks.BEDROCK).isValidSpawn(BedrockBlockMixin::mrsCraftTown$never));
            } else {
                return Registry.register(BuiltInRegistries.BLOCK, key, block);
            }
        }
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    private @Unique static Boolean mrsCraftTown$never(BlockState state, BlockGetter blockGetter, BlockPos pos, EntityType<?> entity) {
        return false;
    }
}
