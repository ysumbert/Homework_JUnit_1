package Animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void checkGetName () {
        // GIVEN
        Animal animal = new Animal("testDog",2, "pet") {
            @Override
            public String makeSound() {
                return null;
            }

            @Override
            public String eat(Animal animal) {
                return null;
            }
        };
        String expectedName = "testCog";
        // WHEN
        String actualName = animal.getName();
        // THEN
        Assertions.assertEquals(expectedName,actualName);
    }

    @Test
    public void checkGetAge () {
        // GIVEN
        Animal animal = new Animal("testDog", 2, "pet") {
            @Override
            public String makeSound() {
                return null;
            }

            @Override
            public String eat(Animal animal) {
                return null;
            }
        };
        int expectedAge = 2;
        // WHEN
        int actualAge = animal.getAge();
        // THEN
        Assertions.assertEquals(expectedAge,actualAge);
    }
}