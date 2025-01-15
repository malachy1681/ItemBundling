////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////${cursor}
// ModItems.java
// Robert M. Baker | Created : 25DEC24 | Last Modified : 15JAN25 by Robert M. Baker
// Version : 1.1.0
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

		private static final Item.Settings SETTINGS_STANDARD = new Item.Settings();

		private static final Item[] ITEMS = {
			register( "pouch_beetroot_seeds", Item::new, SETTINGS_STANDARD ),
			register( "pouch_wheat_seeds", Item::new, SETTINGS_STANDARD ),
			register( "pouch_pumpkin_seeds", Item::new, SETTINGS_STANDARD ),
			register( "pouch_melon_seeds", Item::new, SETTINGS_STANDARD ),
			register( "pouch_torchflower_seeds", Item::new, SETTINGS_STANDARD ),
			register( "pouch_pitcher_pods", Item::new, SETTINGS_STANDARD ),
			register( "crate_acacia_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_birch_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_cherry_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_jungle_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_mangrove_propagules", Item::new, SETTINGS_STANDARD ),
			register( "crate_oak_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_dark_oak_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_pale_oak_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_spruce_saplings", Item::new, SETTINGS_STANDARD ),
			register( "crate_azaleas", Item::new, SETTINGS_STANDARD ),
			register( "crate_flowering_azaleas", Item::new, SETTINGS_STANDARD ),
			register( "crate_crimson_fungi", Item::new, SETTINGS_STANDARD ),
			register( "crate_warped_fungi", Item::new, SETTINGS_STANDARD ),
			register( "bundle_sugar_cane", Item::new, SETTINGS_STANDARD ),
			register( "pouch_cocoa_beans", Item::new, SETTINGS_STANDARD ),
			register( "crate_red_mushrooms", Item::new, SETTINGS_STANDARD ),
			register( "crate_brown_mushrooms", Item::new, SETTINGS_STANDARD ),
			register( "crate_eggs", Item::new, SETTINGS_STANDARD ),
			register( "crate_kelp", Item::new, SETTINGS_STANDARD ),
			register( "crate_beetroots", Item::new, SETTINGS_STANDARD ),
			register( "crate_carrots", Item::new, SETTINGS_STANDARD ),
			register( "crate_potatoes", Item::new, SETTINGS_STANDARD ),
			register( "crate_apples", Item::new, SETTINGS_STANDARD ),
			register( "crate_sweet_berries", Item::new, SETTINGS_STANDARD ),
			register( "crate_glow_berries", Item::new, SETTINGS_STANDARD ),
			register( "crate_chorus_fruits", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_rabbits", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_chickens", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_mutton", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_porkchops", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_beef", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_cod", Item::new, SETTINGS_STANDARD ),
			register( "crate_raw_salmon", Item::new, SETTINGS_STANDARD ),
			register( "crate_tropical_fish", Item::new, SETTINGS_STANDARD ),
			register( "crate_feathers", Item::new, SETTINGS_STANDARD ),
			register( "crate_rabbit_feet", Item::new, SETTINGS_STANDARD ),
			register( "crate_rabbit_hides", Item::new, SETTINGS_STANDARD ),
			register( "crate_leather", Item::new, SETTINGS_STANDARD ),
			register( "crate_turtle_scutes", Item::new, SETTINGS_STANDARD ),
			register( "crate_armadillo_scutes", Item::new, SETTINGS_STANDARD ),
			register( "crate_ink_sacs", Item::new, SETTINGS_STANDARD ),
			register( "crate_glow_ink_sacs", Item::new, SETTINGS_STANDARD ),
			register( "crate_rotten_flesh", Item::new, SETTINGS_STANDARD ),
			register( "crate_spider_eyes", Item::new, SETTINGS_STANDARD ),
			register( "crate_gunpowder", Item::new, SETTINGS_STANDARD ),
			register( "crate_phantom_membranes", Item::new, SETTINGS_STANDARD ),
			register( "crate_prismarine_crystals", Item::new, SETTINGS_STANDARD ),
			register( "bundle_breeze_rods", Item::new, SETTINGS_STANDARD ),
			register( "bundle_blaze_rods", Item::new, SETTINGS_STANDARD ),
			register( "crate_ghast_tears", Item::new, SETTINGS_STANDARD ),
			register( "crate_ender_pearls", Item::new, SETTINGS_STANDARD ),
			register( "crate_shulker_shells", Item::new, SETTINGS_STANDARD ),
			register( "crate_flint", Item::new, SETTINGS_STANDARD ),
			register( "crate_poisonous_potatoes", Item::new, SETTINGS_STANDARD ),
			register( "crate_pufferfish", Item::new, SETTINGS_STANDARD ),
			register( "crate_short_grass", Item::new, SETTINGS_STANDARD ),
			register( "crate_ferns", Item::new, SETTINGS_STANDARD ),
			register( "crate_dead_bushes", Item::new, SETTINGS_STANDARD ),
			register( "crate_cacti", Item::new, SETTINGS_STANDARD ),
			register( "crate_vines", Item::new, SETTINGS_STANDARD ),
			register( "crate_hanging_roots", Item::new, SETTINGS_STANDARD ),
			register( "crate_spore_blossoms", Item::new, SETTINGS_STANDARD ),
			register( "crate_pale_hanging_moss", Item::new, SETTINGS_STANDARD ),
			register( "crate_glow_lichen", Item::new, SETTINGS_STANDARD ),
			register( "crate_big_dripleaves", Item::new, SETTINGS_STANDARD ),
			register( "crate_nether_sprouts", Item::new, SETTINGS_STANDARD ),
			register( "crate_crimson_roots", Item::new, SETTINGS_STANDARD ),
			register( "crate_warped_roots", Item::new, SETTINGS_STANDARD ),
			register( "crate_weeping_vines", Item::new, SETTINGS_STANDARD ),
			register( "crate_twisting_vines", Item::new, SETTINGS_STANDARD ),
			register( "crate_pink_petals", Item::new, SETTINGS_STANDARD ),
			register( "crate_poppies", Item::new, SETTINGS_STANDARD ),
			register( "crate_red_tulips", Item::new, SETTINGS_STANDARD ),
			register( "crate_orange_tulips", Item::new, SETTINGS_STANDARD ),
			register( "crate_torchflowers", Item::new, SETTINGS_STANDARD ),
			register( "crate_dandelions", Item::new, SETTINGS_STANDARD ),
			register( "crate_blue_orchids", Item::new, SETTINGS_STANDARD ),
			register( "crate_cornflowers", Item::new, SETTINGS_STANDARD ),
			register( "crate_allium", Item::new, SETTINGS_STANDARD ),
			register( "crate_pink_tulips", Item::new, SETTINGS_STANDARD ),
			register( "crate_white_tulips", Item::new, SETTINGS_STANDARD ),
			register( "crate_azure_bluets", Item::new, SETTINGS_STANDARD ),
			register( "crate_oxeye_daisies", Item::new, SETTINGS_STANDARD ),
			register( "crate_lilies_of_the_valley", Item::new, SETTINGS_STANDARD ),
			register( "crate_closed_eyeblossoms", Item::new, SETTINGS_STANDARD ),
			register( "crate_wither_roses", Item::new, SETTINGS_STANDARD ),
			register( "crate_rose_bushes", Item::new, SETTINGS_STANDARD ),
			register( "crate_sunflowers", Item::new, SETTINGS_STANDARD ),
			register( "crate_lilacs", Item::new, SETTINGS_STANDARD ),
			register( "crate_peonies", Item::new, SETTINGS_STANDARD ),
			register( "crate_pitcher_plants", Item::new, SETTINGS_STANDARD ),
			register( "crate_lily_pads", Item::new, SETTINGS_STANDARD ),
			register( "crate_seagrass", Item::new, SETTINGS_STANDARD ),
			register( "crate_sea_pickles", Item::new, SETTINGS_STANDARD ),
			register( "crate_cobwebs", Item::new, SETTINGS_STANDARD )
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
