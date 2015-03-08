package com.springapp.spaceobject.dao;

import com.springapp.spaceobject.SpaceObject;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpaceObjectDaoImpl implements SpaceObjectDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertSpaceObject(SpaceObject spaceObject) {
        String sql = "insert into catalog (state, radius, speed, angleSlopeSpeedVector, inclination, longitudeAscendingNode, " +
                "argumentOfLatitude, x, y, z, vx, vy, vz, fi, lambda, height, sigmaR, sigmaV, sigmaTetta, sigmaX, sigmaFi, sigmaB) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update( sql,
                spaceObject.getState(),
                spaceObject.getRadius(),
                spaceObject.getSpeed(),
                spaceObject.getAngleSlopeSpeedVector(),
                spaceObject.getInclination(),
                spaceObject.getLongitudeAscendingNode(),
                spaceObject.getArgumentOfLatitude(),
                spaceObject.getX(), spaceObject.getY(),
                spaceObject.getZ(),
                spaceObject.getVx(),
                spaceObject.getVy(),
                spaceObject.getVz(),
                spaceObject.getFi(),
                spaceObject.getLambda(),
                spaceObject.getHeight(),
                spaceObject.getSigmaR(),
                spaceObject.getSigmaV(),
                spaceObject.getSigmaTetta(),
                spaceObject.getSigmaX(),
                spaceObject.getSigmaFi(),
                spaceObject.getSigmaB());

        System.out.println("Created record: "
                +"state = " + spaceObject.getState()
                +" radius = " + spaceObject.getRadius()
                + " speed = " + spaceObject.getSpeed()
                +" angleSlopeSpeedVector = " + spaceObject.getAngleSlopeSpeedVector()
                + " inclination = " + spaceObject.getInclination()
                + " longitudeAscendingNode = " + spaceObject.getLongitudeAscendingNode()
                + " argumentOfLatitude = " + spaceObject.getArgumentOfLatitude()
                + " x = " + spaceObject.getX()
                +" y = " + spaceObject.getY()
                +" z = " + spaceObject.getZ()
                + " vx = " + spaceObject.getVx()
                +" vy = " + spaceObject.getVy()
                +" vz = " + spaceObject.getVz()
                + " fi = " + spaceObject.getFi()
                +" lambda = " + spaceObject.getLambda()
                +" height = " + spaceObject.getHeight()
                + " sigmaR = " + spaceObject.getSigmaR()
                +" sigmaV = " + spaceObject.getSigmaV()
                + " sigmaTetta = " + spaceObject.getSigmaTetta()
                +" sigmaX = " + spaceObject.getSigmaX()
                + " sigmaFi = " + spaceObject.getSigmaFi()
                +" sigmaB = " + spaceObject.getSigmaB());
    }
}
