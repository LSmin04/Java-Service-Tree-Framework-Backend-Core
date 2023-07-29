package com.arms.smlee;


import com.arms.filerepository.service.FileRepository;
import com.arms.smlee.ch03.Ex03_1;
import com.arms.smlee.ch03.Ex03_2;
import com.arms.smlee.ch04.Ex04_9;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Start {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    public String haha = 1;
//    public Hello hello = 1;
    public Integer num =1;


    public Start() {
        logger.info(" Ex03_1 --------------------------------------------------");
        Ex03_1 ex03_1 = new Ex03_1();
        logger.info(" Ex03_2 --------------------------------------------------");
        Ex03_2 ex03_2 = new Ex03_2();
        logger.info(" Ex04_9 --------------------------------------------------");
        Ex04_9 ex04_9 = new Ex04_9();
    }

    public void test(){
        logger.info("Test %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }


}

