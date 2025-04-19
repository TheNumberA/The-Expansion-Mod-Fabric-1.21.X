package net.thenumbera.theexpansionmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenumbera.theexpansionmod.TheExpansionMod;

public class ModItems {
    public static final Item BLUE_SAPPHIRE = registerItem("blue_sapphire", new Item(new Item.Settings()));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheExpansionMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheExpansionMod.LOGGER.info("Registering Mod Items for " + TheExpansionMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLUE_SAPPHIRE);
            entries.add(JADE);
        });
    }
}