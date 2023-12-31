package com.lombok.demo.with_lombok.data;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
  private UUID id;
  private String name;
  private String username;
  private String nickname;
  private String email;
}
