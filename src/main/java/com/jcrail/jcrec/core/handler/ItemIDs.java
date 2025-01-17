package com.jcrail.jcrec.core.handler;

import net.minecraft.item.Item;

public enum ItemIDs {

    //itemClassName: Name of class.java file    iconName: Name of icon    itemName: Name of item internally.

    disc_aaa("disc_aaa", "disc_aaa", "disc_aaa"),
    disc_acbg("disc_acbg", "disc_acbg", "disc_acbg"),
    disc_akwts("disc_akwts", "disc_akwts", "disc_akwts"),
    disc_alb("disc_alb", "disc_alb", "disc_alb"),
    disc_alfat("disc_alfat", "disc_alfat", "disc_alfat"),
    disc_aouat("disc_aouat", "disc_aouat", "disc_aouat"),
    disc_asss("disc_asss", "disc_asss", "disc_asss"),
    //disc_backblack("disc_backblack", "disc_backblack", "disc_backblack"),
    disc_badbone("disc_baadbone", "disc_badbone", "disc_badbone"),
    disc_badr("disc_badr", "disc_badr", "disc_badr"),
    disc_bbt("disc_bbt", "disc_bbt", "disc_bbt"),
    disc_blackbetty("disc_blackbetty", "disc_blackbetty", "disc_blackbetty"),
    disc_blackcars("disc_blackcars", "disc_blackcars", "disc_blackcars"),
    disc_blue("disc_blue", "disc_blue", "disc_blue"),
    disc_ccm("disc_ccm", "disc_ccm", "disc_ccm"),
    disc_chatcc("disc_chatcc", "disc_chatcc", "disc_chatcc"),
    disc_dangerzone("disc_dangerzone", "disc_dangerzone", "disc_dangerzone"),
    disc_devilgeorgia("disc_devilgeorgia", "disc_devilgeorgia", "disc_devilgeorgia"),
    disc_electric("disc_electric", "disc_electric", "disc_electric"),
    disc_eyeinsky("disc_eyeinsky", "disc_eyeinsky", "disc_eyeinsky"),
    disc_eyetiger("disc_eyetiger", "disc_eyetiger", "disc_eyetiger"),
    disc_fightright("disc_fightright", "disc_fightright", "disc_fightright"),
    disc_fmail("disc_fmail", "disc_fmail", "disc_fmail"),
    disc_freebird("disc_freebird", "disc_freebird", "disc_freebird"),
    disc_freight("disc_freight", "disc_freight", "disc_freight"),
    disc_funkytown("disc_funkytown", "disc_funkytown", "disc_funkytown"),
    disc_gotr("disc_gotr", "disc_gotr", "disc_gotr"),
    disc_highwayhell("disc_highwayhell", "disc_highwayhell", "disc_highwayhell"),
    disc_hipsquare("disc_hipsquare", "disc_hipsquare", "disc_hipsquare"),
    disc_humbn("disc_humbn", "disc_humbn", "disc_humbn"),
    disc_kickheart("disc_disc_kickheart", "disc_kickheart", "disc_kickheart"),
    disc_lifehighway("disc_lifehighway", "disc_lifehighway", "disc_lifehighway"),
    disc_livinprayer("disc_livinprayer", "disc_livinprayer", "disc_livinprayer"),
    disc_midflyer("disc_midflyer", "disc_midflyer", "disc_midflyer"),
    disc_morefeeling("disc_morefeeling", "disc_morefeeling", "disc_morefeeling"),
    disc_movinon("disc_movinon", "disc_movinon", "disc_movinon"),
    disc_nosleepb("disc_nosleepb", "disc_nosleepb", "disc_nosleepb"),
    disc_notengo("disc_notengo", "disc_notengo", "disc_notengo"),
    disc_nsfunction("disc_nsfunction", "disc_nsfunction", "disc_nsfunction"),
    disc_obr("disc_obr", "disc_obr", "disc_obr"),
    disc_oceanman("disc_oceanman", "disc_oceanman", "disc_oceanman"),
    disc_onatsf("disc_onatsf", "disc_onatsf", "disc_onatsf"),
    disc_rickroll("disc_rickroll", "disc_rickroll", "disc_rickroll"),
    disc_seaboard("disc_seaboard", "disc_seaboard", "disc_seaboard"),
    disc_sfatw("disc_sfatw", "disc_sfatw", "disc_sfatw"),
    disc_sharpman("disc_sharpman", "disc_sharpman", "disc_sharpman"),
    disc_shook("disc_shook", "disc_shook", "disc_shook"),
    disc_sproll("disc_sproll", "disc_sproll", "disc_sproll"),
    disc_sweetchild("disc_sweetchild", "disc_sweetchild", "disc_sweetchild"),
    disc_thriller("disc_thriller", "disc_thriller", "disc_thriller"),
    disc_thunderstruck("disc_thunderstruck", "disc_thunderstruck", "disc_thunderstruck"),
    disc_traintoh("disc_traintoh", "disc_traintoh", "disc_traintoh"),
    disc_uproll("disc_uproll", "disc_uproll", "disc_uproll"),
    disc_waitfortrain("disc_waitfortrain", "disc_waitfortrain", "disc_waitfortrain"),
    disc_wheelsky("disc_wheelsky", "disc_wheelsky", "disc_wheelsky"),
    ;

    public Item item;
    public String className;
    public String iconName;
    public String itemName;

    ItemIDs(String itemClassName, String iconName, String itemName) {
        this.className = itemClassName;
        this.iconName = iconName;
        this.itemName = itemName;
    }
}
