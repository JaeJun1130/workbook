package com.example.controller;

import com.example.dto.TestDto;
import com.example.dto.TestDto1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/main")
    public void main() {
        MainController.test mainController = new MainController.test();


        TestDto testDto = new TestDto();
        TestDto1 testDto1 = new TestDto1();

        mainController.testService(testDto);
        mainController.testService(testDto1);



//        https://vagabond95.me/posts/generic-guide/
        
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        mainController.testService(cats);



        /**
         * Generic 소거
         *
         *
         */

    }

    class test {
        public void testService(List<? extends Animal> list){
            System.out.println("list.getClass() = " + list.getClass());
        }
    }

    public interface SomeGettable {
         Object getSome();
    }

    class Animal {
        public void animal() {

        }
    }
    class Cat extends Animal implements SomeGettable{
        @Override
        public Object getSome() {
            return "aa";
        }
    }
    class Dog extends Animal {}

//    class KoreanShortHair extends Cat {}
}
