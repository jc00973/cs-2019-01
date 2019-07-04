package jpeg.src.test.java.com.github.jc00973.cs.aula10.domain;

import com.github.jc00973.cs.aula10.application.console.Programa;

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
        assertEquals(4, DataUtils.calcularData("20190628", 2000, "20190630", 6));
        assertEquals(3, DataUtils.calcularData("20190528", 2000, "20190628", 6));
        assertEquals(0, DataUtils.calcularData("20190101", 2000, "20181231", 6));
        assertEquals(5, DataUtils.calcularData("20181231", 2000, "20190101", 6));
        assertEquals(-1, DataUtils.calcularData("00181231", 2000, "20190101", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2019, "20190231", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2010, "20190431", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2010, "20190631", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2010, "20190931", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2010, "20191131", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2000, "20190101", 9));
        assertEquals(-1, DataUtils.calcularData("20181231", 2000, "20190101", -3));
        assertEquals(-1, DataUtils.calcularData("20181231", 2018, "20190231", 6));
        assertEquals(-1, DataUtils.calcularData("20181231", 2018, "20191100", 8));
        assertEquals(-1, DataUtils.calcularData("20181231", 2018, "20191132", 8));
        assertEquals(-1, DataUtils.calcularData("20181231", 2018, "20190221", 11));
        assertEquals(-1, DataUtils.calcularData("20181231", 2018, "20190421", 32));
        assertEquals(5, DataUtils.calcularData("20190115", 2018, "20190113", 3));
        assertEquals(0, DataUtils.calcularData("20190201", 2018, "20190131", 6));
        assertEquals(0, DataUtils.calcularData("20000201", 2000, "20000131", 6));
        assertEquals(0, DataUtils.calcularData("19000201", 1900, "19000131", 6));
        assertEquals(0, DataUtils.calcularData("19000131", 1900, "19000130", 6));
        assertEquals(0, DataUtils.calcularData("19000301", 1901, "19000228", 6));
        assertEquals(-1, DataUtils.calcularData("19050301", 1905, "19050230", 6));
        assertEquals(3, DataUtils.calcularData("20190331", 2018, "20190330", 2));
        assertEquals(3, DataUtils.calcularData("20190401", 2018, "20190331", 2));
        assertEquals(3, DataUtils.calcularData("20190430", 2018, "20190429", 2));
        assertEquals(3, DataUtils.calcularData("20190501", 2018, "20190430", 2));
        assertEquals(3, DataUtils.calcularData("20190531", 2018, "20190530", 2));
        assertEquals(3, DataUtils.calcularData("20190601", 2018, "20190531", 2));
        assertEquals(3, DataUtils.calcularData("20190630", 2018, "20190629", 2));
        assertEquals(3, DataUtils.calcularData("20190731", 2018, "20190730", 2));
        assertEquals(3, DataUtils.calcularData("20190801", 2018, "20190731", 2));
        assertEquals(3, DataUtils.calcularData("20190830", 2018, "20190829", 2));
        assertEquals(3, DataUtils.calcularData("20190901", 2018, "20190831", 2));
        assertEquals(3, DataUtils.calcularData("20190930", 2018, "20190929", 2));
        assertEquals(3, DataUtils.calcularData("20191001", 2018, "20190930", 2));
        assertEquals(3, DataUtils.calcularData("20191030", 2018, "20191029", 2));
        assertEquals(3, DataUtils.calcularData("20191101", 2018, "20191031", 2));
        assertEquals(3, DataUtils.calcularData("20191130", 2018, "20191129", 2));
        assertEquals(3, DataUtils.calcularData("20191201", 2018, "20191130", 2));
        assertEquals(3, DataUtils.calcularData("20191230", 2018, "20191229", 2));
        assertEquals(4, DataUtils.calcularData("20190131", 2018, "20190201", 5));
        assertEquals(4, DataUtils.calcularData("20190229", 2019, "20190301", 5));
        assertEquals(4, DataUtils.calcularData("20190228", 2018, "20190301", 5));
        assertEquals(4, DataUtils.calcularData("20190331", 2019, "20190401", 5));
        assertEquals(4, DataUtils.calcularData("20190430", 2019, "20190501", 5));
        assertEquals(4, DataUtils.calcularData("20190531", 2019, "20190601", 5));
        assertEquals(4, DataUtils.calcularData("20190630", 2019, "20190701", 5));
        assertEquals(4, DataUtils.calcularData("20190731", 2019, "20190801", 5));
        assertEquals(4, DataUtils.calcularData("20190831", 2019, "20190901", 5));
        assertEquals(4, DataUtils.calcularData("20190930", 2019, "20191001", 5));
        assertEquals(4, DataUtils.calcularData("20191031", 2019, "20191101", 5));
        assertEquals(4, DataUtils.calcularData("20191130", 2019, "20191201", 5));
        assertEquals(4, DataUtils.calcularData("20181130", 2017, "20191130", 5));
        assertEquals(1, DataUtils.calcularData("20191101", 2019, "20191001", 5));
        assertEquals(0, DataUtils.calcularData("20191130", 2019, "20181130", 5));
        assertEquals(0, DataUtils.receberEntrada("20191130 2019 20181130 5"));

    }

}