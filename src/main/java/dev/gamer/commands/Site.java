package dev.gamer.commands;

import dev.gamer.DevServerInf;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Site implements CommandExecutor {

    public Site(DevServerInf devServerInf) {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        String s = DevServerInf.getDevServerInf().getConfig().getString("Site");

        if (cmd.getName().equalsIgnoreCase("site")) {
            if(DevServerInf.getDevServerInf().getConfig().getString("Site").equals("null")) {
                p.sendMessage("§5 O Servidor não possui um Site!");
            }else {
                p.sendMessage("§5O Site do servidor é: §c"+ s);
            }

        }


        return false;
    }
}
