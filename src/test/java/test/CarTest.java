package test;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CarTest {
    @Test
    public void blabla() {
        Car car = new Car("BMW", "i7", 300);
        Car car2 = new Car("BMW", "i7", 240);

     //   Car car3 = CarFactory.get();
        Car car3 = CarFactory.getByMake("Mercedez");
        Car car4 = CarFactory.getByMake("BMW");

        log.fatal("FATAL - нИЧЕГО НЕ РАБОТАЕТ");
        log.error("ERROR - ЧТО-ТО НЕ РАБОТАЕТ !!");
        log.warn("WARN - ЧТО-ТО МОЖЕТ НЕ РАБОТАТЬ НО ПОКА ОК");
        log.info("INFO - ИНФА !!");
        log.debug("DEBUG- ЭТА ИНФА ПОМОЖЕТ ТЕБЕ НАЙТИ ПРОБЛЕМУ !!");
        log.trace("TRACE - НУ КАПЕЦ КАКАЯ ПОДРОБНАЯ ИНФА ДЛЯ ДЕБАГА");

        assertEquals(car, car2);
    }
}
