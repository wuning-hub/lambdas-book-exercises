package com.insightfullogic.java8.Oneself;

import com.insightfullogic.java8.answers.chapter3.Question1;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class testSelf {


    @Test
    public void  chapter3Test1a(){
        assertEquals(6,Question1.test1(Stream.of(1, 2, 3)));
    }

    @Test
    public void chapter3Test1b(){

        List<String> strings = Question1.test2(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), strings);

    }
}
