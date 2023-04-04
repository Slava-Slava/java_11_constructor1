package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void selectNumberCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void exceedingMaxRadioStationsThroughRemoteControl() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(11);
        int expected = 9;
        int actual = radio.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exceedingMinRadioStationsThroughRemoteControl() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }


}

