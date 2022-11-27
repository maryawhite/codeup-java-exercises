import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @org.junit.Test
    public void showMessageTest() {
        Candy candy1 = new Candy("Snickers", "king size");
        assertEquals("Ahhhh, a Snickers! I see that you got the king size size. Looks good!", candy1.showMessage());
    }

    @Test
    public void shouldShowHalloweenSizeifNoSizeGiven(){
        Candy candyNoSize = new Candy("Sweeties");
        assertEquals("Ahhhh, a Sweeties! I see that you got the Halloween size. Looks good!", candyNoSize.showMessage());
    }
}