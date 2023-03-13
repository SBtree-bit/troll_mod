package net.sbtree.trollmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sbtree.trollmod.TrollMod;

public class ModItems {

    public static final Item TROLL_ESSENCE = registerItem("troll_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.TROLL)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TrollMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TrollMod.LOGGER.debug("Registering Mod Items for " + TrollMod.MOD_ID);
    }
}
