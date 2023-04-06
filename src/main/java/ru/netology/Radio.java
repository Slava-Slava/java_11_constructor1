package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStationNumber;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int quantity) {
        this.currentStationNumber = quantity - 1;
    }

    public void pressNextStation() {
        if (currentStationNumber >= maxRadioStation) {
            setCurrentStationNumber(minRadioStation);
        } else {
            setCurrentStationNumber(currentStationNumber + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStationNumber <= minRadioStation) {
            setCurrentStationNumber(maxRadioStation);
        } else {
            setCurrentStationNumber(currentStationNumber - 1);
        }
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        this.minVolume = minVolume;
    }

    public void pressPlusVolume() {

        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {

        setCurrentVolume(currentVolume - 1);
    }

}
