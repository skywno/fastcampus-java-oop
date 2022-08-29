package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest   {

    @Test
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // When
        List<Integer> actual = javaSort.sort(List.of(5, 3, 2, 5167, 7, 3, 1234));
        // Then
        Assertions.assertEquals(List.of(2, 3, 3, 5, 7, 1234, 5167), actual);
    }

}