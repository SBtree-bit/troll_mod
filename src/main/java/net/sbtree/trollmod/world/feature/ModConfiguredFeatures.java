package net.sbtree.trollmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.sbtree.trollmod.TrollMod;
import net.sbtree.trollmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TROLL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TROLL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TROLL_ORE =
            ConfiguredFeatures.register("troll_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TROLL_ORES, 9));

    public static void registerConfiguredFeatures() {
        TrollMod.LOGGER.debug("Registering Mod Features for " + TrollMod.MOD_ID);
    }
}
