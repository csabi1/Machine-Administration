import model.Tools;
import model.returnVal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReturnValTest {

    returnVal underTest;

    @BeforeEach
    void setUp() {
        underTest = new returnVal();
    }

    @Test
    void testAvregeAbresion(){
        Tools testTool = new Tools();
        testTool.setToolId(5);
        testTool.setAbrasion(50);
        testTool.setMachineId(5);

        Tools testTool2 = new Tools();
        testTool2.setToolId(6);
        testTool2.setAbrasion(100);
        testTool2.setMachineId(5);


        List<Tools> testList = new ArrayList<>();
        testList.add(testTool);
        testList.add(testTool2);

        int testMachine = 5;

        assertEquals(75, underTest.averageAbrasion(testMachine,testList));





    }
}

