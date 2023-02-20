package src.com.entertainment;

public enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private final int volumeLevel;

    VolumeLevel(Integer volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public Integer getVolumeLevel() {
        return volumeLevel;
    }

    public String toString() {
        return String.valueOf(volumeLevel);
    }
}