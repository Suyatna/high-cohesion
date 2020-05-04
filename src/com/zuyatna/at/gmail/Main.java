package com.zuyatna.at.gmail;

class Name {

    String name;
    public String getName(String name) {

        this.name = name;
        return name;
    }
}

class Age {

    int age;
    public int getAge(int age) {

        this.age = age;
        return age;
    }
}

class PhoneNumber {

    String number;
    public String getPhoneNumber(String number) {

        this.number = number;
        return number;
    }
}

public class Main {

    public static void main(String[] args) {

        Name name = new Name();
        System.out.println(name.getName("Suyatna"));

        Age age = new Age();
        System.out.println(age.getAge(23));

        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.getPhoneNumber("081-987654321"));
    }
}
