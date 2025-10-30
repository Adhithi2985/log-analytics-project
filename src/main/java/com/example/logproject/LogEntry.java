package com.example.logproject;

// --- Make sure you have ALL these imports ---
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

@Entity // <-- 1. This is essential
public class LogEntry {

    @Id // <-- 2. This is essential
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <-- 3. THIS IS THE FIX
    private Long id;

    private String level;
    private String message;
    private Instant timestamp;

    // --- 4. You need this empty constructor ---
    public LogEntry() {
        this.timestamp = Instant.now();
    }

    // This is the constructor we use
    public LogEntry(String level, String message) {
        this.level = level;
        this.message = message;
        this.timestamp = Instant.now();
    }

    // --- Getters and Setters (Spring needs these) ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
}