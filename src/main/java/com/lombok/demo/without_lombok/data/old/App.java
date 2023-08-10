package com.lombok.demo.without_lombok.data.old;

import java.util.UUID;

public class App {
  public static void main(String[] args) {
    UUID uuid = UUID.randomUUID();

    User user = new User();
    user.setId(uuid);
    user.setName("John");
    user.setUsername("john");
    user.setNickname("joe");
    user.setEmail("john@net.com");

    System.out.println(user);

    User user2 = new User();
    user2.setId(uuid);
    user2.setName("John");
    user2.setUsername("john");
    user2.setNickname("joe");
    user2.setEmail("john@net.com");

    System.out.println(user2);

    System.out.println(user.equals(user2));
  }
}
