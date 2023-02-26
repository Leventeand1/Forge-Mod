package net.leventeand1.items;

import net.leventeand1.TestMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SuspiciousApple extends Item {
    public SuspiciousApple() {
        super(new Item.Properties()
                .group(TestMod.TAB)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(1.0f)
                        .effect(new EffectInstance(Effects.NAUSEA, 1200, 3), 1)
                        .effect(new EffectInstance(Effects.HUNGER, 1200, 3), 1)
                        .effect(new EffectInstance(Effects.BLINDNESS, 1200, 3), 1)
                        .effect(new EffectInstance(Effects.HASTE, 1200, 3), 1)
                        .effect(new EffectInstance(Effects.SLOWNESS, 1200, 3), 1)
                        .setAlwaysEdible()
                        .build()));
    }
}
