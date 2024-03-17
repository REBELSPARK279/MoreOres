package net.rebelspark.more_ores_rebelspark.datagen;

import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.ModBlocks;
import net.rebelspark.more_ores_rebelspark.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreOres.MOD_ID, existingFileHelper);
    }

    @Override
   protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.REFINERY.get()
                );


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );

       // this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
     //           .add(ModBlocks.???.get(),
     //
      //  );

   }
}
