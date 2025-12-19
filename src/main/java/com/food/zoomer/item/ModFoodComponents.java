package com.food.zoomer.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SWEET_FOOD_COMPONENT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent NOTHING = new FoodComponent.Builder().nutrition(0).saturationModifier(0.0f).alwaysEdible().build();
}
