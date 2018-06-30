package core;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {

public static void main(String args[]){
    JDA jda = new JDABuilder(AccountType.BOT).setToken("token").buildBlocking();


}

}
