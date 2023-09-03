package cn.mrcraftteammc.mrscrafttown.block.blocks.poi;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ReStonedCraftingTable extends CraftingTableBlock {
    public ReStonedCraftingTable() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(2.0f));
    }
}
