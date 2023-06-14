/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package inner_classes;

import java.util.List;

public class StaticInnerClass {

    public static void main(String... args){

        var values = new double[]{5, 75, 16};
        var maxmin = MaxMinFinder.getMaxMin(values);

        System.out.println(maxmin.getMax());
        System.out.println(maxmin.getMin());
    }
}

class MaxMinFinder {

    public static MaxMinHolder getMaxMin(double... values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double value : values){
            if (value < min) min = value;
            if (value > max) max = value;
        }

        return new MaxMinHolder(max, min);
    }

    public static class MaxMinHolder{
        private double max;
        private double min;

        public MaxMinHolder(double max, double min){
            this.max = max;
            this.min = min;
        }

        public double getMax(){
            return this.max;
        }

        public double getMin(){
            return this.min;
        }
    }
}
