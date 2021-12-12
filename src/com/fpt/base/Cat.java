package com.fpt.base;

import com.fpt.Validate;

public class Cat extends Animal{
    protected String sex ;
    protected String type;
    public Cat () {
        super();
    }
    public Cat(String id, String name) {
        super(id, name);
    }

    public Cat(String id, String name, String sex, String type) {
        super(id, name);
        this.sex = sex;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type)throws Exception{
        try {
            if (type != "" && type != null) {
                this.type = type;
            }else {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e) {
            throw e;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws Exception {
        try {
            if (sex == "male" || sex == "female") {
                this.sex = sex;
            }else {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e) {
            throw e;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void enterAnimal() {
        super.enterAnimal();
        this.sex = Validate.selectOption("Enter sex (male/female) : ", "male", "female");
        this.type = Validate.inputString(false, "Enter type : ");
    }

    @Override
    public void updateAnimal() {
        super.updateAnimal();
        this.sex = Validate.selectOption("Enter update sex (male/female) : ", "male", "female");
        this.type = Validate.inputString(false, "Enter update type : ");
    }
}
