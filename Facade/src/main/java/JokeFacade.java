import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JokeFacade {

    public String getAttributeValueFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {
        StringBuilder content;
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(content.toString());
            if (jsonObject.containsKey(attributeName)) {
                return (String) jsonObject.get(attributeName);}
            else throw new IllegalArgumentException();
        } catch (IOException | ParseException | IllegalArgumentException e) {
            if (e instanceof IllegalArgumentException) {
                System.out.println("Could not find attribute: " + attributeName);
            }
            if (e instanceof ParseException) {
                System.out.println("Failed parsing JSON");
            }
            if (e instanceof IOException) {
                System.out.println("Invalid HTTP");
            }
            throw new RuntimeException(e);
        } finally {
            con.disconnect();
        }
    }
}
