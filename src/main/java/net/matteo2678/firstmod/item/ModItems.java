package net.matteo2678.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.matteo2678.firstmod.FirstMod;
import net.matteo2678.firstmod.item.custom.DowsingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item HIHIHIHAW = registerItem("hihihihaw",
            new Item(new FabricItemSettings().group(ModItemGroup.FIRSTMOD)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.FIRSTMOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);
    }
}
