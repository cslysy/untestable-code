package com.jakubsprega.untestable.code.f;

import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Google client
 * 
 * @author jakubsprega
 */
public class GoogleClient {

    public GoogleResult search(String searchPhrase) throws Exception {
        String googleApiUrl = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
        String charset = "UTF-8";
        URL url = new URL(googleApiUrl + URLEncoder.encode(searchPhrase, charset));
        String rawJsonGoogleResponse = CharStreams.toString(
            new InputStreamReader(url.openStream(), charset)
        );
        
        GoogleResult results = new Gson().fromJson(rawJsonGoogleResponse, GoogleResult.class);
        return results;
    }
}
