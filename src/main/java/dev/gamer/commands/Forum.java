package dev.gamer.commands;

import dev.gamer.DevServerInf;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Forum implements CommandExecutor {

    public Forum(DevServerInf devServerInf) {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        String f = DevServerInf.getDevServerInf().getConfig().getString("Forum");

        if (cmd.getName().equalsIgnoreCase("forum")) {
            if(DevServerInf.getDevServerInf().getConfig().getString("Forum").equals("null")) {
                p.sendMessage("§5 O Servidor não possui um Forum!");
            }else {
                p.sendMessage("§5O Forum do servidor é: §c"+ f);
            }

        }


        return false;
    }
}
