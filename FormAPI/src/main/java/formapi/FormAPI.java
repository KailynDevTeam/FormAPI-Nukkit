package formapi;

import cn.nukkit.plugin.PluginBase;

public class FormAPI extends PluginBase {

    @Override
    public void onEnable()
    {
        getLogger().info("§2FormAPI Aktif");
        getServer().getPluginManager().registerEvents(new FormEvent(), this);
    }
}