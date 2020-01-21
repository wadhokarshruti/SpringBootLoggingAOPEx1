package com.spring.boot.logging.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriteBusinessClass {
    private Logger logger = LoggerFactory.getLogger(WriteBusinessClass.class);

    /*@Autowired
    private WriteDao writeDao;*/
    public String writeSuccessful(){
        logger.info("Inside WriteBusinessClass.writeSuccessful");
        //return writeDao.writeSuccessful();
        return "failed";
    }
}
