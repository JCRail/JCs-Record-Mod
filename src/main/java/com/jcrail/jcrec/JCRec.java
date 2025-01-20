package com.jcrail.jcrec;

import com.jcrail.jcrec.core.handler.ItemHandler;
import com.jcrail.jcrec.core.handler.ItemIDs;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = JCRec.MODID, version = JCRec.VERSION, name = JCRec.NAME)
public class JCRec
{
    public static final String MODID = "jcrec";
    public static final String NAME = "JCRecords";
    public static final String VERSION = "1.0";
    public static CreativeTabs jcrecCreativeTab;
    public static CreativeTabs jcrecCreativeGames;
    public static CreativeTabs jcrecCreativeRailroad;
    public static Logger jcrecLogger = LogManager.getLogger("JCRecords");

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //Initalize Creative Tabs.
        jcrecLogger.info("JCRecords is flipping the tracks");

        jcrecCreativeTab = new CreativeTabs("JCRecords - The Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_akwts.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The Tracks"; }};

        jcrecCreativeGames = new CreativeTabs("JCRecords - The Game Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_revenge.item; }
                public String getTranslatedTabLabel() { return "JCRecords - The Game Tracks"; }};

        jcrecCreativeRailroad = new CreativeTabs("JCRecords - The Railroad Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_aaa.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The Railroad Tracks"; }};

        ItemHandler.initItemRegister();

    }

    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostLoad){
    }
}