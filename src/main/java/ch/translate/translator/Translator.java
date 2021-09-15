package ch.translate.translator;

import ch.translate.language.Language;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Translator {
    private static final String AUTH_KEY = null;
    private static final String DEEPL_URL = "https://api-free.deepl.com/v2/translate";

    public Translator(String authKey) {
        authKey = AUTH_KEY;
    }

    public void translate(String text, Language language) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DEEPL_URL)).build();

    }
}
