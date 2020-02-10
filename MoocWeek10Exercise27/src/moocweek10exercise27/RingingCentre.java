/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise27;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class RingingCentre {
    private Map<Bird, List<String>> sightings;
    
    public RingingCentre(){
        this.sightings = new HashMap<>();
    }
    
    public void observe(Bird bird, String place){
        if(!this.sightings.containsKey(bird)){
            this.sightings.put(bird, new ArrayList<>());
        }
        
        this.sightings.get(bird).add(place);
    }
  
    public void observations(Bird bird) {
        try {
            int observations = this.sightings.get(bird).size();
            System.out.println(bird + ", obserations: " + observations);
            for (int i = 0; i < observations; i++) {
                if (observations == 0) {
                    break;
                }
                System.out.println(this.sightings.get(bird).get(i));
            }
        } catch (Exception e) {
            System.out.println(bird + ", observations: " + 0);
        }

    }
}
