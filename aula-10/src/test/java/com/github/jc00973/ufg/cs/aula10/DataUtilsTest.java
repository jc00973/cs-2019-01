package com.github.jc00973.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DataUtilsTest {

    @Test
    void testDataUtils() {
        assertEquals(1, DataUtils.calcularData("20160301", 2016, "20160228", 6));
    }

}