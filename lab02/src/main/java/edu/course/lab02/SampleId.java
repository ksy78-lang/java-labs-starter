package edu.course.lab02;

public record SampleId(String value) {
    public SampleId {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }
    }
}