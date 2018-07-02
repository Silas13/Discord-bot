package listener;


import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class ReadyEvent extends ListenerAdapter {


    public void onReady(net.dv8tion.jda.core.events.ReadyEvent e) {
        System.out.println("Ready");

    }
}




