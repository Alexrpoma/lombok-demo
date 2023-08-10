package com.lombok.demo.without_lombok.data;

import java.util.UUID;

public record User(UUID ui, String name, String username, String nickname, String email) {
}
