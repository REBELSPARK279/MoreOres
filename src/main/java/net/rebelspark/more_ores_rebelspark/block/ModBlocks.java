package net.rebelspark.more_ores_rebelspark.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.custom.RefineryBlock;
import net.rebelspark.more_ores_rebelspark.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOres.MOD_ID);
//STARTS VVV
public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.COLOR_LIGHT_GRAY)));
public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                .strength(6f).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), UniformInt.of(2,5)));
public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                .strength(8f).requiresCorrectToolForDrops().mapColor(DyeColor.GRAY), UniformInt.of(3,5)));



    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(9f).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), UniformInt.of(1,2)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(11f).requiresCorrectToolForDrops().mapColor(DyeColor.GRAY), UniformInt.of(1,3)));

    public static final RegistryObject<Block> SPLUNKERS_TABLE = registerBlock("splunkers_table",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE).sound(SoundType.WOOD).mapColor(MapColor.COLOR_BROWN)));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REFINERY = registerBlock("refinery",
            () -> new RefineryBlock(BlockBehaviour.Properties.copy(Blocks.FURNACE).sound(SoundType.COPPER).mapColor(MapColor.COLOR_LIGHT_GRAY).noOcclusion()));

//ENDS ^^^
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
