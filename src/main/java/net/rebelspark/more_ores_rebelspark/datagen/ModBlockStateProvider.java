package net.rebelspark.more_ores_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreOres.MOD_ID, exFileHelper);
    }

    //REGISTER BLOCKS HERE VVV

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANIUM_ORE);

        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);

        blockWithItem(ModBlocks.STEEL_BLOCK);

        simpleBlockWithItem(ModBlocks.REFINERY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/refinery")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

