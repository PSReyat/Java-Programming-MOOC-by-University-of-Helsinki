/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

//Used in conjunction with BoundedCounter.

/*
    Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
*/

/**
 *
 * @author Trigg
 */
public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(hoursAtBeginning, 23);
        this.minutes = new BoundedCounter(minutesAtBeginning, 59);
        this.seconds = new BoundedCounter(secondsAtBeginning, 59);
        
    }

    public void tick(){
        this.seconds.next();
        if(this.seconds.getValue() == 0){
            this.minutes.next();

            if(this.minutes.getValue() == 0){
                this.hours.next();

                if(this.hours.getValue() == 24){
                    this.hours.next();
                }
            }
        }
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
