import org.junit.Assert;
import org.junit.Test;

public class ParkingTest {


    @Test
    public void OnParkCarReturn_True() {
        ParkingLot plot = new ParkingLot();
        Assert.assertTrue(plot.addParking());

    }

}