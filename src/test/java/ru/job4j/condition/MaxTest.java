package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
        System.out.println(result);
    }

    @Test
    void whenMax3To2To1Then3() {
        int left = 1;
        int right = 2;
        int up = 3;
        int result = Max.max(left, right, up);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
        System.out.println(result);
    }

    @Test
    void whenMax4To3To2To1Then3() {
        int left = 1;
        int right = 2;
        int up = 3;
        int down = 4;
        int result = Max.max(left, right, up, down);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
        System.out.println(result);
    }
}