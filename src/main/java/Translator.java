import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Translator {
    final static String AUTH_KEY = null;

    public Translator(String authKey) {
        authKey = AUTH_KEY;
    }

    public void translate(String text, Language language) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api-free.deepl.com/v2/translate")).build();

    }
}
