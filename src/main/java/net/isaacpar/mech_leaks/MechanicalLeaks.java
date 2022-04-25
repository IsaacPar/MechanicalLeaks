package net.isaacpar.mech_leaks;

import net.fabricmc.api.ModInitializer;

import net.isaacpar.mech_leaks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MechanicalLeaks implements ModInitializer {

	public static final String MOD_ID = "mech_leaks";
	public static final String MOD_NAME = "Mechanical Leaks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing!");

		ModItems.registerModItems();

	}
}
