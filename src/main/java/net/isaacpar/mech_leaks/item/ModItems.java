package net.isaacpar.mech_leaks.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ModItems {

    public static final String MOD_ID = "mech_leaks";
    public static final String MOD_NAME = "Mechanical Leaks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static final Item IRON_MECH = new Item(new Item.Settings().group(ItemGroup.TRANSPORTATION));

    public static void registerModItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_mech"), IRON_MECH);

        LOGGER.info("Creating and registering items");
    }

}
