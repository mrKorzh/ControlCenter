package com.springapp.services.firepower;

public interface FirePowerServiceClient {

    void sendToFirePowerTheShort(String json);

    String sendToFirePowerGetList();

}
