package core;

import commands.shutdowncmd;
import listener.onReady;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import util.Secret;

import javax.security.auth.login.LoginException;



public class Main  {

public static void main(String args[]){
    JDABuilder jda = new JDABuilder(AccountType.BOT);
    jda.setToken(Secret.token);
    jda.setAutoReconnect(true);
    jda.setStatus(OnlineStatus.ONLINE);
    jda.addEventListener(new onReady());
    jda.addEventListener(new shutdowncmd());
    try {
        jda.buildBlocking();
    } catch (LoginException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


}

}
