package com.example.workbook;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class WorkbookApplicationTests {

    @Test
    void contextLoads() {
        String[] arr = new String[]{"a","b","c"};
        Stream<String> stream = Arrays.stream(arr,1,3);

        //새롭게 생김1234
        //푸시후 재커밋
        List<String> list = Arrays.asList("a","b","c");
    }

}
