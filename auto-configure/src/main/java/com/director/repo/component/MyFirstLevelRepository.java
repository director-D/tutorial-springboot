package com.director.repo.component;


import com.director.repo.annotation.SecondLevelRepository;

@SecondLevelRepository(value = "myFirstLevelRepository") // Bean 名称
public class MyFirstLevelRepository {
}
