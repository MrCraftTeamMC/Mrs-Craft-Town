package cn.mrcraftteammc.mrscrafttown.block.blockentity;

import cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.be.DrawerBlockEntity;
import cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.be.LargeBoxBlockEntity;
import com.mojang.datafixers.types.Type;
import cn.mrcraftteammc.mrscrafttown.block.MrCTBlockEntities;
import cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.be.BoxBlockEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTBlockEntitiesTypes {
    public static Type<?> getType(@NotNull String id) {
        return (Type<?>) Util.fetchChoiceType(References.BLOCK_ENTITY, id);
    }

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<BoxBlockEntity>> BOX_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE.register("box_block_entity_type", () -> (BlockEntityType<BoxBlockEntity>) BlockEntityType.Builder.of(BoxBlockEntity::new, MrCTBlockEntities.BOX_BLOCK.get()).build(getType("box_block_entity_type")));
    public static final RegistrySupplier<BlockEntityType<LargeBoxBlockEntity>> LARGE_BOX_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE.register("large_box_block_entity_type", () ->  (BlockEntityType<LargeBoxBlockEntity>) BlockEntityType.Builder.of(LargeBoxBlockEntity::new, MrCTBlockEntities.LARGE_BOX_BLOCK.get()).build(getType("large_box_block_entity_type")));
    public static final RegistrySupplier<BlockEntityType<DrawerBlockEntity>> DRAWER_ENTITY_TYPE = BLOCK_ENTITY_TYPE.register("drawer_block_entity_type", () -> (BlockEntityType<DrawerBlockEntity>) BlockEntityType.Builder.of(DrawerBlockEntity::new, MrCTBlockEntities.DRAWER_BLOCK.get()).build(getType("drawer_block_entity_type")));

    public static void register() {
        BLOCK_ENTITY_TYPE.register();
    }
}
