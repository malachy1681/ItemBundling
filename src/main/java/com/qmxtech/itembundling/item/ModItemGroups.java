////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////${cursor}
// ModItemGroups.java
// Robert M. Baker | Created : 29DEC24 | Last Modified : 15JAN25 by Robert M. Baker
// Version : 1.1.0
// This is a source file for 'Item Bundling'; it defines the mod item groups registration class.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Package Specifier
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.qmxtech.itembundling.item;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Imports
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.*;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import com.qmxtech.itembundling.ItemBundling;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'ModItemGroups' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class ModItemGroups
{
// Public Access Members

	// Data Types

		public enum GroupID
		{
			Items,
			Blocks
		}

		public static class ItemGroupPair
		{
		// Public Access Members

			// Fields

				public RegistryKey< ItemGroup > key;
				public ItemGroup group;

			// Constructors

				public ItemGroupPair( RegistryKey< ItemGroup > targetKey, ItemGroup targetGroup )
				{
					// Initialize fields.

						key = targetKey;
						group = targetGroup;
				}
		}

	// Methods

		public static void initialize()
		{
			// Perform mod item groups registration logic.

				ItemBundling.LOGGER.info( ( "Registering item groups for mod '" + ItemBundling.MOD_ID + "' ..." ) );
		}

		public static ItemGroupPair getGroup( GroupID id )
		{
			// Report item group with spcified ID to calling routine.

				return GROUPS[ id.ordinal() ];
		}

// Private Access Members

	// Fields

		private static final ItemGroupPair[] GROUPS = {
			register( "item_group_items", "pouch_beetroot_seeds", "items" ),
			register( "item_group_blocks", "pallet_hay_blocks", "blocks" )
		};

	// Methods

		private static ItemGroupPair register( String path, String itemID, String tabID )
		{
			// Create local variables.

				ItemGroupPair result = new ItemGroupPair(
					RegistryKey.of( Registries.ITEM_GROUP.getKey(), Identifier.of( ItemBundling.MOD_ID, path ) ),

					FabricItemGroup.builder()
						.icon( ( () -> ( new ItemStack( Registries.ITEM.get( Identifier.of( ItemBundling.MOD_ID, itemID ) ) ) ) ) )
						.displayName( Text.translatable( ( "itemGroup." + ItemBundling.MOD_ID + "." + tabID ) ) )
						.build()
				);

			// Register item group using specified data.

				Registry.register( Registries.ITEM_GROUP, result.key, result.group );

			// Return result to calling routine.

				return result;
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'ModItemGroups.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
