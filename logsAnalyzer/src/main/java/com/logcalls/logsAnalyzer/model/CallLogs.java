package com.logcalls.logsAnalyzer.model;

import org.json.JSONArray;
import org.json.JSONException;

import javax.persistence.*;

@Entity
@Table(name = "call_logs")
public class CallLogs {

    public CallLogs() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "duration")
    private String duration;

    @Column(name = "time_stamp")
    private String timeStamp;

    @Column(name = "recording_path")
    private String recordingPath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDuration() {
        return duration;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRecordingPath() {
        return recordingPath;
    }

    public void setRecordingPath(String recordingPath) {
        this.recordingPath = recordingPath;
    }

    @Override
    public String toString() {
        return "CallLogs{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", duration='" + duration + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", recordingPath='" + recordingPath + '\'' +
                '}';
    }
}
