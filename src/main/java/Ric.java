import events.HelloEvent;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class Ric {

    public static void main(String[] args) throws LoginException {
        JDA jda = new JDABuilder("NTYzNjkyNTc3MTgyNzExODA4.XKdCUQ.iLAbdzL59qV0JHgJFGdezv-OehQ").build();

        jda.addEventListener(new HelloEvent());
    }
}
