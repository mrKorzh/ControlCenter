package com.springapp.spaceobject.dao;


import com.springapp.spaceobject.SpaceObject;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpaceObjectRowMapper implements RowMapper<SpaceObject> {

    @Override
    public SpaceObject mapRow(ResultSet resultSet, int numRow) throws SQLException {
        SpaceObject spaceObject = new SpaceObject();
        spaceObject.setId(resultSet.getInt("id"));
        spaceObject.setState(resultSet.getDouble("state"));
        spaceObject.setRadius(resultSet.getDouble("radius"));
        spaceObject.setSpeed(resultSet.getDouble("speed"));
        spaceObject.setAngleSlopeSpeedVector(resultSet.getDouble("angleSlopeSpeedVector"));
        spaceObject.setInclination(resultSet.getDouble("inclination"));
        spaceObject.setLongitudeAscendingNode(resultSet.getDouble("longitudeAscendingNode"));
        spaceObject.setArgumentOfLatitude(resultSet.getDouble("argumentOfLatitude"));
        spaceObject.setX(resultSet.getDouble("x"));
        spaceObject.setY(resultSet.getDouble("y"));
        spaceObject.setZ(resultSet.getDouble("z"));
        spaceObject.setVx(resultSet.getDouble("vx"));
        spaceObject.setVy(resultSet.getDouble("vy"));
        spaceObject.setVz(resultSet.getDouble("vz"));
        spaceObject.setFi(resultSet.getDouble("fi"));
        spaceObject.setLambda(resultSet.getDouble("lambda"));
        spaceObject.setHeight(resultSet.getDouble("height"));
        spaceObject.setSigmaR(resultSet.getDouble("sigmaR"));
        spaceObject.setSigmaV(resultSet.getDouble("sigmaV"));
        spaceObject.setSigmaTetta(resultSet.getDouble("sigmaTetta"));
        spaceObject.setSigmaX(resultSet.getDouble("sigmaX"));
        spaceObject.setSigmaFi(resultSet.getDouble("sigmaFi"));
        spaceObject.setSigmaB(resultSet.getDouble("sigmaB"));

        return spaceObject;
    }
}
