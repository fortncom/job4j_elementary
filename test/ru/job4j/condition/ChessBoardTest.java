package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(5, 5, 0, 10);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs10() {
        int way = ChessBoard.way(0, 10, 10, 0);
        assertThat(way, is(10));
    }

    @Test
    public void wayIs7() {
        int x1 = 3;
        int y1 = 0;
        int x2 = 10;
        int y2 = 7;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

}
