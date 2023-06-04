package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class Timer
        implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        var time = Instant.ofEpochMilli(event.getWhen());
        System.out.printf("the time is %s \n", time);
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String... args){
        var timer = new Timer();
        var clock = new javax.swing.Timer(2000, timer);
        clock.start();
        JOptionPane.showMessageDialog(null, "do you want to exit?");
        System.exit(0);
    }
}
