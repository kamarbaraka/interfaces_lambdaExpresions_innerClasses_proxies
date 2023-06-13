/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.Instant;

/**
 * a program to impliment inner classes
 * @author kamar baraka
 * @version 1.0.0
 * @since 10/06/2023
 */

public class TalkingClock {
    /**
     * instance fields*/
    private int interval;
    private boolean beep;

    /**
     * the constructor
     * @param interval the time interval in ms
     * @param beep true if you want a beep
     * */
    public TalkingClock(int interval, boolean beep){
        this.beep = beep;
        this.interval = interval;
    }

    /**
     * the inner class*/
    public class TimePrinter
            implements ActionListener{

        /**
         * @param event Action event object or lambda
         * */
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.printf("at the beep the time is %s\n", Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }

    /**
     * method to initialize the inner class  */
    public void start(){
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public static void main(String... args){
        var beep = true;
        var clock = new TalkingClock(1000,beep);
        clock.start();
        JOptionPane.showMessageDialog(null, "quit?");
        System.out.println(TimePrinter.class);
        System.exit(12);
    }
}
