package calculator.actions;

import org.junit.Assert;
import org.junit.Test;

public class ImputReaderClassTest {
    @Test
    public void testReaderMethod() {
        //given
        String example = "5*6";
        EquationModel equationModel = new EquationModel(5, 6, '*');

        //when
        EquationModel readerClass = ImputReaderClass.extractExuations(example);
        //than
        Assert.assertEquals(readerClass,equationModel);
    }

}