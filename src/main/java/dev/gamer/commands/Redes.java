package dev.gamer.commands;

import dev.gamer.DevServerInf;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Redes implements CommandExecutor {
    public Redes(DevServerInf devServerInf) {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        String s = DevServerInf.getDevServerInf().getConfig().getString("Site");
        String f = DevServerInf.getDevServerInf().getConfig().getString("Forum");
        String d = DevServerInf.getDevServerInf().getConfig().getString("Discord");

        if (cmd.getName().equalsIgnoreCase("redes")) {

            if(DevServerInf.getDevServerInf().getConfig().getString("Discord").equals("null")) {
                p.sendMessage("§5O servidor não possui um discord!");
            }else{
                p.sendMessage("§5O Discord do servidor é: §c"+ d);
            }
            if(DevServerInf.getDevServerInf().getConfig().getString("Forum").equals("null")) {
                p.sendMessage("§5O servidor não possui um forum!");
            }else{
                p.sendMessage("§5O Forum do servidor é: §c"+ f);
            }
            if(DevServerInf.getDevServerInf().getConfig().getString("Site").equals("null")) {
                p.sendMessage("§5O servidor não possui um Site!");
            }else{
                p.sendMessage("§5O Site do servidor é: §c"+ s);
            }

        }


        return false;
    }
}
