package com.spicy.utils;

import com.spicy.Spicy;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class PrintUtils {

    public static String warning(IChatComponent str) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§8[§d" + Spicy.getCLIENT_NAME() + "§f/§6WARN" + "§8]§f "+ str.getFormattedText()));
        return null;
    }

    public static String error(IChatComponent str) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§8[§d" + Spicy.getCLIENT_NAME() + "§f/§4ERROR" + "§8]§f "+ str.getFormattedText()));
        return null;
    }

    public static String info(IChatComponent str) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§8[§d" + Spicy.getCLIENT_NAME() + "§f/INFO" + "§8]§f " + str.getFormattedText()));
        return null;
    }
}