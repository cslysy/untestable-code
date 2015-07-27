package com.jakubsprega.untestable.code.f;

import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Google client
 *
 * @author jakubsprega
 */
public class GoogleClient {
    
    private static final String DEFAULT_GOOGLE_API_URL = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";

    private final String googleApiUrl;
    private final Charset charset;

    public GoogleClient(String googleApiUrl, Charset charset) {
        this.googleApiUrl = googleApiUrl;
        this.charset = charset;
    }

    public GoogleClient() {
        this(DEFAULT_GOOGLE_API_URL, StandardCharsets.UTF_8);
    }

    public GoogleClient(String googleApiUrl) {
        this(googleApiUrl, StandardCharsets.UTF_8);
    }
    
    public GoogleClient(Charset charset) {
        this(DEFAULT_GOOGLE_API_URL, charset);
    }

    public GoogleResult search(String searchPhrase) throws Exception {
        String googleRequestUrl = String.format(
            "%s%s", googleApiUrl, URLEncoder.encode(searchPhrase, charset.name())
        );

        URL url = new URL(googleRequestUrl);
        String rawJsonGoogleResponse = CharStreams.toString(
            new InputStreamReader(url.openStream(), charset)
        );

        GoogleResult results = new Gson().fromJson(rawJsonGoogleResponse, GoogleResult.class);

        return results;
    }
}
