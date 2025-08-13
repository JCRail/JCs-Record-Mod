package com.jcrail.jcrec.core.handler;

import net.minecraft.item.Item;

public enum ItemIDs {

    //itemClassName: Name of class.java file    iconName: Name of icon    itemName: Name of item internally.

    disc_aaa("disc_aaa", "disc_aaa", "disc_aaa"),
    disc_aintnobody("disc_aintnobody", "disc_aintnobody", "disc_aintnobody"),
    disc_amongus("disc_amongus", "disc_amongus", "disc_amongus"),
    disc_bbt("disc_bbt", "disc_bbt", "disc_bbt"),
    disc_beepblock("disc_beepblock", "disc_beepblock", "disc_beepblock"),
    disc_breaktoad("disc_breaktoad", "disc_breaktoad", "disc_breaktoad"),
    disc_buttsecks("disc_buttsecks", "disc_buttsecks", "disc_buttsecks"),
    disc_canadatrilogy("disc_canadatrilogy", "disc_canadatrilogy", "disc_canadatrilogy"),
    disc_caseyjones("disc_caseyjones", "disc_caseyjones", "disc_caseyjones"),
    disc_chatcc("disc_chatcc", "disc_chatcc", "disc_chatcc"),
    disc_citynewo("disc_citynewo", "disc_citynewo", "disc_citynewo"),
    disc_conjunc("disc_conjunc", "disc_conjunc", "disc_conjunc"),
    disc_crazytrain("disc_crazytrain", "disc_crazytrain", "disc_crazytrain"),
    disc_dontmine("disc_dontmine", "disc_dontmine", "disc_dontmine"),
    disc_electromeme("disc_electromeme", "disc_electromeme", "disc_electromeme"),
    disc_fallenkingdom("disc_fallenkingdom", "disc_fallenkingdom", "disc_fallenkingdom"),
    disc_familyguy("disc_familyguy", "disc_familyguy", "disc_familyguy"),
    disc_fmail("disc_fmail", "disc_fmail", "disc_fmail"),
    disc_folsomblues("disc_folsomblues", "disc_folsomblues", "disc_folsomblues"),
    disc_freight("disc_freight", "disc_freight", "disc_freight"),
    disc_georgiamail("disc_georgiamail", "disc_georgiamail", "disc_georgiamail"),
    disc_gotr("disc_gotr", "disc_gotr", "disc_gotr"),
    disc_howcraft("disc_howcraft", "disc_howcraft", "disc_howcraft"),
    disc_humbn("disc_humbn", "disc_humbn", "disc_humbn"),
    disc_johnfreeman09("disc_johnfreeman09", "disc_johnfreeman09", "disc_johnfreeman09"),
    disc_katymule("disc_katymule", "disc_katymule", "disc_katymule"),
    disc_kinishes("disc_kinishes", "disc_kinishes", "disc_kinishes"),
    disc_liferrtoh("disc_liferrtoh", "disc_liferrtoh", "disc_liferrtoh"),
    disc_loveyou("disc_loveyou", "disc_loveyou", "disc_loveyou"),
    disc_mcdonaldspent("disc_mcdonaldspent", "disc_mcdonaldspent", "disc_mcdonaldspent"),
    disc_midflyer("disc_midflyer", "disc_midflyer", "disc_midflyer"),
    disc_moregun("disc_moregun", "disc_moregun", "disc_moregun"),
    disc_movinon("disc_movinon", "disc_movinon", "disc_movinon"),
    disc_mytrains("disc_mytrains", "disc_mytrains", "disc_mytrains"),
    disc_nsfunction("disc_nsfunction", "disc_nsfunction", "disc_nsfunction"),
    disc_obr("disc_obr", "disc_obr", "disc_obr"),
    disc_ollienorth("disc_ollienorth", "disc_ollienorth", "disc_ollienorth"),
    disc_onatsf("disc_onatsf", "disc_onatsf", "disc_onatsf"),
    disc_onrailroad("disc_onrailroad", "disc_onrailroad", "disc_onrailroad"),
    disc_orangebs("disc_orangebs", "disc_orangebs", "disc_orangebs"),
    disc_peaceandtran("disc_peaceandtran", "disc_peaceandtran", "disc_peaceandtran"),
    disc_pepsiman("disc_pepsiman", "disc_pepsiman", "disc_pepsiman"),
    disc_pradioclean("disc_pradioclean", "disc_pradioclean", "disc_pradioclean"),
    disc_pradiodirty("disc_pradiodirty", "disc_pradiodirty", "disc_pradiodirty"),
    disc_redsun("disc_redsun", "disc_redsun", "disc_redsun"),
    disc_rescuegirl("disc_rescuegirl", "disc_rescuegirl", "disc_rescuegirl"),
    disc_revenge("disc_revenge", "disc_revenge", "disc_revenge"),
    disc_rizznight("disc_rizznight", "disc_rizznight", "disc_rizznight"),
    disc_rosahummer("disc_rosahummer", "disc_rosahummer", "disc_rosahummer"),
    disc_screwnether("disc_screwnether", "disc_screwnether", "disc_screwnether"),
    disc_seaboard("disc_seaboard", "disc_seaboard", "disc_seaboard"),
    disc_sfatw("disc_sfatw", "disc_sfatw", "disc_sfatw"),
    disc_shakedanger("disc_shakedanger", "disc_shakedanger", "disc_shakedanger"),
    disc_spacecuba("disc_spacecuba", "disc_spacecuba", "disc_spacecuba"),
    disc_sproll("disc_sproll", "disc_sproll", "disc_sproll"),
    disc_swordsword("disc_swordsword", "disc_swordsword", "disc_swordsword"),
    disc_thanosbeatbox("disc_thanosbeatbox", "disc_thanosbeatbox", "disc_thanosbeatbox"),
    disc_tnt("disc_tnt", "disc_tnt", "disc_tnt"),
    disc_traintoh("disc_traintoh", "disc_traintoh", "disc_traintoh"),
    disc_uniondixie("disc_uniondixie", "disc_uniondixie", "disc_uniondixie"),
    disc_uproll("disc_uproll", "disc_uproll", "disc_uproll"),
    disc_usanthem("disc_usanthem", "disc_usanthem", "disc_usanthem"),
    disc_wabashcannon("disc_wabashcannon", "disc_wabashcannon", "disc_wabashcannon"),
    disc_waitfortrain("disc_waitfortrain", "disc_waitfortrain", "disc_waitfortrain"),
    disc_wreck97("disc_wreck97", "disc_wreck97", "disc_wreck97"),
    disc_youarepirate("disc_youarepirate", "disc_youarepirate", "disc_youarepirate"),
    disc_yummy("disc_yummy", "disc_yummy", "disc_yummy"),

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
