package com.lombok.demo.with_lombok.builder;

public class App {
  public static void main(String[] args) {
    Person personA = new Person.builder()
        .name("Anna")
        .username("anni")
        .email("anni@gmail.com")
        .age(25)
        .build();

    System.out.println(personA);
  }
}
