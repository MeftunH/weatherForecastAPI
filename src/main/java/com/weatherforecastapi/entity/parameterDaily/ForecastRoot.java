package com.weatherforecastapi.entity.parameterDaily;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ForecastRoot {
    private Location location;
    private Current current;
    private Forecast forecast;
}