package io.github.trym25.wilder_end;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WilderEndMod implements ModInitializer {
	public static final String MOD_ID = "wilder_end";
    public static final Logger LOGGER = LoggerFactory.getLogger("wilder_end");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}