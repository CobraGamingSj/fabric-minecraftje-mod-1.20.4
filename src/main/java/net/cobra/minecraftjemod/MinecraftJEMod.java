package net.cobra.minecraftjemod;

import net.cobra.minecraftjemod.blocks.ModBlockGroups;
import net.cobra.minecraftjemod.blocks.ModBlocks;
import net.cobra.minecraftjemod.item.ModFoodGroups;
import net.cobra.minecraftjemod.item.ModItemGroups;
import net.cobra.minecraftjemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftJEMod implements ModInitializer {
	public static final String MOD_ID = "minecraftje-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlockGroups.registerItemGroups();
		ModFoodGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}
