package com.lombok.demo.without_lombok.data;

import java.util.Objects;
import java.util.UUID;

public class User {
  private UUID id;
  private String name;
  private String username;
  private String nickname;
  private String email;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(username, user.username) && Objects.equals(nickname, user.nickname) && Objects.equals(email, user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, username, nickname, email);
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", username='" + username + '\'' +
        ", nickname='" + nickname + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
