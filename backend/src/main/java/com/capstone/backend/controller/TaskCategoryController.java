package com.capstone.backend.controller;

import com.capstone.backend.service.TaskCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskCategoryController {

    @Autowired
    TaskCategoryService taskCategoryService;
}
