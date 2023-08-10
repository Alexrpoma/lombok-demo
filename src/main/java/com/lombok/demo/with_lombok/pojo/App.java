package com.lombok.demo.with_lombok.pojo;

public class App {
  public static void main(String[] args) {
    Animal cat = new Animal("miki", 2, false);
    cat.setName("kandy");
    cat.setLegs(4);
    System.out.printf("The cat %s has %d legs!%n", cat.getName(), cat.getLegs());
  }
}
