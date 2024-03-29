package com.github.enivaldo20.alura.forum.api.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicDataRecord(
		@NotBlank String title,
		@NotBlank String message,
		@NotNull Long courseId) {
}
