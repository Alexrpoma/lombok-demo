package com.lombok.demo.with_lombok.builder;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder(builderClassName = "builder")
public class Person {
  private String name;
  private String username;
  private String email;
  private int age;
}
