/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TalkingClockAsLocal {

    private boolean beep;
    private int interval;

    public TalkingClockAsLocal(int interval, boolean beep){

        this.beep = beep;
        this.interval = interval;

    }

    public void start(){

        class PrintTimer
                implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.printf("at the beep the time is %s",
                        Instant.ofEpochMilli(e.getWhen()));

                if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }

        }

        var listener = new PrintTimer();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    /**
     * anonymous inner class*/
    public void start1(int interval, boolean beep){
        var listener = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                System.out.printf("at the beep the time is %s",
                        Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(1000, listener);
        timer.start();
    }

    public static void main(String... args){

        /*var clock = new TalkingClockAsLocal(1000, true);
        clock.start1(1000, true);*/

        System.err.println("hello kamar");
    }
}
