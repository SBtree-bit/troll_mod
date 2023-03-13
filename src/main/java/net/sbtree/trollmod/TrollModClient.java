package net.sbtree.trollmod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.sbtree.trollmod.screen.ModScreenHandlers;
import net.sbtree.trollmod.screen.TrollingTableScreen;

public class TrollModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.TROLLING_TABLE_SCREEN_HANDLER, TrollingTableScreen::new);
    }
}
