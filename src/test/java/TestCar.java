import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCar {
    @Test
    public static void testCopieLibro(){
        Car car = new Car();
        assertEquals(car.getColor(),"red");
    }
}
