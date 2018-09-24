import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() {
        printer = new Printer(30, 50);
    }

    @Test
    public void hasPaper() {
        assertEquals(30, printer.getPaperCount());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getTonerVolume());
    }

    @Test
    public void canPrint() {
        printer.print(5, 4);
        assertEquals(10, printer.getPaperCount());
        assertEquals(30, printer.getTonerVolume());
    }

    @Test
    public void canNotPrint(){
        printer.print(10, 10);
        assertEquals(30, printer.getPaperCount());
        assertEquals(50, printer.getTonerVolume());
    }

    @Test
    public void canRefillPaper() {
        printer.print(2, 5);
        assertEquals(20, printer.getPaperCount());
        printer.refillPaper();
        assertEquals(30, printer.getPaperCount());
    }
}