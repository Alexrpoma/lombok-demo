package com.lombok.demo.without_lombok.data;

import java.util.UUID;

public class App {
  public static void main(String[] args) {
    UUID uuid = UUID.randomUUID();

    User user = new User(
        uuid,
        "John",
        "john",
        "joe",
        "john@net.com"
    );

    System.out.println(user);

    User user2 = new User(
        uuid,
        "John",
        "john",
        "joe",
        "john@net.com"
    );

    System.out.println(user2);

    System.out.println(user.equals(user2));
  }
}
