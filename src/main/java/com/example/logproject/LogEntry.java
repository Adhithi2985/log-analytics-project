package com.example.logproject;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

@Entity 
public class LogEntry {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String level;
    private String message;
    private Instant timestamp;

    
    public LogEntry() {
        this.timestamp = Instant.now();
    }

    
    public LogEntry(String level, String message) {
        this.level = level;
        this.message = message;
        this.timestamp = Instant.now();
    }

    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
}