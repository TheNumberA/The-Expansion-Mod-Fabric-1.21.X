package net.thenumbera.theexpansionmod;

import net.fabricmc.api.ModInitializer;

import net.thenumbera.theexpansionmod.block.ModBlocks;
import net.thenumbera.theexpansionmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheExpansionMod implements ModInitializer {
	public static final String MOD_ID = "theexpansionmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}