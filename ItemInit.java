package com.codyflynn.minecraftmod.init;

import com.codyflynn.minecraftmod.MinecraftMod;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMod.MOD_ID);
	
	public static final RegistryObject<Item> MOD_ITEM = register("mod_item", () -> new Item(new Item.Properties().tab(MinecraftMod.MOD_TAB)));
			
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item); 
	}

}
