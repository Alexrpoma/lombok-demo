package com.lombok.demo.without_lombok.builder;

public class App {
  public static void main(String[] args) {
    Person person = new Person.builder()
        .name("Carl")
        .email("carl@gmail.com")
        .username("carl")
        .age(22)
        .build();
    System.out.println(person);
  }
}
