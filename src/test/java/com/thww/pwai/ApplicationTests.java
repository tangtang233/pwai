package com.thww.pwai;

import com.sun.glass.ui.Application;
import com.thww.pwai.config.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BlogProperties.class)
public class ApplicationTests {

    @Autowired
    private BlogProperties blogProperties;


    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "TangTang233");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot 学习");
    }

}
