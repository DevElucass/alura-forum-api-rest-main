package com.github.enivaldo20.alura.forum.api.domain.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryData(@NotBlank String name) {
}
