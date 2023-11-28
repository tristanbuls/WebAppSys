package edu.fra.uas.beanbeispiel;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.fra.uas.service.MessageService;

import edu.fra.uas.controller.BeanController;

@SpringBootTest
public class ControllerTest {
    
    @Autowired
    private BeanController beanController; 
    
    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test"))
            .isEqualTo("put message: Das ist ein Test");
    }

    void testIncrement() {
    int result = beanController.increment(5);
    assertThat(result).isEqualTo(6);
}
}


