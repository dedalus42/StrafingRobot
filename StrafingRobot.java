package eoh;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class StrafingRobot extends Robot {

    public void run() {

        while (true) {

            turnLeft(90);

            ahead(100);

            turnGunLeft(360);

            back(100);

            turnGunRight(360);

        }

    }

    public void onScannedRobot(ScannedRobotEvent e) {

        fire(1);

    }

}
  		
