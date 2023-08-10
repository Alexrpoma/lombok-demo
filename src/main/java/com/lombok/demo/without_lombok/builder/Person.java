package com.lombok.demo.without_lombok.builder;

public class Person {
  private String name;
  private String username;
  private String email;
  private int age;

  static class builder {
    private String name;
    private String username;
    private String email;
    private int age;

    public String name(String name) {
      this.name = name;
      return name;
    }

    public String username(String username) {
      this.username = username;
      return username;
    }

    public String email(String email) {
      this.email = email;
      return email;
    }

    public int age(int age) {
      this.age = age;
      return age;
    }

  }
}
