package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] m = {};
        double[]x = {};
        double[][]n = new double[12][15];
        for(int i = 3; i <= 25; i++)
        {
            m = Arrays.copyOf(m, m.length + 1);
            m[m.length - 1] = i;
        }
        for(int i = 1; i <= 15; i++)
        {
            x =  Arrays.copyOf(x, x.length + 1);
            x[x.length - 1] = rnd(-6, 8);
        }
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(x));
    }

    public static double rnd(double min, double max)
    {
        return (double) (Math.random() * (max - min + 1)) + min;
    }
//    public static double getValue(int i,int  j)
//    {
//        for(int a = 0; a < 12; a++)
//        {
//
//        }
//    }
}
