package com.lombok.demo.with_lombok.pojo;

public class App {
  public static void main(String[] args) {
    Animal dog = new Animal("bobi", 4, false);
    dog.setName("rock");
    System.out.printf("The dog %s has %d legs!%n", dog.getName(), dog.getLegs());
  }
}
