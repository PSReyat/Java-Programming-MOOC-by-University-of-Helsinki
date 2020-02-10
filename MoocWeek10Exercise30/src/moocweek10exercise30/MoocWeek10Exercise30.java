/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise30;

import containers.ContainerHistory;
import containers.ProductContainer;
import containers.ProductContainerRecorder;

/**
 *
 * @author Trigg
 */
public class MoocWeek10Exercise30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.addToTheContainer(11.3);
        juice.takeFromTheContainer(1.0);
        
        juice.printAnalysis();
    }

}
