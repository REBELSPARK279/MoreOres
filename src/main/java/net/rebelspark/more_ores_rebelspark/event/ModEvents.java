package net.rebelspark.more_ores_rebelspark.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.item.ModItems;
import net.rebelspark.more_ores_rebelspark.villager.ModVillagers;

import java.util.List;

@Mod.EventBusSubscriber(modid = MoreOres.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.TITANIUM_SWORD.get(), 1),
                    4, 18, 0.04f));


        }
            if(event.getType() == ModVillagers.SPLUNKER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.TORCH, 24),
                        16, 2, 0));
                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.LANTERN, 6),
                        10, 3, 0.0125f));
                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.GLOW_BERRIES, 32),
                        6, 5, 0.01f));
                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.IRON_INGOT, 5),
                        new ItemStack(Items.EMERALD, 1),
                        10, 3, 0.02f));
                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_INGOT, 5),
                        new ItemStack(Items.EMERALD, 2),
                        10, 3, 0.02f));
                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 9),
                        new ItemStack(ModItems.TITANIUM_PICKAXE.get(), 1),
                        4, 17, 0.045f));
                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(Items.CAMPFIRE, 1),
                        16, 1, 0));
                trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 19),
                        new ItemStack(Items.DIAMOND_PICKAXE, 1),
                        4, 24, 0.1f));
                
            }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 4),
                new ItemStack(ModItems.TOPAZ_GEMSTONE.get(), 1),
                9, 3, 0.1f));


    }

}
