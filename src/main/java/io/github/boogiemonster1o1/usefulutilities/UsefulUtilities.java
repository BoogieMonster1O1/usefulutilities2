package io.github.boogiemonster1o1.usefulutilities;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UsefulUtilities implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "usefulutilities";
    public static final String MOD_NAME = "Useful Utilities";

    @Override
    public void onInitialize() {
        log("Initializing Useful Utilities");
    }

    public static void log(String message){
        LOGGER.log(Level.INFO,message);
    }

}