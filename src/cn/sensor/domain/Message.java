package cn.sensor.domain;

public class Message {
    private int id;
    private int heartrate;
    private int bloodoxygen;
    private float temperature;
    private String theTime;
    public Message() {
    }

    public Message(int id, int heartrate, int bloodoxygen, float temperature) {
        this.id = id;
        this.heartrate = heartrate;
        this.bloodoxygen = bloodoxygen;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getBloodoxygen() {
        return bloodoxygen;
    }

    public void setBloodoxygen(int bloodoxygen) {
        this.bloodoxygen = bloodoxygen;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getTheTime() {
        return theTime;
    }

    public void setTheTime(String theTime) {
        this.theTime = theTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", heartrate=" + heartrate +
                ", bloodoxygen=" + bloodoxygen +
                ", temperature=" + temperature +
                ", theTime='" + theTime + '\'' +
                '}';
    }

}
