package net.cobra.minecraftjemod.item;

import net.cobra.minecraftjemod.MinecraftJEMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.25f).build();


}
