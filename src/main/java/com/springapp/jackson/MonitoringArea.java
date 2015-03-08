package com.springapp.jackson;


import java.util.ArrayList;
import java.util.List;

public class MonitoringArea {

    // структура поменяется

    private int square;

    private List<String> koordinates = new ArrayList<String>() {
        {
            add("x");
            add("y");
            add("z");
        }
    };

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public List<String> getKoordinates() {
        return koordinates;
    }

    public void setKoordinates(List<String> koordinates) {
        this.koordinates = koordinates;
    }

    @Override
    public String toString() {
        return "MonitoringArea [square=" + square + "," + "messages=" + koordinates + "]";
    }
}
