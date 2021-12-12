package com.fpt.base;

import com.fpt.Validate;

public class Animal {
    protected String id;
    protected String name;
    public Animal(){}
    public Animal(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) throws Exception{
        try {
            if (name != "" && name != null) {
                this.name = name;
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e) {
            throw e;
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public void enterAnimal () {

        this.id = Validate.inputString(false, "Enter id : ");
        this.name = Validate.inputString(false, "Enter name : ");
    }
    public void updateAnimal() {
        this.id = Validate.inputString(true, "Enter update id : ") ;
        this.name = Validate.inputString(true, "Enter update name : ");
    }
}
