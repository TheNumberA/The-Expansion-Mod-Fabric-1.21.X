package net.thenumbera.theexpansionmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenumbera.theexpansionmod.TheExpansionMod;

public class ModBlocks {
    public static final Block BLUE_SAPPHIRE_BLOCK = registerBlock("blue_sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()))

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheExpansionMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheExpansionMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheExpansionMod.LOGGER.info("Registering Mod Blocks for " + TheExpansionMod.MOD_ID);
    }
}
