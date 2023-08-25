package com.capstone.backend.repository;

import com.capstone.backend.entities.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCategoryRepository extends JpaRepository<TaskCategory, Integer> {
}
