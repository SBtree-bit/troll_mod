package net.sbtree.trollmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.sbtree.trollmod.TrollMod;
import net.sbtree.trollmod.block.custom.TrollingTableBlock;
import net.sbtree.trollmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block TROLL_ORE = registerBlock("troll_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TROLL);

    public static final Block TROLLING_TABLE = registerBlock("trolling_table",
            new TrollingTableBlock(FabricBlockSettings.of(Material.STONE).strength(4f).
                    requiresTool().nonOpaque()), ModItemGroup.TROLL);

    private static Block registerBlock (String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TrollMod.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem (String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(TrollMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TrollMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TrollMod.LOGGER.debug("Registering ModBlocks for " + TrollMod.MOD_ID);
    }
}
