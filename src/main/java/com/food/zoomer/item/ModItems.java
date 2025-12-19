package com.food.zoomer.item;

import com.food.zoomer.ZoomerFood;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import javax.swing.*;


public class ModItems {

    public static final Item KINDER_PINGUI = registerFoodItem("kinder_pingui", ModFoodComponents.SWEET_FOOD_COMPONENT);
    public static final Item MONSTER_GREEN = registerFoodItem("monster_green", ModFoodComponents.NOTHING, ModConsumableComponents.GREEN_MONSTER_CONSUMABLE_COMPONENT);
    public static final Item MONSTER_WHITE = registerFoodItem("monster_white", ModFoodComponents.NOTHING, ModConsumableComponents.WHITE_MONSTER_CONSUMABLE_COMPONENT);
    public static final Item MONSTER_BLUE = registerFoodItem("monster_blue", ModFoodComponents.NOTHING, ModConsumableComponents.BLUE_MONSTER_CONSUMABLE_COMPONENT);
    public static final Item MONSTER_YELLOW = registerFoodItem("monster_yellow", ModFoodComponents.NOTHING, ModConsumableComponents.YELLOW_MONSTER_CONSUMABLE_COMPONENT);

    private static Item registerFoodItem(String name, FoodComponent food, ConsumableComponent component) {
        Identifier id = Identifier.of(ZoomerFood.MOD_ID, name);

        Item item = new Item(
                new Item.Settings()
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), id))
                        .food(food, component)
        );

        return Registry.register(Registries.ITEM, id, item);
    }

    private static Item registerFoodItem(String name, FoodComponent food) {
        Identifier id = Identifier.of(ZoomerFood.MOD_ID, name);

        Item item = new Item(
                new Item.Settings()
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), id))
                        .food(food)
        );

        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        ZoomerFood.LOGGER.info("Registering Mod Items for " + ZoomerFood.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register(entries -> entries.add(KINDER_PINGUI));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register(entries -> entries.add(MONSTER_GREEN));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register(entries -> entries.add(MONSTER_WHITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register(entries -> entries.add(MONSTER_BLUE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register(entries -> entries.add(MONSTER_YELLOW));
    }
}
