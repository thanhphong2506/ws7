package com.fpt;

import java.util.Arrays;
import java.util.Scanner;

public class Validate {
    public static String inputString(boolean allowEmpty, String notice) {
        try{
            System.out.println(notice);
            String s = new Scanner(System.in).nextLine();
            if(!allowEmpty) if(s.isEmpty()) throw  new Exception();
            return s;
        }
        catch (Exception e) {
            System.out.println("String is not valid. try again!");
            return inputString(allowEmpty,notice);
        }
    }
    public  static String selectOption (String notice , String ...option) {
        try {
            System.out.println(notice);
            String s = new Scanner(System.in).nextLine();
            boolean flag = false;
            for (String tmp : option) {
                if (s.equalsIgnoreCase(tmp)) return s;
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Invalid string , try again");
            return selectOption(notice, option);
        }
    }
}
