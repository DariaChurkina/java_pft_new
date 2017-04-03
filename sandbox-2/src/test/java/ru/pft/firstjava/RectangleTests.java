package ru.pft.firstjava;

import org.testng.Assert;


/**
 * Created by Daria on 29.03.2017.
 */
public class RectangleTests {


    public void testArea() {
        Rectangle r = new Rectangle(2, 17);
        r.area();
        Assert.assertEquals(r.area(), 34.0);

    }
}
