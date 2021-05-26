package com.bo;

public class SomeBO {
    public void Validate() {
        System.out.println("Validation stuff from BO");
    }

    public void Validate(int age) throws Exception {
        if(age < 18) {
            throw new ArithmeticException("Not Valid Age");
        }
        else {
            System.out.println("Vote Confirmed");
        }
    }

}
