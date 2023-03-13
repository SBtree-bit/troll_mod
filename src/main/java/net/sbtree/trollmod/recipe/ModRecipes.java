package net.sbtree.trollmod.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sbtree.trollmod.TrollMod;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(TrollMod.MOD_ID, TrollingTableRecipe.Serializer.ID),
                TrollingTableRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(TrollMod.MOD_ID, TrollingTableRecipe.Type.ID),
                TrollingTableRecipe.Type.INSTANCE);
    }
}
