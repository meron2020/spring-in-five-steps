package com.in28minutes.spring.basics.springinfivesteps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
//@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        // Logic for Quick Sort
        return numbers;
    }
}
