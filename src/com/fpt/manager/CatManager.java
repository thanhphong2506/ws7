package com.fpt.manager;

import com.fpt.base.Animal;
import com.fpt.base.Cat;
import com.fpt.process.IProcess;

import java.util.HashMap;

public class CatManager implements IProcess {
    public  static  int price = 100000;
    private HashMap<String, Animal> list;
    public CatManager() {
        list = new HashMap<>();
    }
    @Override
    public boolean add(Animal x) {
       try {
           list.put(x.getId(), x);
           return true;
       }
       catch (Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public Animal update(String id) {

        try{
            Animal x = list.get(id);
            x.updateAnimal();
            if (!x.getId().equalsIgnoreCase(id)) {
                list.remove(id);
                list.put(x.getId(),x);
            }
            return  x;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Animal delete(String id) {
       try {
           Animal x = list.get(id);
           list.remove(id);
           return x;
       }
       catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }

    @Override
    public Animal find(String id) {
        return list.get(id);
    }
}
