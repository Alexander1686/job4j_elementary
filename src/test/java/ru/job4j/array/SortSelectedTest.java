package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortThree() {
        int[] massiv = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(massiv);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFive() {
        int[] massiv2 = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(massiv2);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}