package com.pets.cal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/pets")
    public List<Dog> getAllDogs() {
        return Arrays.asList(
                new Dog("Kona", 28.0, 100.5),
                new Dog("Daiko", 36.0, 120.3),
                new Dog("Fido", 18.0, 66.9),
                new Dog("Buster", 48.0, 150.8)
        );
    }
}
