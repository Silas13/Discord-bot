package listener;


import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class onReady extends ListenerAdapter {


    public void onJoin(ReadyEvent e) {
        System.out.println("Im ready");

    }
}




