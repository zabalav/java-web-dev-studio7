package org.launchcode.studio7;

public abstract class BaseDisc {
    public String title;
    private int storageCapacity;
    private int rpm;

    public BaseDisc(String title, int storageCapacity, int rpm) {
        this.title = title;
        this.storageCapacity = storageCapacity;
        this.rpm = rpm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "BaseDisc{" +
                "title='" + title + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", rpm=" + rpm +
                '}';
    }
}
