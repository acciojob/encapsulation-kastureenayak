package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly object=new RWOnly();

      //System.out.println(object.string);
     //java: string has private access in com.driver.RWOnly

      object.setString("Encapsulation in Java");
      String string=object.getString();
      System.out.println(string);
  }
}