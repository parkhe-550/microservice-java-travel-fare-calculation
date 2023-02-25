package com.parkhe.travels.agency.pojo;

public class ApplicationProperty {
    private String applicationName;
    private int minConnection;
    private int maxConnection;

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setMinConnection(int minConnection) {
        this.minConnection = minConnection;
    }

    public void setMaxConnection(int maxConnection) {
        this.maxConnection = maxConnection;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public int getMinConnection() {
        return minConnection;
    }

    public int getMaxConnection() {
        return maxConnection;
    }
}
