package core;

import commands.Shutdowncmd;
import listener.ReadyEvent;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import util.Secret;

import javax.security.auth.login.LoginException;



public class Main  {

public static void main(String[] args){
    JDABuilder builder = new JDABuilder(AccountType.BOT);
    builder.setToken(Secret.token);
    builder.setAutoReconnect(true);
    builder.setStatus(OnlineStatus.ONLINE);
    builder.addEventListener(new ReadyEvent());
    builder.addEventListener(new Shutdowncmd());

    try {
       builder.buildBlocking();
    } catch (LoginException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }



}

}
