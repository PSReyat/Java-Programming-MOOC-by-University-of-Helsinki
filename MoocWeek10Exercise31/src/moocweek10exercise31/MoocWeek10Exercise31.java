/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise31;

import farmsimulator.Alive;
import farmsimulator.Barn;
import farmsimulator.BulkTank;
import farmsimulator.Cow;
import farmsimulator.Farm;
import farmsimulator.Milkable;
import farmsimulator.MilkingRobot;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class MoocWeek10Exercise31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());

        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);
    }

}
