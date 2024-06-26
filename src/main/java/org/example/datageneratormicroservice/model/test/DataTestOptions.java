package org.example.datageneratormicroservice.model.test;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.datageneratormicroservice.model.MeasurementType;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;
    private MeasurementType[] measurementTypes;

}
