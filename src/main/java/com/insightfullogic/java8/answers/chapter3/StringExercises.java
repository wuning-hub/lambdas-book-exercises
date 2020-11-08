package com.insightfullogic.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                           .filter(Character::isLowerCase)
                           .count();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                      .max(Comparator.comparing(StringExercises::countLowercaseLetters));
    }


    public static int test1(String string) {
        return (int) string.chars().filter(Character::isLowerCase).count();
    }

    public static Optional<String> test2(List<String> strings) {
        return strings.stream().max(Comparator.comparing(s -> s.chars().filter(Character::isLowerCase).count()));
    }




}
