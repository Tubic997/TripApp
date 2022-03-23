package serviceUtil;

import main.Cities;
import util.Util;

import java.util.LinkedList;

public class Service {

    public static void menu1(){

        String info= Util.fillUserInfo();
        System.out.println(info);
        System.out.println("Welcome..");
        String city=Util.enterString("Where do you want to go?");
        String toUpperCity=city.toUpperCase();
        System.out.println("Checking destinations for "+city.toUpperCase());
        Cities cities=new Cities();
        LinkedList<String> list = cities.getList();
        if(list.contains(toUpperCity)){
            System.out.println("The are available trips for"+ toUpperCity+"...");
            String tripInfo=Util.fillTripInfo();
            System.out.println(tripInfo);


        }else {
            System.out.println("There are no available trips\tHere are the active trips");
            Cities cities2=new Cities();
            LinkedList<String> list1=cities2.getList();
            for (String s:list1){
                System.out.println(s);
            }
        }
    }

    public static void menu2(){
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType=Util.enterString("Please enter your car");
        String placeTo=Util.enterString("Where do you ride?");
        String placeFrom=Util.enterString("Your current locatin?");
        int capacity=Util.enterInteger("How many passengers you can carry?");
        String requires=Util.enterString("Enter Requires: For example:(SMOKING-NO +" +
                "PET-YES,Luggage-No)");
        System.out.println("Car type:" + carType + " from " + placeFrom + " to " + placeTo + " with " + capacity +
                " passengers and with these requires: " + requires);
    }

}
