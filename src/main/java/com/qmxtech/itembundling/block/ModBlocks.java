////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////${cursor}
// ModItems.java
// Robert M. Baker | Created : 03JAN25 | Last Modified : 15JAN25 by Robert M. Baker
// Version : 1.1.0
// This is a source file for 'Item Bundling'; it defines the mod items registration class.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Package Specifier
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.qmxtech.itembundling.block;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Imports
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.function.Function;
import net.minecraft.util.Identifier;
import net.minecraft.registry.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.qmxtech.itembundling.ItemBundling;
import com.qmxtech.itembundling.item.ModItemGroups;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'ModBlocks' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class ModBlocks
{
// Public Access Members

	// Fields

		public static final String[] CUTOUT_BLOCK_IDS = {
			"pallet_mangrove_roots",
			"pallet_acacia_leaves",
			"pallet_birch_leaves",
			"pallet_cherry_leaves",
			"pallet_jungle_leaves",
			"pallet_mangrove_leaves",
			"pallet_oak_leaves",
			"pallet_dark_oak_leaves",
			"pallet_pale_oak_leaves",
			"pallet_spruce_leaves",
			"pallet_azalea_leaves",
			"pallet_flowering_azalea_leaves"
		};

		public static final String[] TRANSLUCENT_BLOCK_IDS = {
			"pallet_honey_blocks",
			"pallet_slime_blocks"
		};

		public static final String[][] TINTED_BLOCKS = {
			{ "pallet_acacia_leaves", "-1" },
			{ "pallet_birch_leaves", "8431445" },
			{ "pallet_jungle_leaves", "-1" },
			{ "pallet_mangrove_leaves", "-1" },
			{ "pallet_oak_leaves", "-1" },
			{ "pallet_dark_oak_leaves", "-1" },
			{ "pallet_spruce_leaves", "6396257" }
		};

	// Methods

		public static void initialize()
		{
			// Perform mod blocks registration logic.

				ItemBundling.LOGGER.info( ( "Registering blocks for mod '" + ItemBundling.MOD_ID + "' ..." ) );

				ItemGroupEvents.modifyEntriesEvent( ModItemGroups.getGroup( ModItemGroups.GroupID.Blocks ).key ).register( ( ( entries ) -> {
					for ( Block block : BLOCKS )
						entries.add( block );
				} ) );
		}

// Private Access Members

	// Fields

		private static final AbstractBlock.Settings SETTINGS_STANDARD = AbstractBlock.Settings.create()
			.mapColor( MapColor.OAK_TAN )
			.strength( 2.0F, 3.0F )
			.sounds( BlockSoundGroup.WOOD )
			.nonOpaque();

		private static final AbstractBlock.Settings SETTINGS_LUMINANT = AbstractBlock.Settings.create()
			.mapColor( MapColor.OAK_TAN )
			.strength( 2.0F, 3.0F )
			.sounds( BlockSoundGroup.WOOD )
			.nonOpaque()
			.luminance( ( state -> 15 ) );

		private static final Block[] BLOCKS = {
			register( "pallet_hay_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_pumpkins", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_melons", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_honey_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dried_kelp_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_ochre_froglights", PalletBlock::new, SETTINGS_LUMINANT ),
			register( "pallet_verdant_froglights", PalletBlock::new, SETTINGS_LUMINANT ),
			register( "pallet_pearlescent_froglights", PalletBlock::new, SETTINGS_LUMINANT ),
			register( "pallet_bone_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_slime_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_prismarine_bricks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_coal_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_redstone_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_lapis_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_copper_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_iron_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_gold_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_diamond_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_emerald_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_quartz_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_netherite_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_clay", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_amethyst_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_glowstone", PalletBlock::new, SETTINGS_LUMINANT ),
			register( "pallet_resin_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_honeycomb_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_nether_wart_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_snow_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_blue_ice", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_magma_blocks", PalletBlock::new, SETTINGS_LUMINANT ),
			register( "pallet_dirt", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_rooted_dirt", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_soul_sand", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_soul_soil", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_gravel", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_sandstone", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_red_sandstone", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_cobblestone", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_andesite", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_diorite", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_granite", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dripstone_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_cobbled_deepslate", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_tuff", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_calcite", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_obsidian", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_crying_obsidian", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_netherrack", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_basalt", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_blackstone", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_end_stone", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_moss_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_pale_moss_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_mangrove_roots", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_acacia_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_birch_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_cherry_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_jungle_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_mangrove_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_oak_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dark_oak_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_pale_oak_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_spruce_logs", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_bamboo_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_warped_wart_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_shroomlights", PalletBlock::new, SETTINGS_LUMINANT ),
			register( "pallet_crimson_stems", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_warped_stems", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_white_wool", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dead_fire_coral_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dead_horn_coral_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dead_tube_coral_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dead_bubble_coral_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dead_brain_coral_blocks", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_acacia_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_birch_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_cherry_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_jungle_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_mangrove_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_oak_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_dark_oak_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_pale_oak_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_spruce_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_azalea_leaves", PalletBlock::new, SETTINGS_STANDARD ),
			register( "pallet_flowering_azalea_leaves", PalletBlock::new, SETTINGS_STANDARD )
		};

	// Methods

		private static Block register( String id, Function< AbstractBlock.Settings, Block > factory, AbstractBlock.Settings settings )
		{
			// Create local variables.

				Block result;
				Identifier targetID = Identifier.of( ItemBundling.MOD_ID, id );
				RegistryKey< Item > key;

			// Register block with specified settings and its item.

				result = Blocks.register( RegistryKey.of( RegistryKeys.BLOCK, targetID ), factory, settings );
				key = RegistryKey.of( RegistryKeys.ITEM, targetID );

				Registry.register(
					Registries.ITEM,
					key,
					( new BlockItem( result, ( new Item.Settings().useBlockPrefixedTranslationKey().registryKey( key ) ) ) )
				);

			// Return result to calling routine.

				return result;
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'ModBlocks.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
