package main.java;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {
    Card card = new Card("DHCP", "Ensures there are servers to pull/assign ip's to & from");

    @Test
    public void cardName() {
        Assert.assertEquals(card.getName(),"DHCP");
    }

    @Test
    public void cardDefinition() {
        Assert.assertEquals(card.getDefinition(),"Ensures there are servers to pull/assign ip's to & from");
    }

}
