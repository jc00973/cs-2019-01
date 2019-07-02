package com.github.jc00973.cs.aula10.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DataUtilsTest {

    int a;

    @Test
    void testDataUtils() {

        assertEquals(-1, DataUtils.calcularData("2010101", a, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("100000101", a, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("20161301", a, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("20160001", a, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("20160931", a, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("20160900", a, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("", 0, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("", -1, "23450101", 1));
        assertEquals(-1, DataUtils.calcularData("", a, "201610", 1));
        assertEquals(-1, DataUtils.calcularData("", a, "23450101", -1));
        assertEquals(-1, DataUtils.calcularData("", a, "23450101", 7));
        assertEquals(2, DataUtils.calcularData("20160928", 2016, "20160928", 2));
        assertEquals(1, DataUtils.calcularData("20160301", 2016, "20160228", 6));
        assertEquals(1, DataUtils.calcularData("20161005", 2016, "20161003", 6));
        assertEquals(2, DataUtils.calcularData("20161006", 2016, "20161003", 6));
        assertEquals(3, DataUtils.calcularData("20161007", 2016, "20161003", 6));
        assertEquals(0, DataUtils.calcularData("20190701", 2000, "20190630", 6));
    }

}