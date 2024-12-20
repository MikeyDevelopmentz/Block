package mikey.block;
// took 10 minutes to make hehe
import org.bukkit.plugin.java.JavaPlugin;

public final class Block extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("███╗   ███╗██╗██╗  ██╗███████╗██╗   ██╗");
        getLogger().info("████╗ ████║██║██║ ██╔╝██╔════╝╚██╗ ██╔╝");
        getLogger().info("██╔████╔██║██║█████╔╝ █████╗   ╚████╔╝ ");
        getLogger().info("██║╚██╔╝██║██║██╔═██╗ ██╔══╝    ╚██╔╝  ");
        getLogger().info("██║ ╚═╝ ██║██║██║  ██╗███████╗   ██║   ");
        getLogger().info("╚═╝     ╚═╝╚═╝╚═╝  ╚═╝╚══════╝   ╚═╝   ");
        getLogger().info("===========================================");
        getLogger().info("           Plugin by mikey aka voidspectre_.               ");
        getLogger().info("===========================================");
        getServer().getPluginManager().registerEvents(new ExplosionListener(), this);

    }
}


