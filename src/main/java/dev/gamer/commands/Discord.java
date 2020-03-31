package dev.gamer.commands;

import dev.gamer.DevServerInf;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Discord implements CommandExecutor {

    public Discord(DevServerInf devServerInf) {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        String d = DevServerInf.getDevServerInf().getConfig().getString("Discord");



        if (cmd.getName().equalsIgnoreCase("discord")) {
            if(DevServerInf.getDevServerInf().getConfig().getString("Discord").equals("null")) {
                p.sendMessage("§5 O Servidor não possui um Discord!");
            }else {
                p.sendMessage("§5O Discord do servidor é: §c"+ d);
            }
        }


        return false;
    }
}
