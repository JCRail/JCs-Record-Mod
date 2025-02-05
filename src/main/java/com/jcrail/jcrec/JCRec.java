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

    public static CreativeTabs jcrecCreativeOld;
    public static CreativeTabs jcrecCreative70s;
    public static CreativeTabs jcrecCreative80s;
    public static CreativeTabs jcrecCreative90s;
    public static CreativeTabs jcrecCreativeModern;
    public static CreativeTabs jcrecCreativeGames;
    public static CreativeTabs jcrecCreativeRailroad;
    public static CreativeTabs jcrecCreativeTracks;
    public static Logger jcrecLogger = LogManager.getLogger("JCRecords");

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //Initalize Creative Tabs.
        jcrecLogger.info("JCRecords is flipping the tracks");

        jcrecCreativeOld = new CreativeTabs("JCRecords - The Old Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_highwayhell.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The Old Tracks"; }};

        jcrecCreative70s = new CreativeTabs("JCRecords - The 70s Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_ballblitz.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The 70s Tracks"; }};

        jcrecCreative80s = new CreativeTabs("JCRecords - The 80s Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_barra.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The 80s Tracks"; }};

        jcrecCreative90s = new CreativeTabs("JCRecords - The 90s Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_blue.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The 90s Tracks"; }};

        jcrecCreativeModern = new CreativeTabs("JCRecords - The Modern Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_fallingtodo.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The Modern Tracks"; }};

        jcrecCreativeGames = new CreativeTabs("JCRecords - The Game Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_revenge.item; }
                public String getTranslatedTabLabel() { return "JCRecords - The Game Tracks"; }};

        jcrecCreativeRailroad = new CreativeTabs("JCRecords - The Railroad Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_aaa.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The Railroad Tracks"; }};

        jcrecCreativeTracks = new CreativeTabs("JCRecords - The Mics Tracks") {
            public Item getTabIconItem() {
                return ItemIDs.disc_thanosbeatbox.item; }
            public String getTranslatedTabLabel() { return "JCRecords - The Misc Tracks"; }};

        ItemHandler.initItemRegister();

    }

    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostLoad){
    }
}