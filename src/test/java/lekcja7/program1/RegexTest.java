package lekcja7.program1;

import org.junit.Assert;
import org.junit.Test;

public class RegexTest {

    @Test
    public void testIsItAPhoneNumber() throws Exception {
        Regex regex = new Regex();
        Assert.assertTrue(regex.isItAPhoneNumber("999-888-777"));
        Assert.assertTrue(regex.isItAPhoneNumber("123-432-112"));
        Assert.assertTrue(regex.isItAPhoneNumber("234-442-555"));
        Assert.assertTrue(regex.isItAPhoneNumber("111-321-421"));
        Assert.assertTrue(regex.isItAPhoneNumber("133-444-555"));

        Assert.assertFalse(regex.isItAPhoneNumber("9099-999-999"));
        Assert.assertFalse(regex.isItAPhoneNumber("9099-999-99955"));
        Assert.assertFalse(regex.isItAPhoneNumber("ala ma kota"));
        Assert.assertFalse(regex.isItAPhoneNumber("999-000--000"));
        Assert.assertFalse(regex.isItAPhoneNumber("9099-999-999--i21222"));
    }

    @Test
    public void testIsItAPostCode() throws Exception{
        Regex regex = new Regex();
        Assert.assertTrue(regex.isItPostCode("00-987"));
        Assert.assertTrue(regex.isItPostCode("00-678"));
        Assert.assertTrue(regex.isItPostCode("09-987"));
        Assert.assertTrue(regex.isItPostCode("23-345"));
        Assert.assertTrue(regex.isItPostCode("98-123"));

        Assert.assertFalse(regex.isItPostCode("7656"));
        Assert.assertFalse(regex.isItPostCode("7656asdsf"));
        Assert.assertFalse(regex.isItPostCode("7656--987"));
        Assert.assertFalse(regex.isItPostCode("44-66D"));
        Assert.assertFalse(regex.isItPostCode("fd-hry"));
    }

}