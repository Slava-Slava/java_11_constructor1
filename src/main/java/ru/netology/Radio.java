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

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < minRadioStation) {
            return;
        }
        if (currentStationNumber > maxRadioStation) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation() {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation() {
        this.minRadioStation = minRadioStation;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume() {
        this.maxVolume = maxVolume;
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
