package devel0per36.parking.util;

import devel0per36.parking.entity.Car;
import devel0per36.parking.entity.component.Brand;
import devel0per36.parking.entity.component.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FormattingObjectTest {
    @Test
    @DisplayName("Получения отформатированной строки из объекта автомобиля")
    public void getFormatCarToString() {
        Car toyotaYaris = new Car(4, Brand.TOYOTA, "Yaris", Color.RED);
        String stringFromObject = FormattingObject.getFormatCarToString(toyotaYaris);
        Assertions.assertEquals("Автомобиль Красный Toyota Yaris с идентификатором 4", stringFromObject);
    }
}
