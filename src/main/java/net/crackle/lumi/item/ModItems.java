package net.crackle.lumi.item;

import net.crackle.lumi.Lumi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item FORNACITE = registerItem("fornacite",
            new Item(new FabricItemSettings().group(ModItemGroup.FORNACITE)));
    public static Item NOVA_ORB = registerItem("nova_orb",
            new Item(new FabricItemSettings().group(ModItemGroup.FORNACITE)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Lumi.MOD_ID, name), item);
    }

   public static void registerModItems() {
       Lumi.LOGGER.debug("Registering Mod Items For " + Lumi.MOD_ID);
   }
}
