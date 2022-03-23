package main;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Cities {
    LinkedList<String> list=new LinkedList<>();

    public Cities (){

    }

    public LinkedList<String> getList(){
        list.add("Belgrade");
        list.add("Novi Sad");
        list.add("Nis");
        list.add("Kragujevac");
        list.add("Pancevo");
        list.add("Kraljevo");
        list.add("Vrsac");
        list.add("Subotica");
        list.add("Krusevac");
        list.add("Sabac");
        list.add("Zlatibor");
        list.add("Cacak");
        return list;

    }
}
