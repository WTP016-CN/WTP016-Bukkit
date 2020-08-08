package cn.wtp016cn.wtp016test;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class WTP016test<True> extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, World!");
        getLogger().info("This Plugins is open source on Github.");

    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye, World!");
        getLogger().info("I want to see you again.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("hello")) { //如果玩家输入了/hello则执行如下内容...
            sender.sendMessage("This is WTP016's beta extensions, version: v0.0.1-Alpha(SNAPSHOT)");
            return true;
        } else if (cmd.getName().equalsIgnoreCase("hello2")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command only can use by player.");
            } else {
                Player player = (Player) sender;
                sender.sendMessage("This is WTP016's beta extensions. Version: v0.0.1-Alpha");
            }
        }
    }





