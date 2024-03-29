package com.github.enivaldo20.alura.forum.api.domain.course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CourseDataRecord(
		@NotBlank String name,
		@NotNull Long categoryId) {
}
