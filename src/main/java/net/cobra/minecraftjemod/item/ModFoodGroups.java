package net.cobra.minecraftjemod.item;

import net.cobra.minecraftjemod.MinecraftJEMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModFoodGroups {

    public static final ItemGroup PINEAPPLE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MinecraftJEMod.MOD_ID, "pineapple"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pineapple"))
                    .icon(() -> new ItemStack(ModItems.PINEAPPLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINEAPPLE);


                    }).build());

    public static void registerItemGroups() {
        MinecraftJEMod.LOGGER.info("Registering Food Groups for" + MinecraftJEMod.MOD_ID);
    }
}
