package hr.unipu.ntp;

import java.util.Date;

public class HelloNtp2 {

    public static void main(String[] args) {
        System.out.println("It's something!");

        if (args.length != 2) {
            System.out.println("But is error!");
            return;
        }

        String name = args[0];
        System.out.println("Hello " + name + "!");

        int mode = Integer.valueOf(args[1]);

        if (mode > 0)
            System.out.println("Today, " + new Date() + ", is a good day for learning in Java");
        else
            System.out.println("Today, " + new Date() + ", is a bad day for learning in Java");

    }
}
