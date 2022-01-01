package net.adam.mccourse;

import net.fabricmc.api.ModInitializer;
import net.adam.mccourse.block.ModBlocks;
import net.adam.mccourse.block.entity.ModBlockEntities;
import net.adam.mccourse.enchantment.ModEnchantments;
import net.adam.mccourse.item.ModItems;
import net.adam.mccourse.painting.ModPaintings;
import net.adam.mccourse.recipe.ModRecipes;
import net.adam.mccourse.util.ModLootTableModifiers;
import net.adam.mccourse.util.ModRegistries;
import net.adam.mccourse.world.feature.ModConfiguredFeatures;
import net.adam.mccourse.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// A Comment
	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerAllEntities();

		ModEnchantments.registerModEnchantments();
		ModLootTableModifiers.modifyLootTables();

		ModRecipes.register();

		ModRegistries.registerModStuffs();
		ModPaintings.registerPaintings();

		ModWorldGen.generateModWorldGen();
	}
}
