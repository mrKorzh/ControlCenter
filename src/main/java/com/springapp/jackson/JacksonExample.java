package com.springapp.jackson;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JacksonExample {

    public static void main(String[] args) {

        MonitoringArea monitoringArea = new MonitoringArea();
        monitoringArea.setSquare(3423);
        ObjectMapper mapper = new ObjectMapper();
        String json;

        try {
            json = mapper.writeValueAsString(monitoringArea);
            System.out.println(json);
            monitoringArea = mapper.readValue(json, MonitoringArea.class);
            System.out.println(monitoringArea.getSquare());
            System.out.println(monitoringArea.getKoordinates().size());
        } catch (JsonGenerationException|JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
