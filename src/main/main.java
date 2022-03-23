package main;

import util.Util;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to TripApp\n\tYour Ride and Your Choice");
        Scanner scanner=new Scanner(System.in);
        String services="1:Find Ride\n" +
                        "2:Offer Ride\n" +
                        "3:About Us\n" +
                        "0:Quit";
        System.out.println(services);
        int menu=scanner.nextInt();

        if (menu==1){
            Util.fillInfo();


        }

        else if (menu==2) {
            System.out.println("Offering ride");
        }
        else if (menu==3){
            System.out.println("This is about us");
        }
        else if (menu==0){
            System.out.println("Exiting from system");
        }
    }
}
