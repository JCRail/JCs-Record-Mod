package com.jcrail.jcrec.core.handler;

import com.jcrail.jcrec.JCRec;
import com.jcrail.jcrec.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

    public static void initItemRegister(){
        
        ItemIDs.disc_aaa.item = new disc_aaa("disc_aaa");
        ItemIDs.disc_electric.item = new disc_electric("disc_electric");
        ItemIDs.disc_hipsquare.item = new disc_hipsquare("disc_hipsquare");
        ItemIDs.disc_seaboard.item = new disc_seaboard("disc_seaboard");


        for (ItemIDs items : ItemIDs.values()) {
            items.item.setCreativeTab(JCRec.jcrecCreativeTab);

            items.item.setUnlocalizedName(JCRec.MODID + ":" + items.itemName);
            GameRegistry.registerItem(items.item, items.name());

        }
    }
}
