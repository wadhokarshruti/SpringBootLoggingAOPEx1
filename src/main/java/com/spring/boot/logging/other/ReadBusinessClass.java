package com.spring.boot.logging.other;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadBusinessClass {
    private Logger logger = LoggerFactory.getLogger(ReadBusinessClass.class);

    /*@Autowired
    private ReadDao readDao;*/
    public String fetchSuccessful(){
        logger.info("Inside ReadBusinessClass:fetchSuccessful");
        //return readDao.fetchSuccessful();
        return "Success";
    }

}
