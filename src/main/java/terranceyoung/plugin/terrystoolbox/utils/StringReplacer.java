package terranceyoung.plugin.terrystoolbox.utils;

import org.bukkit.ChatColor;

public class StringReplacer {

    public static String replaceString(String string) {
        string = string.replaceAll("&4", ChatColor.DARK_RED.toString());
        string = string.replaceAll("&c", ChatColor.RED.toString());
        string = string.replaceAll("&6", ChatColor.GOLD.toString());
        string = string.replaceAll("&e", ChatColor.YELLOW.toString());
        string = string.replaceAll("&2", ChatColor.DARK_GREEN.toString());
        string = string.replaceAll("&a", ChatColor.GREEN.toString());
        string = string.replaceAll("&b", ChatColor.AQUA.toString());
        string = string.replaceAll("&3", ChatColor.DARK_AQUA.toString());
        string = string.replaceAll("&1", ChatColor.DARK_BLUE.toString());
        string = string.replaceAll("&9", ChatColor.BLUE.toString());
        string = string.replaceAll("&d", ChatColor.LIGHT_PURPLE.toString());
        string = string.replaceAll("&5", ChatColor.DARK_PURPLE.toString());
        string = string.replaceAll("&f", ChatColor.WHITE.toString());
        string = string.replaceAll("&7", ChatColor.GRAY.toString());
        string = string.replaceAll("&8", ChatColor.DARK_GRAY.toString());
        string = string.replaceAll("&0", ChatColor.BLACK.toString());

        string = string.replaceAll("&l", ChatColor.BOLD.toString());
        string = string.replaceAll("&n", ChatColor.UNDERLINE.toString());
        string = string.replaceAll("&o", ChatColor.ITALIC.toString());
        string = string.replaceAll("&k", ChatColor.MAGIC.toString());
        string = string.replaceAll("&m", ChatColor.STRIKETHROUGH.toString());
        string = string.replaceAll("&r", ChatColor.RESET.toString());

        return string;
    }

}
