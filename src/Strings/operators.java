package src.Strings;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 5));

        System.out.println("a" +1);
        // this is same as afteer a few steps a+1;
        // integer will be converted to Integer that will call-toString()

        System.out.println("Reyaz" + new ArrayList<>());
        System.out.println("Reyaz" + new Integer(55));
        System.out.println(new Integer(45) + "" + new ArrayList<>() );
    }
}
