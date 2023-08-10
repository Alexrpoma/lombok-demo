package com.lombok.demo.without_lombok.builder;

public class Person {
  private final String name;
  private final String username;
  private final String email;
  private final int age;

  private Person(String name, String username, String email, int age) {
    this.name = name;
    this.username = username;
    this.email = email;
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", username='" + username + '\'' +
        ", email='" + email + '\'' +
        ", age=" + age +
        '}';
  }

  static class builder {
    private String name;
    private String username;
    private String email;
    private int age;

    public builder name(String name) {
      this.name = name;
      return this;
    }

    public builder username(String username) {
      this.username = username;
      return this;
    }

    public builder email(String email) {
      this.email = email;
      return this;
    }

    public builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new Person(this.name, this.username, this.email, this.age);
    }

  }
}
