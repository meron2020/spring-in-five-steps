package com.in28minutes.spring.basics.springinfivesteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsApplication {

    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for beans? => No need

    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        
        //Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println(result);
        
    }

}
