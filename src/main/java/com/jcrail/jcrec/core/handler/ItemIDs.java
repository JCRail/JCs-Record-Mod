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
    disc_badr("disc_badr", "disc_badr", "disc_badr"),
    disc_bbt("disc_bbt", "disc_bbt", "disc_bbt"),
    disc_blackcars("disc_blackcars", "disc_blackcars", "disc_blackcars"),
    disc_blue("disc_blue", "disc_blue", "disc_blue"),
    disc_ccm("disc_ccm", "disc_ccm", "disc_ccm"),
    disc_chatcc("disc_chatcc", "disc_chatcc", "disc_chatcc"),
    disc_electric("disc_electric", "disc_electric", "disc_electric"),
    disc_eyeinsky("disc_eyeinsky", "disc_eyeinsky", "disc_eyeinsky"),
    disc_fmail("disc_fmail", "disc_fmail", "disc_fmail"),
    disc_freight("disc_freight", "disc_freight", "disc_freight"),
    disc_funkytown("disc_funkytown", "disc_funkytown", "disc_funkytown"),
    disc_gotr("disc_gotr", "disc_gotr", "disc_gotr"),
    disc_hipsquare("disc_hipsquare", "disc_hipsquare", "disc_hipsquare"),
    disc_humbn("disc_humbn", "disc_humbn", "disc_humbn"),
    disc_midflyer("disc_midflyer", "disc_midflyer", "disc_midflyer"),
    disc_movinon("disc_movinon", "disc_movinon", "disc_movinon"),
    disc_notengo("disc_notengo", "disc_notengo", "disc_notengo"),
    disc_nsfunction("disc_nsfunction", "disc_nsfunction", "disc_nsfunction"),
    disc_obr("disc_obr", "disc_obr", "disc_obr"),
    disc_oceanman("disc_oceanman", "disc_oceanman", "disc_oceanman"),
    disc_onatsf("disc_onatsf", "disc_onatsf", "disc_onatsf"),
    disc_rickroll("disc_rickroll", "disc_rickroll", "disc_rickroll"),
    disc_seaboard("disc_seaboard", "disc_seaboard", "disc_seaboard"),
    disc_sfatw("disc_sfatw", "disc_sfatw", "disc_sfatw"),
    disc_sproll("disc_sproll", "disc_sproll", "disc_sproll"),
    disc_thriller("disc_thriller", "disc_thriller", "disc_thriller"),
    disc_traintoh("disc_traintoh", "disc_traintoh", "disc_traintoh"),
    disc_uproll("disc_uproll", "disc_uproll", "disc_uproll"),
    disc_waitfortrain("disc_waitfortrain", "disc_waitfortrain", "disc_waitfortrain"),
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
