package com.example.dto;

import com.example.controller.MainController;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDto implements MainController.SomeGettable {
    private String name;

    @Override
    public Object getSome() {
        return "bb";
    }
}