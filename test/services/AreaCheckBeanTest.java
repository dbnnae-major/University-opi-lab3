package services;

import org.junit.Assert;
import org.junit.Test;

public class AreaCheckBeanTest {

    @Test
    public void testAreaConfirmInsideRectangle() {
        AreaCheckBean areaCheckBean = new AreaCheckBean();
        // точка в прямоугольнике: x = -1, y = 0.5, r = 2
        boolean result = areaCheckBean.areaConfirm(-1.0, 0.5, 2.0);
        Assert.assertTrue("Точка должна попасть в прямоугольник", result);
    }

    @Test
    public void testAreaConfirmOutside() {
        AreaCheckBean areaCheckBean = new AreaCheckBean();
        // точка вне всех фигур: x = 3, y = 3, r = 2
        boolean result = areaCheckBean.areaConfirm(3.0, 3.0, 2.0);
        Assert.assertFalse("Точка не должна попасть в область", result);
    }
}
