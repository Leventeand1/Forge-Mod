package net.leventeand1;

import net.leventeand1.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class Tags {
    ResourceLocation myTagId = new ResourceLocation(TestMod.MOD_ID, "gems");
    Item testItem = RegistryHandler.RUBY.get();
    boolean isInGroup = ItemTags.getCollection().getOrCreate(myTagId).contains(testItem);
}
