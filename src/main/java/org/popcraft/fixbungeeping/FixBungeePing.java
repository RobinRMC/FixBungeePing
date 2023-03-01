package org.popcraft.fixbungeeping;

import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

public final class FixBungeePing extends Plugin implements Listener {
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, this);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onProxyPing(final ProxyPingEvent event) {
        event.getResponse().getPlayers().setSample(new ServerPing.PlayerInfo[]{});
    }
}
