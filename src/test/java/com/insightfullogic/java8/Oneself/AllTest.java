package com.insightfullogic.java8.Oneself;

import com.insightfullogic.java8.answers.chapter3.AllEx;
import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import com.insightfullogic.java8.exercises.chapter3.Question1;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.insightfullogic.java8.examples.chapter1.SampleData.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class AllTest {

    @Test
    public void test1(){
        assertEquals(6,AllEx.test1a(Stream.of(1,2,3)));
    }

    @Test
    public void test2(){
        List<String> strings = AllEx.test1b(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"),strings);
    }

    @Test
    public void test3(){
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = AllEx.test1c(input);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }


    @Test
    public void test4(){
        assertEquals(4,AllEx.test2(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

    @Test
    public void  test5(){
        assertEquals(4,AllEx.test6("abcDe"));
    }

}
