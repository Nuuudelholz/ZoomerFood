package com.food.zoomer.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.sound.SoundEvents;

public class ModConsumableComponents {
    public static final ConsumableComponent GREEN_MONSTER_CONSUMABLE_COMPONENT = ConsumableComponent.builder().useAction(UseAction.DRINK).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeParticles(false)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0)))
            .build();
    public static final ConsumableComponent WHITE_MONSTER_CONSUMABLE_COMPONENT = ConsumableComponent.builder().useAction(UseAction.DRINK).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeParticles(false)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0)))
            .build();
    public static final ConsumableComponent BLUE_MONSTER_CONSUMABLE_COMPONENT = ConsumableComponent.builder().useAction(UseAction.DRINK).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeParticles(false)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200, 0)))
            .build();
    public static final ConsumableComponent YELLOW_MONSTER_CONSUMABLE_COMPONENT = ConsumableComponent.builder().useAction(UseAction.DRINK).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeParticles(false)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0)))
            .build();
}
