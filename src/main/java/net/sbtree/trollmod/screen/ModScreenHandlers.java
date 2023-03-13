package net.sbtree.trollmod.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<TrollingTableScreenHandler> TROLLING_TABLE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        TROLLING_TABLE_SCREEN_HANDLER = new ScreenHandlerType<>(TrollingTableScreenHandler::new);
    }
}
