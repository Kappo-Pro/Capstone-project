package com.capstone.backend.service;

import com.capstone.backend.repository.TaskCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCategoryService {

    @Autowired
    TaskCategoryRepository taskCategoryRepository;
}
