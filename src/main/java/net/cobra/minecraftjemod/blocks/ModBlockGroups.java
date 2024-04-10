package net.cobra.minecraftjemod.blocks;

import net.cobra.minecraftjemod.MinecraftJEMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModBlockGroups {

    public static final ItemGroup RUBY_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MinecraftJEMod.MOD_ID, "ruby_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby_block"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.GREEN_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_PEARL);
                        entries.add(ModBlocks.RADIANT_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.GREEN_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_GREEN_SAPPHIRE_ORE);

                    }).build());

    public static void registerItemGroups() {
        MinecraftJEMod.LOGGER.info("Registering Block Groups for" + MinecraftJEMod.MOD_ID);
    }

}






