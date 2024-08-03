package dev.nacho.vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Ferrari", 2020, 5, Fuel.DIESEL, CarType.EXECUTIVE, 5, 5, 200, Color.VIOLET, 100, true);
    }

    @Test
    void testAccelerate() {
        car.accelerate(10);
        assertEquals(110, car.getCurrentSpeed());
    }

    @Test
    void testAccelerateOverLimit() {
        car.accelerate(500);
        assertEquals(100, car.getCurrentSpeed());
    }

    @Test
    void testDecelerate() {
        car.decelerate(10);
        assertEquals(90, car.getCurrentSpeed());
    }

    @Test
    void testDecelerateBelowZero() {
        car.decelerate(900);
        assertEquals(100, car.getCurrentSpeed());
    }

    @Test
    void testBrake() {
        car.brake();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    void testArrivalTime() {
        int time = car.arrivalTime(500);
        assertEquals(5, time);
    }

    @Test
    void testGetFines() {
        car.accelerate(500);
        assertTrue(car.hasFines());
    }

    @Test
    void testGetNoFines() {
        assertFalse(car.hasFines());
    }

    @Test
    void testFinesAmount() {
        car.accelerate(500);
        car.accelerate(500);
        assertEquals(200.0, car.finesAmount());
    }

    @Test
    void testFinesNoAmount() {
        assertEquals(0.0, car.finesAmount());
    }
}
