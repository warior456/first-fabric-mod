package net.matteo2678.firstmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.matteo2678.firstmod.FirstMod;
import net.matteo2678.firstmod.block.custom.SpeedyBlock;
import net.matteo2678.firstmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block HIHIHIHAW_BLOCK = registerBlock("hihihihaw_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool()), ModItemGroup.FIRSTMOD);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(1).requiresTool()), ModItemGroup.FIRSTMOD);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return  Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        FirstMod.LOGGER.info("Registering Modblocks for" + FirstMod.MOD_ID);
    }
}
