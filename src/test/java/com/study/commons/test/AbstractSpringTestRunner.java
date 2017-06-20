package com.study.commons.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.io.IOException;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceTestConfig.class)
@Transactional
public class AbstractSpringTestRunner {
    @Inject
    private ObjectMapper objectMapper;

    protected void outputJson(Object data) {
        try {
            System.out.println("JSON:");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data));
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
