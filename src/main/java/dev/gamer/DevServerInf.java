package dev.gamer;

import dev.gamer.commands.Discord;
import dev.gamer.commands.Forum;
import dev.gamer.commands.Redes;
import dev.gamer.commands.Site;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class DevServerInf extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§8[§6DevGamer§8] §7§l* &bPlugin Iniciado!");

        getCommand("discord").setExecutor(new Discord(this));
        getCommand("site").setExecutor(new Site(this));
        getCommand("forum").setExecutor(new Forum(this));
        getCommand("redes").setExecutor(new Redes(this));


        if(!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§8[§6DevGamer§8] §7§l* &bPlugin Finalizado!");

    }
    public static DevServerInf getDevServerInf(){
        return (DevServerInf) Bukkit.getServer().getPluginManager().getPlugin("DevServerInf");
    }

}
