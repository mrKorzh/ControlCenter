package com.springapp.services;

import com.springapp.services.firepower.FirePowerServiceClient;
import com.springapp.services.infotools.InfoToolsServiceClient;
import com.springapp.spaceobject.SpaceObject;
import com.springapp.spaceobject.dao.SpaceObjectDao;
import com.springapp.spaceobject.dao.SpaceObjectDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ControlCenterService")
public class ControlCenterController {

    // переделать DI
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    private SpaceObjectDaoImpl spaceObjectDao = (SpaceObjectDaoImpl)applicationContext.getBean("SpaceObjectDaoImpl");

    @Autowired
    private InfoToolsServiceClient infoToolsServiceClient;

    @Autowired
    private FirePowerServiceClient firePowerServiceClient;

    @RequestMapping(value = "/fromInfoTools")
    private void sendToFirePower(HttpServletRequest request) {
        System.out.println("Пришло с InfoTools");
        /* Придет
        [{radial_distance: 30000,
           polar_angle: 2.1,
           azimuth_angle: 1.3},
           {radial_distance: 40000,
           polar_angle: 1.7,
           azimuth_angle: 0.6}] */
        SpaceObject spaceObject = new SpaceObject();
        // засетить поля, перед этим перевести в x, y, z
        spaceObjectDao.insertSpaceObject(spaceObject);

        // здесь get запрос на FirePower чтоб получить список ОС и выбрать средство для выстрела
        firePowerServiceClient.sendToFirePowerGetList();

        // когда уже стреляем
        /* {radial_distance: 40000,
           polar_angle: 1.7,
           azimuth_angle: 0.6} + ID OC */
        firePowerServiceClient.sendToFirePowerTheShort("sdvdvsvssdvsdvsdv");
    }

    @RequestMapping(value = "/fromFirePower")
    private void getResultFromFirePower(HttpServletRequest request) {
        System.out.println("Успешный цикл");
    }

    @RequestMapping(value = "/fromControlCenter")   // начало цикла
    private void sendToInfoTools(HttpServletRequest request) {
        infoToolsServiceClient.sendToInfoTools("qwertty");
    }

    @RequestMapping(value = "/test")   // потом удалить (после полного тестирования бд)
    private void test(HttpServletRequest request) {
        SpaceObject spaceObject = new SpaceObject();
        spaceObject.setState(23432);
        spaceObject.setRadius(4324);
        spaceObject.setSpeed(4234);
        spaceObject.setAngleSlopeSpeedVector(4233);
        spaceObject.setInclination(3432);
        spaceObject.setLongitudeAscendingNode(6754);
        spaceObject.setArgumentOfLatitude(34523);
        spaceObject.setX(535);
        spaceObject.setY(4234);
        spaceObject.setZ(53463);
        spaceObject.setVx(454);
        spaceObject.setVy(6776);
        spaceObject.setVz(676);
        spaceObject.setFi(4543);
        spaceObject.setLambda(4543);
        spaceObject.setHeight(463);
        spaceObject.setSigmaR(5435);
        spaceObject.setSigmaV(6546);
        spaceObject.setSigmaTetta(634643);
        spaceObject.setSigmaX(545);
        spaceObject.setSigmaFi(4543);
        spaceObject.setSigmaB(8568);
        spaceObjectDao.insertSpaceObject(spaceObject);
    }

}
