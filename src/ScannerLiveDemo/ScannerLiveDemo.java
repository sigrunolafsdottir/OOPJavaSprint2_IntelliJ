package ScannerLiveDemo;

import java.util.Scanner;

public class ScannerLiveDemo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("före scanner");

        if (sc.hasNextDouble()){
            System.out.println("mellanstation");
            //System.out.println(sc.nextDouble());
        }
        System.out.println("efter scanner");

    }


}
