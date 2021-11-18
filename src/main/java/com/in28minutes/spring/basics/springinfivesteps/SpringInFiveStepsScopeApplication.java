package com.in28minutes.spring.basics.springinfivesteps;

import com.in28minutes.spring.basics.springinfivesteps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springinfivesteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsScopeApplication {


    private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsScopeApplication.class);
    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for beans? => No need

    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        
        //Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsScopeApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO2.getJdbcConnection());

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
    }

}
