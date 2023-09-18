package com.github.enivaldo20.alura.forum.api.domain.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ResponseDataRecord(@NotBlank String message, @NotNull Long topicId) {
}
