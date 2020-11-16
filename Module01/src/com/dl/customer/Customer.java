package com.dl.customer;

import java.util.ArrayList;

public class Customer {

    //main psvm
    public static void main(String[] args){
        System.out.println("hello customer");
        String mystring = new String("aaaa");
        //this is a line comment

        //sout,soutv,soutm,soutp,xxx.sout
        System.out.println( );
        System.out.println("mystring = " + mystring);
        System.out.println("Customer.main");
        System.out.println("args = [" + args + "]");

        //fori
        String[] arr = new String[]{"1", "2", "3"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr = " + arr[i]);
        }

        //list遍历 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(122);
        list.add(124);
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (list == null) {
            
        }

        //inn
        if (list != null) {

        }


    }

}
