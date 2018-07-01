package core;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.JDAInfo;
import net.dv8tion.jda.core.entities.Game;
import util.Secret;

public class Main {

public static void main(String args[]){
    JDABuilder jda = new JDABuilder(AccountType.BOT)
    .setToken(Secret.token)
    .buildBlocking();




   }

}
