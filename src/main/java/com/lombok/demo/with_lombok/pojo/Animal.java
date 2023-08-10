package com.lombok.demo.with_lombok.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Animal {
  private String name;
  private int legs;
  private boolean hasWings;
}
