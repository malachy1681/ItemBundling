////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////${cursor}
// ModItems.java
// Robert M. Baker | Created : 25DEC24 | Last Modified : 06JAN25 by Robert M. Baker
// Version : 1.0.0
// This is a source file for 'Item Bundling'; it defines the mod items registration class.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Package Specifier
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.qmxtech.itembundling.item;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Imports
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.function.Function;
import net.minecraft.util.Identifier;
import net.minecraft.registry.*;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.*;
import com.qmxtech.itembundling.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'ModItems' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class ModItems
{
// Public Access Members

	// Methods

		public static void initialize()
		{
			// Perform mod items registration logic.

				ItemBundling.LOGGER.info( ( "Registering items for mod '" + ItemBundling.MOD_ID + "' ..." ) );

				ItemGroupEvents.modifyEntriesEvent( ModItemGroups.getGroup( ModItemGroups.GroupID.Items ).key ).register( ( ( entries ) -> {
					for ( Item item : ITEMS )
						entries.add( item );
				} ) );
		}

// Private Access Members

	// Fields

		private static final Item[] ITEMS = {
			register( "pouch_beetroot_seeds", Item::new, ( new Item.Settings() ) ),
			register( "pouch_wheat_seeds", Item::new, ( new Item.Settings() ) ),
			register( "pouch_pumpkin_seeds", Item::new, ( new Item.Settings() ) ),
			register( "pouch_melon_seeds", Item::new, ( new Item.Settings() ) ),
			register( "pouch_torchflower_seeds", Item::new, ( new Item.Settings() ) ),
			register( "pouch_pitcher_pods", Item::new, ( new Item.Settings() ) ),
			register( "crate_acacia_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_birch_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_cherry_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_jungle_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_mangrove_propagules", Item::new, ( new Item.Settings() ) ),
			register( "crate_oak_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_dark_oak_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_pale_oak_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_spruce_saplings", Item::new, ( new Item.Settings() ) ),
			register( "crate_azaleas", Item::new, ( new Item.Settings() ) ),
			register( "crate_flowering_azaleas", Item::new, ( new Item.Settings() ) ),
			register( "crate_crimson_fungi", Item::new, ( new Item.Settings() ) ),
			register( "crate_warped_fungi", Item::new, ( new Item.Settings() ) ),
			register( "bundle_sugar_cane", Item::new, ( new Item.Settings() ) ),
			register( "pouch_cocoa_beans", Item::new, ( new Item.Settings() ) ),
			register( "crate_red_mushrooms", Item::new, ( new Item.Settings() ) ),
			register( "crate_brown_mushrooms", Item::new, ( new Item.Settings() ) ),
			register( "crate_eggs", Item::new, ( new Item.Settings() ) ),
			register( "crate_kelp", Item::new, ( new Item.Settings() ) ),
			register( "crate_beetroots", Item::new, ( new Item.Settings() ) ),
			register( "crate_carrots", Item::new, ( new Item.Settings() ) ),
			register( "crate_potatoes", Item::new, ( new Item.Settings() ) ),
			register( "crate_apples", Item::new, ( new Item.Settings() ) ),
			register( "crate_sweet_berries", Item::new, ( new Item.Settings() ) ),
			register( "crate_glow_berries", Item::new, ( new Item.Settings() ) ),
			register( "crate_chorus_fruits", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_rabbits", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_chickens", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_mutton", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_porkchops", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_beef", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_cod", Item::new, ( new Item.Settings() ) ),
			register( "crate_raw_salmon", Item::new, ( new Item.Settings() ) ),
			register( "crate_tropical_fish", Item::new, ( new Item.Settings() ) ),
			register( "crate_feathers", Item::new, ( new Item.Settings() ) ),
			register( "crate_rabbit_feet", Item::new, ( new Item.Settings() ) ),
			register( "crate_rabbit_hides", Item::new, ( new Item.Settings() ) ),
			register( "crate_leather", Item::new, ( new Item.Settings() ) ),
			register( "crate_turtle_scutes", Item::new, ( new Item.Settings() ) ),
			register( "crate_armadillo_scutes", Item::new, ( new Item.Settings() ) ),
			register( "crate_ink_sacs", Item::new, ( new Item.Settings() ) ),
			register( "crate_glow_ink_sacs", Item::new, ( new Item.Settings() ) ),
			register( "crate_rotten_flesh", Item::new, ( new Item.Settings() ) ),
			register( "crate_spider_eyes", Item::new, ( new Item.Settings() ) ),
			register( "crate_gunpowder", Item::new, ( new Item.Settings() ) ),
			register( "crate_phantom_membranes", Item::new, ( new Item.Settings() ) ),
			register( "crate_prismarine_crystals", Item::new, ( new Item.Settings() ) ),
			register( "bundle_breeze_rods", Item::new, ( new Item.Settings() ) ),
			register( "bundle_blaze_rods", Item::new, ( new Item.Settings() ) ),
			register( "crate_ghast_tears", Item::new, ( new Item.Settings() ) ),
			register( "crate_ender_pearls", Item::new, ( new Item.Settings() ) ),
			register( "crate_shulker_shells", Item::new, ( new Item.Settings() ) ),
			register( "crate_flint", Item::new, ( new Item.Settings() ) ),
			register( "crate_poisonous_potatoes", Item::new, ( new Item.Settings() ) ),
			register( "crate_pufferfish", Item::new, ( new Item.Settings() ) ),
			register( "crate_short_grass", Item::new, ( new Item.Settings() ) ),
			register( "crate_ferns", Item::new, ( new Item.Settings() ) ),
			register( "crate_dead_bushes", Item::new, ( new Item.Settings() ) ),
			register( "crate_cacti", Item::new, ( new Item.Settings() ) ),
			register( "crate_vines", Item::new, ( new Item.Settings() ) ),
			register( "crate_hanging_roots", Item::new, ( new Item.Settings() ) ),
			register( "crate_spore_blossoms", Item::new, ( new Item.Settings() ) ),
			register( "crate_pale_hanging_moss", Item::new, ( new Item.Settings() ) ),
			register( "crate_glow_lichen", Item::new, ( new Item.Settings() ) ),
			register( "crate_big_dripleaves", Item::new, ( new Item.Settings() ) ),
			register( "crate_nether_sprouts", Item::new, ( new Item.Settings() ) ),
			register( "crate_crimson_roots", Item::new, ( new Item.Settings() ) ),
			register( "crate_warped_roots", Item::new, ( new Item.Settings() ) ),
			register( "crate_weeping_vines", Item::new, ( new Item.Settings() ) ),
			register( "crate_twisting_vines", Item::new, ( new Item.Settings() ) ),
			register( "crate_pink_petals", Item::new, ( new Item.Settings() ) ),
			register( "crate_poppies", Item::new, ( new Item.Settings() ) ),
			register( "crate_red_tulips", Item::new, ( new Item.Settings() ) ),
			register( "crate_orange_tulips", Item::new, ( new Item.Settings() ) ),
			register( "crate_torchflowers", Item::new, ( new Item.Settings() ) ),
			register( "crate_dandelions", Item::new, ( new Item.Settings() ) ),
			register( "crate_blue_orchids", Item::new, ( new Item.Settings() ) ),
			register( "crate_cornflowers", Item::new, ( new Item.Settings() ) ),
			register( "crate_allium", Item::new, ( new Item.Settings() ) ),
			register( "crate_pink_tulips", Item::new, ( new Item.Settings() ) ),
			register( "crate_white_tulips", Item::new, ( new Item.Settings() ) ),
			register( "crate_azure_bluets", Item::new, ( new Item.Settings() ) ),
			register( "crate_oxeye_daisies", Item::new, ( new Item.Settings() ) ),
			register( "crate_lilies_of_the_valley", Item::new, ( new Item.Settings() ) ),
			register( "crate_closed_eyeblossoms", Item::new, ( new Item.Settings() ) ),
			register( "crate_wither_roses", Item::new, ( new Item.Settings() ) ),
			register( "crate_rose_bushes", Item::new, ( new Item.Settings() ) ),
			register( "crate_sunflowers", Item::new, ( new Item.Settings() ) ),
			register( "crate_lilacs", Item::new, ( new Item.Settings() ) ),
			register( "crate_peonies", Item::new, ( new Item.Settings() ) ),
			register( "crate_pitcher_plants", Item::new, ( new Item.Settings() ) ),
			register( "crate_lily_pads", Item::new, ( new Item.Settings() ) ),
			register( "crate_seagrass", Item::new, ( new Item.Settings() ) ),
			register( "crate_sea_pickles", Item::new, ( new Item.Settings() ) ),
			register( "crate_cobwebs", Item::new, ( new Item.Settings() ) )
		};

	// Methods

		private static Item register( String id, Function< Item.Settings, Item > factory, Item.Settings settings )
		{
			// Return registered item to calling routine.

				return Items.register( RegistryKey.of( RegistryKeys.ITEM, Identifier.of( ItemBundling.MOD_ID, id ) ), factory, settings );
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'ModItems.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
