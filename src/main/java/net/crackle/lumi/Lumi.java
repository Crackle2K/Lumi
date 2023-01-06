package net.crackle.lumi;

import net.crackle.lumi.block.ModBlocks;
import net.crackle.lumi.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lumi implements ModInitializer {
	public static final String MOD_ID = "lumi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}