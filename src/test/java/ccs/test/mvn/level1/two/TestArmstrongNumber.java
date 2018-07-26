package ccs.test.mvn.level1.two;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestArmstrongNumber {

    @Test (expected = BadArgumentException.class)
    public void testNegative() {
        ArmstrongNumber.is3DigitArmstrongNumber(-1);
    }

    @Test (expected = BadArgumentException.class)
    public void test0() {
        ArmstrongNumber.is3DigitArmstrongNumber(0);
    }

    @Test (expected = BadArgumentException.class)
    public void test2Digits() {
        ArmstrongNumber.is3DigitArmstrongNumber(99);
    }
    @Test (expected = BadArgumentException.class)
    public void testNegative2Digits() {
        ArmstrongNumber.is3DigitArmstrongNumber(-99);
    }
    @Test (expected = BadArgumentException.class)
    public void test4Digits() {
        ArmstrongNumber.is3DigitArmstrongNumber(9999);
    }
    @Test (expected = BadArgumentException.class)
    public void testNegative4Digits() {
        ArmstrongNumber.is3DigitArmstrongNumber(-9900);
    }

    @Test
    public void test370() {
        assertTrue(ArmstrongNumber.is3DigitArmstrongNumber(370));
    }

    @Test
    public void test153() {
        assertTrue(ArmstrongNumber.is3DigitArmstrongNumber(153));
    }

    @Test
    public void test371() {
        assertTrue(ArmstrongNumber.is3DigitArmstrongNumber(371));
    }

    @Test
    public void test407() {
        assertTrue(ArmstrongNumber.is3DigitArmstrongNumber(407));
    }

    @Test
    public void test253() {
        assertFalse(ArmstrongNumber.is3DigitArmstrongNumber(253));
    }
    @Test
    public void test200() {
        assertFalse(ArmstrongNumber.is3DigitArmstrongNumber(200));
    }



}
