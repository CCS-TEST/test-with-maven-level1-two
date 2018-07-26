package ccs.test.mvn.level1.two;

import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class TestBlackJack {


    @Test
    public void blackjack_19_21(){
        assertEquals(21, BlackJack.blackjack(19, 21));
    }

    @Test
    public void blackjack_21_19(){
        assertEquals(21, BlackJack.blackjack(21, 19));
    }

    @Test
    public void blackjack_19_22(){
        assertEquals(19, BlackJack.blackjack(19, 22));
    }

    @Test
    public void blackjack_22_50(){
        assertEquals(0, BlackJack.blackjack(22, 50));
    }

    @Test
    public void blackjack_22_1(){
        assertEquals(1, BlackJack.blackjack(22, 1));
    }

    @Test (expected = BadArgumentException.class)
    public void blackjack_22_Neg_1(){
        assertEquals(1, BlackJack.blackjack(22, -1));
    }

    @Test (expected = BadArgumentException.class)
    public void blackjack_Neg_22_1(){
        assertEquals(1, BlackJack.blackjack(-22, 1));
    }

    @Test (expected = BadArgumentException.class)
    public void blackjack_Neg_22_Neg_1(){
        assertEquals(1, BlackJack.blackjack(-22, -1));
    }

}
