package com.springapp.services.infotools;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class InfoToolsServiceClientImpl implements InfoToolsServiceClient {

    //@Value("${services.infotools.url}")
    private String infoToolsServiceUrl = "http://localhost:8884";

    @Override
    public void sendToInfoTools(String json) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(infoToolsServiceUrl + "/InfoToolsService/fromControlCenter");

            List<NameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("json", json));

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8));

            try (CloseableHttpResponse response = httpclient.execute(httpPost)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    try (InputStream inputStream = entity.getContent()) {
                    }
                }
            }
        } catch (IOException e) {}
    }
}
