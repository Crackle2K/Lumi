package net.crackle.lumi.block;

import net.crackle.lumi.Lumi;
import net.crackle.lumi.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block FORNACITE_BLOCK = registerBlock("fornacite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.FORNACITE);
    public static final Block FORNACITE_ORE = registerBlock("fornacite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.FORNACITE);
    public static final Block DEEPSLATE_FORNACITE_ORE = registerBlock("deepslate_fornacite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(7, 15)), ModItemGroup.FORNACITE);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
    registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Lumi.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Lumi.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Lumi.LOGGER.debug("Registering ModBlocks For " + Lumi.MOD_ID);
    }
}
