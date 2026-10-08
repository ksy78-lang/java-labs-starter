package edu.course.lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataSampleTest {

    @Test
    public void testValidSampleAndBehavior() {
        SampleId id = new SampleId("ID-1");
        double[] features = {1.0, 3.0, 5.0};
        DataSample sample = new DataSample(id, "Метка", features);
        
        assertFalse(sample.isReady());
        sample.changeStatus(SampleStatus.READY);
        assertTrue(sample.isReady());
        assertEquals(3.0, sample.calculateMean(), 0.001);
    }

    @Test
    public void testDefensiveCopying() {
        SampleId id = new SampleId("ID-2");
        double[] originalFeatures = {1.0, 2.0};
        DataSample sample = new DataSample(id, "Метка", originalFeatures);
        
       
        originalFeatures[0] = 99.0;
        assertEquals(1.0, sample.getFeatures()[0], 0.001);
        
        
        double[] returnedFeatures = sample.getFeatures();
        returnedFeatures[0] = 99.0;
        assertEquals(1.0, sample.getFeatures()[0], 0.001);
    }

    @Test
    public void testInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> new SampleId(""));
        assertThrows(IllegalArgumentException.class, () -> new DataSample(new SampleId("1"), "", new double[]{1.0}));
        assertThrows(IllegalArgumentException.class, () -> new DataSample(new SampleId("1"), "Label", new double[]{}));
    }
}