package com.fpt;

import com.fpt.base.Animal;
import com.fpt.base.Cat;
import com.fpt.manager.CatManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CatManager manager = new CatManager();
        while(true) {
            System.out.println("\n");
            System.out.println("1. Add");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Find");
            System.out.println("0. Exit");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1 ->
                        {
                            Animal x = new Cat();
                            x.enterAnimal();
                            if(manager.add(x)) {
                                System.out.println("Add successfully");
                            }
                            else System.out.println("Add failed");
                        }
                case 2 -> {
                    String id = Validate.inputString(false, "Enter the id to update : ");
                    Animal x = manager.update(id);
                    if( x != null) {
                        System.out.println("After update : ");
                        System.out.print(x.toString());
                    }
                    else {
                        System.out.println("Cannot find cat , ensure you enter the correct id");
                    }

                }
                case 3 -> {
                    String id = Validate.inputString(false, "Enter the id to delete : ");
                    Animal x = manager.delete(id);
                    if( x != null) {
                        System.out.println("The cat has just been deleted : ");
                        System.out.print(x.toString());
                    }
                    else {
                        System.out.println("Cannot find cat , ensure you enter the correct id");
                    }
                }
                case 4 -> {
                    String id = Validate.inputString(false, "Enter the id to find : ");
                    Animal x = manager.find(id);
                    if( x != null) {
                        System.out.println("The cat with the id "+id+" :");
                        System.out.print(x.toString());
                    }
                    else {
                        System.out.println("Cannot find cat , ensure you enter the correct id");
                    }
                }
                default -> {
                    System.out.println("Good bye");
                    return;}
            }
        }
    }
}
