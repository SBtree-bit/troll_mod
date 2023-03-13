package net.sbtree.trollmod;

import net.fabricmc.api.ModInitializer;
import net.sbtree.trollmod.block.ModBlocks;
import net.sbtree.trollmod.block.entity.ModBlockEntities;
import net.sbtree.trollmod.item.ModItems;
import net.sbtree.trollmod.recipe.ModRecipes;
import net.sbtree.trollmod.screen.ModScreenHandlers;
import net.sbtree.trollmod.world.feature.ModConfiguredFeatures;
import net.sbtree.trollmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrollMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("trollmod");
	public static final String MOD_ID = "trollmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
	}
}
