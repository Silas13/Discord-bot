package commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import util.Prefix;

public class shutdowncmd extends ListenerAdapter {

public void onRecieve(GuildMessageReceivedEvent e){

  String[] args = e.getMessage().getContentRaw().split(" ");
    System.out.println("test");
  if(args[0].equalsIgnoreCase(Prefix.prefix + "shutdown")){
      e.getJDA().shutdownNow();

  }
}



}
