package com.github.enivaldo20.alura.forum.api.domain.topic;

import jakarta.validation.constraints.NotNull;

public record TopicDataUpdate(@NotNull Long id, String title, String message, Long courseId) {
}
