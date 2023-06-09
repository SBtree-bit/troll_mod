package net.sbtree.trollmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sbtree.trollmod.TrollMod;

public class ModItemGroup {
    public static final ItemGroup TROLL = FabricItemGroupBuilder.build(
            new Identifier(TrollMod.MOD_ID, "troll"), () -> new ItemStack(ModItems.TROLL_ESSENCE));
}
