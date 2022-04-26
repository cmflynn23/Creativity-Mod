package com.codyflynn.minecraftmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("minecraftmod")
public class MinecraftMod {
	
	public MinecraftMod() {
		MinecraftForge.EVENT_BUS.register(this);
		
	}

}
