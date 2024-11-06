package com.jcrail.jcrec;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = JCRec.MODID, version = JCRec.VERSION, name = JCRec.NAME)
public class JCRec
{
    public static final String MODID = "jcrec";
    public static final String NAME = "JCRec";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
