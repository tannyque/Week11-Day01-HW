import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void isEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canRefill(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}