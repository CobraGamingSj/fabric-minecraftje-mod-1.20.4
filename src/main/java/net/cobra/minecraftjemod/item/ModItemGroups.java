package net.cobra.minecraftjemod.item;

import net.cobra.minecraftjemod.MinecraftJEMod;
import net.cobra.minecraftjemod.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MinecraftJEMod.MOD_ID, "ruby"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                    entries.add(ModItems.RADIANT);
                    entries.add(ModItems.RED_PEARL);
                    entries.add(ModItems.WHITE_PEARL);
                    entries.add(ModItems.YELLOW_PEARL);
                    entries.add(ModItems.BLUE_PEARL);
                    entries.add(ModItems.GREEN_PEARL);
                    entries.add(ModItems.PURPLE_PEARL);
                    entries.add(ModItems.PINK_PEARL);
                    entries.add(ModItems.ORANGE_PEARL);
                    entries.add(ModItems.GOLDEN_PEARL);
                    entries.add(ModItems.CRACKED_PEARL);
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.SAPPHIRE);
                    entries.add(ModItems.GREEN_SAPPHIRE);
                }).build());



    public static void registerItemGroups() {
        MinecraftJEMod.LOGGER.info("Registering Item Groups for" + MinecraftJEMod.MOD_ID);
    }
}
