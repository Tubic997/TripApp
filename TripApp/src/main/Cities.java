package main;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Cities {
    LinkedList<String> list=new LinkedList<>();

    public Cities (){

    }

    public LinkedList<String> getList(){
        list.add("BELGRADE");
        list.add("SABAC");
        list.add("NIS");
        list.add("KRAGUJEVAC");
        list.add("PANCEVO");
        list.add("KRALJEVO");
        list.add("VRSAC");
        list.add("SUBOTICA");
        list.add("KRUSEVAC");
        list.add("ZRENJANIN");
        list.add("ZLATIBOR");
        list.add("CACAK");
        return list;

    }
}
