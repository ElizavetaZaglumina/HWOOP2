package ru.netology.radio;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int numStation = 10;
    private int currentStation;
    private int currentVolume;

    public Radio(int size) {
        this.numStation = minStation + size;
    }

    public Radio() {

    }

    public int getNumStation() {

        return numStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = minStation;
            return;
        }
        if (newCurrentStation > maxStation) {
            currentStation = maxStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
