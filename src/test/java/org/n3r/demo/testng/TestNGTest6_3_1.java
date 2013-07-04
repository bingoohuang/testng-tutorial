package org.n3r.demo.testng;

import org.testng.annotations.*;

/**
 * TestNG Parameterized Test - Advance
 * @author mkyong
 *
 */
public class TestNGTest6_3_1 {

    @Test(dataProvider = "Data-Provider-Function")
    public void parameterIntTest(TestNGTest6_3_0 clzz) {
        System.out.println("Parameterized Number is : " + clzz.getMsg());
        System.out.println("Parameterized Number is : " + clzz.getNumber());
    }

    //This function will provide the patameter data
    @DataProvider(name = "Data-Provider-Function")
    public Object[][] parameterIntTestProvider() {

        TestNGTest6_3_0 obj = new TestNGTest6_3_0();
        obj.setMsg("Hello");
        obj.setNumber(123);

        return new Object[][]{
                {obj}
        };
    }
}