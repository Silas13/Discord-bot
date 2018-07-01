package listener;


import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class onReady extends ListenerAdapter {


    public void onReady(ReadyEvent e) {
        System.out.println("Ready");

    }
}




