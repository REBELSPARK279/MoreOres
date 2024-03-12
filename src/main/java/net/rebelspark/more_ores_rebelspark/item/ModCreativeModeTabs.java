package net.rebelspark.more_ores_rebelspark.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreOres.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_ORES_TAB = CREATIVE_MODE_TABS.register("more_ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOPAZ_GEMSTONE.get()))
                    .title(Component.translatable("creativetab.more_ores_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TITANIUM_PIECE.get());
                        pOutput.accept(ModItems.TOPAZ_GEMSTONE.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_ROD.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ORE_BLOCKS = CREATIVE_MODE_TABS.register("ore_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TITANIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.ore_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> ORES = CREATIVE_MODE_TABS.register("ores",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TITANIUM_ORE.get()))
                    .title(Component.translatable("creativetab.ores"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.TITANIUM_ORE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WEAPONS_AND_TOOLS = CREATIVE_MODE_TABS.register("weapons_and_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_PICKAXE.get()))
                    .title(Component.translatable("creativetab.weapons_and_tools"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TITANIUM_SWORD.get());
                        pOutput.accept(ModItems.TITANIUM_PICKAXE.get());
                        pOutput.accept(ModItems.TITANIUM_AXE.get());
                        pOutput.accept(ModItems.TITANIUM_SHOVEL.get());
                        pOutput.accept(ModItems.TITANIUM_HOE.get());

                        pOutput.accept(ModItems.COPPER_SWORD.get());
                        pOutput.accept(ModItems.COPPER_PICKAXE.get());
                        pOutput.accept(ModItems.COPPER_AXE.get());
                        pOutput.accept(ModItems.COPPER_SHOVEL.get());
                        pOutput.accept(ModItems.COPPER_HOE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ARMOUR = CREATIVE_MODE_TABS.register("armour",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.armour"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TITANIUM_HELMET.get());
                        pOutput.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.TITANIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.TITANIUM_BOOTS.get());

                        pOutput.accept(ModItems.COPPER_HELMET.get());
                        pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                        pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                        pOutput.accept(ModItems.COPPER_BOOTS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> DISCS = CREATIVE_MODE_TABS.register("more_discs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.more_discs"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CASTLEMANIA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ARIA_MATH_MUSIC_DISC.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
