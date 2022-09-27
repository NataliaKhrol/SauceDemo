package test;

import com.github.javafaker.Faker;

public class CarFactory {
    public static Car get() {
        return Car.builder()
                .make("Mercedez")
                .model("CLA")
                .speed(300)
                .build();
    }

    public static Car getByMake(String make) {
        if (make.equals("BMW")) {
            return Car.builder()
                    .make("BMW")
                    .model("I7")
                    .speed(300)
                    .build();
        } else {
            return Car.builder()
                    .make("Mercedez")
                    .model("CLA")
                    .speed(300)
                    .build();
        }
    }

    public static Car getRandom() {
        Faker faker = new Faker();
        return Car.builder()
                .make(faker.lordOfTheRings().character())
                .model(faker.cat().name())
                .speed(faker.number().numberBetween(100,300))
                .build();
    }
}


