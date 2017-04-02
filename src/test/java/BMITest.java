import Domain.BMIData;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Polle on 2-4-2017.
 */
public class BMITest {

    @Test
    public void evaluateExpressions(){
        BMIData bmiData = new BMIData(1.6f, 80.0f);
        double sum = bmiData.getBMI();
        assertEquals(31.249998, sum, 0.01);
    }
}
