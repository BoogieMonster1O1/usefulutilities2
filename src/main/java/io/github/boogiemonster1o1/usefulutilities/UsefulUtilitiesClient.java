package io.github.boogiemonster1o1.usefulutilities;

import net.fabricmc.api.ClientModInitializer;

import static io.github.boogiemonster1o1.usefulutilities.UsefulUtilities.log;

public class UsefulUtilitiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        log("Initializing");
    }
}
