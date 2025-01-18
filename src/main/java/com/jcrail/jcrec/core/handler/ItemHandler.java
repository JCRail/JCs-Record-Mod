package com.jcrail.jcrec.core.handler;

import com.jcrail.jcrec.BaseItemRecordClass;
import com.jcrail.jcrec.JCRec;
import com.jcrail.jcrec.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

    public static void initItemRegister(){
        
        ItemIDs.disc_aaa.item = new BaseItemRecordClass("disc_aaa", JCRec.jcrecCreativeRailroad);
        ItemIDs.disc_acbg.item = new BaseItemRecordClass("disc_acbg", JCRec.jcrecCreativeTab);
        ItemIDs.disc_akwts.item = new disc_akwts("disc_akwts");
        ItemIDs.disc_alb.item = new disc_alb("disc_alb");
        ItemIDs.disc_alfat.item = new disc_alfat("disc_alfat");
        ItemIDs.disc_aouat.item = new disc_aouat("disc_aouat");
        ItemIDs.disc_asss.item = new disc_asss("disc_asss");
        //ItemIDs.disc_backblack.item = new disc_backblack("disc_backblack");
        ItemIDs.disc_badbone.item = new disc_badbone("disc_badbone");
        ItemIDs.disc_badr.item = new disc_badr("disc_badr");
        ItemIDs.disc_bbt.item = new disc_bbt("disc_bbt");
        ItemIDs.disc_blackbetty.item = new disc_blackbetty("disc_blackbetty");
        ItemIDs.disc_blackcars.item = new disc_blackcars("disc_blackcars");
        ItemIDs.disc_blue.item = new disc_blue("disc_blue");
        ItemIDs.disc_ccm.item = new disc_ccm("disc_ccm");
        ItemIDs.disc_chatcc.item = new disc_chatcc("disc_chatcc");
        ItemIDs.disc_dangerzone.item = new disc_dangerzone("disc_dangerzone");
        ItemIDs.disc_devilgeorgia.item = new disc_devilgeorgia("disc_devilgeorgia");
        ItemIDs.disc_electric.item = new disc_electric("disc_electric");
        ItemIDs.disc_eyeinsky.item = new disc_eyeinsky("disc_eyeinsky");
        ItemIDs.disc_eyetiger.item = new disc_eyetiger("disc_eyetiger");
        ItemIDs.disc_fightright.item = new disc_fightright("disc_fightright");
        ItemIDs.disc_fmail.item = new disc_fmail("disc_fmail");
        ItemIDs.disc_freebird.item = new disc_freebird("disc_freebird");
        ItemIDs.disc_freight.item = new disc_freight("disc_freight");
        ItemIDs.disc_funkytown.item = new disc_funkytown("disc_funkytown");
        ItemIDs.disc_gotr.item = new disc_gotr("disc_gotr");
        ItemIDs.disc_highwayhell.item = new disc_highwayhell("disc_highwayhell");
        ItemIDs.disc_hipsquare.item = new disc_hipsquare("disc_hipsquare");
        ItemIDs.disc_humbn.item = new disc_humbn("disc_humbn");
        ItemIDs.disc_kickheart.item = new disc_kickheart("disc_kickheart");
        ItemIDs.disc_lifehighway.item = new disc_lifehighway("disc_lifehighway");
        ItemIDs.disc_livinprayer.item = new disc_livinprayer("disc_livinprayer");
        ItemIDs.disc_midflyer.item = new disc_midflyer("disc_midflyer");
        ItemIDs.disc_morefeeling.item = new disc_morefeeling("disc_morefeeling");
        ItemIDs.disc_movinon.item = new disc_movinon("disc_movinon");
        ItemIDs.disc_nosleepb.item = new disc_nosleepb("disc_nosleepb");
        ItemIDs.disc_notengo.item = new disc_notengo("disc_notengo");
        ItemIDs.disc_nsfunction.item = new disc_nsfunction("disc_nsfunction");
        ItemIDs.disc_obr.item = new disc_obr("disc_obr");
        ItemIDs.disc_oceanman.item = new disc_oceanman("disc_oceanman");
        ItemIDs.disc_onatsf.item = new disc_onatsf("disc_onatsf");
        ItemIDs.disc_rickroll.item = new disc_rickroll("disc_rickroll");
        ItemIDs.disc_seaboard.item = new disc_seaboard("disc_seaboard");
        ItemIDs.disc_sfatw.item = new disc_sfatw("disc_sfatw");
        ItemIDs.disc_sharpman.item = new disc_sharpman("disc_sharpman");
        ItemIDs.disc_shook.item = new disc_shook("disc_shook");
        ItemIDs.disc_sproll.item = new disc_sproll("disc_sproll");
        ItemIDs.disc_sweetchild.item = new disc_sweetchild("disc_sweetchild");
        ItemIDs.disc_thriller.item = new disc_thriller("disc_thriller");
        ItemIDs.disc_thunderstruck.item = new disc_thunderstruck("disc_thunderstruck");
        ItemIDs.disc_traintoh.item = new disc_traintoh("disc_traintoh");
        ItemIDs.disc_uproll.item = new disc_uproll("disc_uproll");
        ItemIDs.disc_waitfortrain.item = new disc_waitfortrain("disc_waitfortrain");
        ItemIDs.disc_wheelsky.item = new disc_wheelsky("disc_wheelsky");

        for (ItemIDs items : ItemIDs.values()) {

            items.item.setUnlocalizedName(JCRec.MODID + ":" + items.itemName);
            GameRegistry.registerItem(items.item, items.name());

        }
    }
}
