package edu.course.lab02;

public class DataSample {
    private final SampleId id;
    private String label;
    private SampleStatus status;
    private double[] features;

    public DataSample(SampleId id, String label, double[] features) {
        if (id == null) {
            throw new IllegalArgumentException("ID не может быть null");
        }
        if (label == null || label.trim().isEmpty()) {
            throw new IllegalArgumentException("Метка не может быть пустой");
        }
        if (features == null || features.length == 0) {
            throw new IllegalArgumentException("Массив признаков пуст");
        }

        this.id = id;
        this.label = label;
       
        this.features = features.clone();
        this.status = SampleStatus.NEW;
    }

    public void changeStatus(SampleStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("Статус не может быть null");
        }
        this.status = newStatus;
    }

    public boolean isReady() {
        return this.status == SampleStatus.READY;
    }

    public double calculateMean() {
        double sum = 0;
        for (double f : features) {
            sum += f;
        }
        return sum / features.length;
    }

    
    public double[] getFeatures() {
        return features.clone();
    }

    
    public double[] getNormalizedFeatures() {
        double[] normalized = new double[features.length];
        double min = features[0];
        double max = features[0];
        
        for (double f : features) {
            if (f < min) min = f;
            if (f > max) max = f;
        }
        
        for (int i = 0; i < features.length; i++) {
            normalized[i] = (max == min) ? 0.0 : (features[i] - min) / (max - min);
        }
        return normalized;
    }
}