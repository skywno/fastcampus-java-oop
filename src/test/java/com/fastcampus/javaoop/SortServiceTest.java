package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private final SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test() {
        // Given
        // When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        assertEquals(List.of("1","2","3"), actual);
        // Then
    }

}