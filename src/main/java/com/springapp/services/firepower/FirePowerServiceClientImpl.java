package com.springapp.services.firepower;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class FirePowerServiceClientImpl implements FirePowerServiceClient {

    private String firePowerServiceUrl = "http://localhost:8082";

    @Override
    public void sendToFirePowerTheShort(String json) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(firePowerServiceUrl + "/FirePowerService/fromControlCenter");

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

    @Override
    public String sendToFirePowerGetList() {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(firePowerServiceUrl + "/FirePowerService/getFirePowerList");

            HttpResponse response = client.execute(request);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result);
            return result.toString();
        }  catch (IOException e) {
            System.out.println(e);
            return e.toString();
        }
    }

}
