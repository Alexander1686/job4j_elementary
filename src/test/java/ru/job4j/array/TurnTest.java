package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray1() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}