package com.spring.boot.logging;

import com.spring.boot.logging.other.ReadBusinessClass;
import com.spring.boot.logging.other.WriteBusinessClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAOPLoggingTester {
    private Logger logger = LoggerFactory.getLogger(BusinessAOPLoggingTester.class);

    @Autowired
    private ReadBusinessClass readBusinessClass;

    @Autowired
    private WriteBusinessClass writeBusinessClass;

    @Test
    public void invokeAOPStuff(){
        //Assert.assertThat(readBusinessClass.fetchSuccessful(), CoreMatchers.equalTo(readBusinessClass.fetchSuccessful()));
        logger.info(readBusinessClass.fetchSuccessful());
        logger.info(writeBusinessClass.writeSuccessful());
    }
}
