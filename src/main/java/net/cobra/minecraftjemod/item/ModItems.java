package net.cobra.minecraftjemod.item;
import net.cobra.minecraftjemod.MinecraftJEMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RADIANT = registerItem("radiant", new Item(new FabricItemSettings()));
    public static final Item RED_PEARL = registerItem("red_pearl", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(new FabricItemSettings()));
    public static final Item WHITE_PEARL = registerItem("white_pearl", new Item(new FabricItemSettings()));
    public static final Item GREEN_PEARL = registerItem("green_pearl", new Item(new FabricItemSettings()));
    public static final Item BLUE_PEARL = registerItem("blue_pearl", new Item(new FabricItemSettings()));
    public static final Item YELLOW_PEARL = registerItem("yellow_pearl", new Item(new FabricItemSettings()));
    public static final Item PURPLE_PEARL = registerItem("purple_pearl", new Item(new FabricItemSettings()));
    public static final Item PINK_PEARL = registerItem("pink_pearl", new Item(new FabricItemSettings()));
    public static final Item ORANGE_PEARL = registerItem("orange_pearl", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_PEARL = registerItem("golden_pearl", new Item(new FabricItemSettings()));
    public static final Item CRACKED_PEARL = registerItem("cracked_pearl", new Item(new FabricItemSettings()));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RADIANT);
        entries.add(RED_PEARL);
        entries.add(WHITE_PEARL);
        entries.add(GREEN_PEARL);
        entries.add(BLUE_PEARL);
        entries.add(YELLOW_PEARL);
        entries.add(PURPLE_PEARL);
        entries.add(PINK_PEARL);
        entries.add(ORANGE_PEARL);
        entries.add(GOLDEN_PEARL);
        entries.add(CRACKED_PEARL);
        entries.add(RUBY);
        entries.add(SAPPHIRE);
        entries.add(GREEN_SAPPHIRE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MinecraftJEMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinecraftJEMod.LOGGER.info("Registering Mod Items for" + MinecraftJEMod.MOD_ID);


    }

}
