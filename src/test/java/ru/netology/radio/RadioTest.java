package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void test() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNeg() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationPos() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationFrom9To0() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationFrom0To9() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 51;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 49;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

}