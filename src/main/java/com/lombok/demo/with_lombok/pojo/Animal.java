package com.lombok.demo.with_lombok.pojo;

public class Animal {
  private String name;
  private int legs;
  private boolean hasWings;

  public Animal(String name, int legs, boolean hasWings) {
    this.name = name;
    this.legs = legs;
    this.hasWings = hasWings;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public boolean isHasWings() {
    return hasWings;
  }

  public void setHasWings(boolean hasWings) {
    this.hasWings = hasWings;
  }
}
