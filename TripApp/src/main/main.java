package main;

import jdk.nashorn.internal.ir.WhileNode;
import serviceUtil.Service;
import util.Util;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to TripApp\n\tYour Ride and Your Choice");
        String nationality = Util.enterString("Please tell us, are you a foreign or native?");
        Scanner scanner=new Scanner(System.in);
        String services="1:Find Ride\n" +
                        "2:Offer Ride\n" +
                        "3:About Us\n" +
                        "0:Quit";
        System.out.println(services);
        while (true){
            int menu=scanner.nextInt();
            String information= "";
             if (nationality.equalsIgnoreCase("foreign")){
            information=Util.enterString("Enter your passport id:");
            System.out.println("Ckecking passport id for :"+information);
            Thread.sleep(5000);
                 System.out.println("Procces completed successuflly");

        }
        else if (nationality.equalsIgnoreCase("native")){

        }else {
            System.out.println("Invalid operation");
            break;
        }
        if (menu==1){
            Service.menu1();
            break;

        } else if (menu==2) {
            Service.menu2();
            break;

        } else if (menu==3){


        } else if (menu==0) {
            System.out.println("Exiting from system");
            continue;
        }
        }
    }
}
