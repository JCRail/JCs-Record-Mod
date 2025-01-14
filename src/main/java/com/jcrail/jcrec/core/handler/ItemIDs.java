package com.jcrail.jcrec.core.handler;

import net.minecraft.item.Item;

public enum ItemIDs {

    //itemClassName: Name of class.java file    iconName: Name of icon    itemName: Name of item internally in game.
    disc_aaa("disc_aaa", "disc_aaa", "disc_aaa"),
    disc_hipsquare("disc_hipsquare", "disc_hipsquare", "disc_hipsquare"),
    disc_seaboard("disc_seaboard", "disc_seaboard", "disc_seaboard"),
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
