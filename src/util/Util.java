package util;

import java.util.Scanner;

public class Util {

    public static  String enterString(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;

    }


    public static String fillInfo(){
        String nameSurname= enterString("Enter name and surname");
        String email= enterString("Enter your email");
        String phone= enterString("Enter your number");
        return "name: " + nameSurname + " email " + email + "phone" +phone;
    }

}
