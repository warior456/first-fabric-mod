package net.matteo2678.firstmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.matteo2678.firstmod.FirstMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FIRSTMOD = FabricItemGroupBuilder.build(new Identifier(FirstMod.MOD_ID,"firstmod"),
            () -> new ItemStack(ModItems.HIHIHIHAW));
}
