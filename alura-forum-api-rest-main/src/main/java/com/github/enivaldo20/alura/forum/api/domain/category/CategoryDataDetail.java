package com.github.enivaldo20.alura.forum.api.domain.category;

public record CategoryDataDetail(Long id, String name) {
	public CategoryDataDetail(Category category) {
		this(category.getId(), category.getName());
	}
}
