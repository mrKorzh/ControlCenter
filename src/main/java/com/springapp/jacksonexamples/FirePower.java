package com.springapp.jacksonexamples;

public class FirePower {

    private int type;

    private int number;

    private double stateLongitude;

    private double stateLatitude;

    private double stateHeight;

    private double rangeMax;

    private double rangeMin;

    private double azimutMax;

    private double azimutMin;

    private double placeAngleMax;

    private double placeAngleMin;

    private double operativnostMin;

    private double operativnostMax;

    private double chanceSuccessMin;

    private double chanceSuccessMax;

    private double chanceSuccessRatingResult;

    private double chanceFalseAlarm;

    private int countInTime;

    public FirePower() {}

    public FirePower(int type, int number, double stateLongitude, double stateLatitude, double stateHeight,
                     double rangeMax, double rangeMin, double azimutMax, double azimutMin, double placeAngleMax,
                     double placeAngleMin, double operativnostMin, double operativnostMax, double chanceSuccessMin,
                     double chanceSuccessMax, double chanceSuccessRatingResult, double chanceFalseAlarm, int countInTime) {
        this.type = type;
        this.number = number;
        this.stateLongitude = stateLongitude;
        this.stateLatitude = stateLatitude;
        this.stateHeight = stateHeight;
        this.rangeMax = rangeMax;
        this.rangeMin = rangeMin;
        this.azimutMax = azimutMax;
        this.azimutMin = azimutMin;
        this.placeAngleMax = placeAngleMax;
        this.placeAngleMin = placeAngleMin;
        this.operativnostMin = operativnostMin;
        this.operativnostMax = operativnostMax;
        this.chanceSuccessMin = chanceSuccessMin;
        this.chanceSuccessMax = chanceSuccessMax;
        this.chanceSuccessRatingResult = chanceSuccessRatingResult;
        this.chanceFalseAlarm = chanceFalseAlarm;
        this.countInTime = countInTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getStateLongitude() {
        return stateLongitude;
    }

    public void setStateLongitude(double stateLongitude) {
        this.stateLongitude = stateLongitude;
    }

    public double getStateLatitude() {
        return stateLatitude;
    }

    public void setStateLatitude(double stateLatitude) {
        this.stateLatitude = stateLatitude;
    }

    public double getStateHeight() {
        return stateHeight;
    }

    public void setStateHeight(double stateHeight) {
        this.stateHeight = stateHeight;
    }

    public double getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(double rangeMax) {
        this.rangeMax = rangeMax;
    }

    public double getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(double rangeMin) {
        this.rangeMin = rangeMin;
    }

    public double getAzimutMax() {
        return azimutMax;
    }

    public void setAzimutMax(double azimutMax) {
        this.azimutMax = azimutMax;
    }

    public double getAzimutMin() {
        return azimutMin;
    }

    public void setAzimutMin(double azimutMin) {
        this.azimutMin = azimutMin;
    }

    public double getPlaceAngleMax() {
        return placeAngleMax;
    }

    public void setPlaceAngleMax(double placeAngleMax) {
        this.placeAngleMax = placeAngleMax;
    }

    public double getPlaceAngleMin() {
        return placeAngleMin;
    }

    public void setPlaceAngleMin(double placeAngleMin) {
        this.placeAngleMin = placeAngleMin;
    }

    public double getOperativnostMin() {
        return operativnostMin;
    }

    public void setOperativnostMin(double operativnostMin) {
        this.operativnostMin = operativnostMin;
    }

    public double getOperativnostMax() {
        return operativnostMax;
    }

    public void setOperativnostMax(double operativnostMax) {
        this.operativnostMax = operativnostMax;
    }

    public double getChanceSuccessMin() {
        return chanceSuccessMin;
    }

    public void setChanceSuccessMin(double chanceSuccessMin) {
        this.chanceSuccessMin = chanceSuccessMin;
    }

    public double getChanceSuccessMax() {
        return chanceSuccessMax;
    }

    public void setChanceSuccessMax(double chanceSuccessMax) {
        this.chanceSuccessMax = chanceSuccessMax;
    }

    public double getChanceSuccessRatingResult() {
        return chanceSuccessRatingResult;
    }

    public void setChanceSuccessRatingResult(double chanceSuccessRatingResult) {
        this.chanceSuccessRatingResult = chanceSuccessRatingResult;
    }

    public double getChanceFalseAlarm() {
        return chanceFalseAlarm;
    }

    public void setChanceFalseAlarm(double chanceFalseAlarm) {
        this.chanceFalseAlarm = chanceFalseAlarm;
    }

    public int getCountInTime() {
        return countInTime;
    }

    public void setCountInTime(int countInTime) {
        this.countInTime = countInTime;
    }
}
