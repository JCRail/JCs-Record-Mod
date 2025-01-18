package com.jcrail.jcrec;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BaseItemRecordClass extends ItemRecord
{
    public final String recordName;

    public BaseItemRecordClass(String recordName, CreativeTabs creativeTab)
    {
        super(recordName);
        this.recordName = recordName;
        setMaxStackSize(1);
        setUnlocalizedName(recordName);
        setCreativeTab(creativeTab);
    }

    //Icon Code
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(JCRec.MODID.toLowerCase() + ":" + recordName);
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(JCRec.MODID + ":" + name);
    }
}
