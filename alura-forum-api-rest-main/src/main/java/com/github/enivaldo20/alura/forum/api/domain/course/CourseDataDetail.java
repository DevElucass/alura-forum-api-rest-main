package com.github.enivaldo20.alura.forum.api.domain.course;

public record CourseDataDetail(Long id, String name, Long categoryId) {
	public CourseDataDetail(Course course) {
		this(course.getId(), course.getName(), course.getCategory().getId());
	}
}
