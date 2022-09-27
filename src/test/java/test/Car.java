package test;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Data
@Builder
public class Car {
    String make;
    String model;
    int speed;

}