import model.Statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsTest {

    Statistics underTest;
    @BeforeEach
    void setUp(){
        underTest = new Statistics();
    }

    @Test
    void testSumOfWeight() {

        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);

        assertEquals(30, underTest.sumOfWeight(testList));
    }

    @Test
    void testAvgWeight() {

        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);

        assertEquals(15, underTest.avgWeight(testList));
    }


    @Test
    void TestSumOfTools() {

        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(20);

        assertEquals(25, underTest.sumOfTools(testList));
    }

    @Test
    void TestAvgTools() {

        List<Integer> testList = new ArrayList<>();
        testList.add(100);
        testList.add(50);

        assertEquals(75, underTest.avgTools(testList));
    }

    @Test
    void TestSumOfFloorSpace() {

        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(20);

        assertEquals(25, underTest.sumOfFloorSpace(testList));
    }

    @Test
    void TestAvgFloorSpace() {

        List<Integer> testList = new ArrayList<>();
        testList.add(100);
        testList.add(50);

        assertEquals(75, underTest.avgFloorSpace(testList));
    }

    @Test
    void TestRecFloorSpace(){

        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(10);

        assertEquals(260, underTest.recFloorSpace(testList));
    }
}
