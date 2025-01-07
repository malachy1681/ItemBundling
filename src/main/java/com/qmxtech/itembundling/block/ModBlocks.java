////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////${cursor}
// ModItems.java
// Robert M. Baker | Created : 03JAN25 | Last Modified : 07JAN25 by Robert M. Baker
// Version : 1.0.0
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

		private static final AbstractBlock.Settings SETTINGS_NON_LUMINANT = AbstractBlock.Settings.create()
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
			register( "pallet_hay_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_pumpkins", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_melons", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_honey_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dried_kelp_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_ochre_froglights", Block::new, SETTINGS_LUMINANT, true ),
			register( "pallet_verdant_froglights", Block::new, SETTINGS_LUMINANT, true ),
			register( "pallet_pearlescent_froglights", Block::new, SETTINGS_LUMINANT, true ),
			register( "pallet_bone_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_slime_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_prismarine_bricks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_coal_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_redstone_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_lapis_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_copper_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_iron_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_gold_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_diamond_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_emerald_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_quartz_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_netherite_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_clay", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_amethyst_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_glowstone", Block::new, SETTINGS_LUMINANT, true ),
			register( "pallet_resin_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_honeycomb_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_nether_wart_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_snow_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_blue_ice", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_magma_blocks", Block::new, SETTINGS_LUMINANT, true ),
			register( "pallet_dirt", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_rooted_dirt", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_soul_sand", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_soul_soil", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_gravel", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_sandstone", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_red_sandstone", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_cobblestone", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_andesite", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_diorite", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_granite", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dripstone_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_cobbled_deepslate", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_calcite", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_obsidian", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_crying_obsidian", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_netherrack", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_basalt", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_blackstone", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_end_stone", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_moss_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_pale_moss_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_mangrove_roots", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_acacia_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_birch_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_cherry_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_jungle_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_mangrove_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_oak_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dark_oak_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_pale_oak_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_spruce_logs", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_bamboo_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_warped_wart_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_shroomlights", Block::new, SETTINGS_LUMINANT, true ),
			register( "pallet_crimson_stems", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_warped_stems", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_white_wool", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dead_fire_coral_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dead_horn_coral_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dead_tube_coral_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dead_bubble_coral_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dead_brain_coral_blocks", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_acacia_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_birch_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_cherry_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_jungle_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_mangrove_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_oak_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_dark_oak_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_pale_oak_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_spruce_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_azalea_leaves", Block::new, SETTINGS_NON_LUMINANT, true ),
			register( "pallet_flowering_azalea_leaves", Block::new, SETTINGS_NON_LUMINANT, true )
		};

	// Methods

		private static Block register( String id, Function< AbstractBlock.Settings, Block > factory, AbstractBlock.Settings settings, Boolean doItemRegister )
		{
			// Create local variables.

				Block result;
				Identifier targetID = Identifier.of( ItemBundling.MOD_ID, id );
				RegistryKey< Item > key;

			// Register block with specified settings and optionally register block item.

				result = Blocks.register( RegistryKey.of( RegistryKeys.BLOCK, targetID ), factory, settings );

				if( doItemRegister )
				{
					key = RegistryKey.of( RegistryKeys.ITEM, targetID );

					Registry.register(
						Registries.ITEM,
						key,
						( new BlockItem( result, ( new Item.Settings().useBlockPrefixedTranslationKey().registryKey( key ) ) ) )
					);
				}

			// Return result to calling routine.

				return result;
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'ModBlocks.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
