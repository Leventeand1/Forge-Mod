package net.leventeand1.items;

import net.leventeand1.TestMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(TestMod.TAB));
    }
}
