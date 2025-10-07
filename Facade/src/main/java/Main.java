import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        JokeClient jc = new JokeClient();
        jc.getRandomJoke();
        */
        JokeFacade jf = new JokeFacade();
        System.out.println(jf.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "date"));
        System.out.println(jf.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "icon_url"));
        //Faulty HTTP
        //System.out.println(jf.getAttributeValueFromJson("https://api.chuckknorris.io/jokes/random", "icon_url"));
        //Faulty attribute name
        //System.out.println(jf.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "datte"));


    }
}
