package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class AllEx {



    public static int test1a(Stream<Integer> numbers){
       return numbers.reduce(0,Integer::sum);
    }

    public static List<String> test1b(List<Artist> artistsList){
       return artistsList.stream()
               .flatMap(artist -> Stream.of(artist.getName(),artist.getNationality()))
               .collect(Collectors.toList());
    }

    public static List<Album> test1c(List<Album> input){
        return input.stream()
               .filter(album -> album.getTrackList().size()<=3)
               .collect(toList());
    }

    public static int test2(List<Artist> artists){
        return artists.stream().map(artist -> artist.getMembers().count()).reduce(0L, Long::sum).intValue();
    }

    public static int test6(String string){
        return (int) string.chars().filter(Character::isLowerCase).count();
    }

    public static Optional<String> test7(List<String> stringList){
        return stringList.stream().max(Comparator.comparing(AllEx::test6));
    }
}
