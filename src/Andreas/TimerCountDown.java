/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andreas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Andreas Styltsvig
 */
public class TimerCountDown{
    
    int delay = 1000;
    Timer timer;
    int counter = 10;
    
    public void setCounter(int counter){
        this.counter = counter;
    }
    
    public int StartCountDown() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (counter == 0) {
                    timer.stop();
                } else {
                    counter--;
                }
            }
        };

        timer = new Timer(delay, action);
        timer.setInitialDelay(0);
        timer.start();
        
        return counter;
    }

}
