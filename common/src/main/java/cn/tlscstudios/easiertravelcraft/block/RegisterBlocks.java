package cn.tlscstudios.easiertravelcraft.block;

import com.tterrag.registrate.util.entry.BlockEntry;

import static cn.tlscstudios.easiertravelcraft.util.Registers.REGISTRATE;

public class RegisterBlocks {

    // Vanilla-Like Blocks

    // Custom Blocks
    public static final BlockEntry<ExampleBlock> EXAMPLE_BLOCK = REGISTRATE.block("example_block", ExampleBlock::new).register();

    public static void register() {}
}
