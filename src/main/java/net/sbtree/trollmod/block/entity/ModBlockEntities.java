package net.sbtree.trollmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sbtree.trollmod.TrollMod;
import net.sbtree.trollmod.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<TrollingBlockEntity> TROLLING_TABLE;

    public static void registerBlockEntities() {
        TROLLING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(TrollMod.MOD_ID, "trolling_table"),
                FabricBlockEntityTypeBuilder.create(TrollingBlockEntity::new,
                        ModBlocks.TROLLING_TABLE).build(null));
    }
}
