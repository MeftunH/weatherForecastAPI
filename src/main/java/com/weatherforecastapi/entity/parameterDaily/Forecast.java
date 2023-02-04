package com.weatherforecastapi.entity.parameterDaily;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Forecast {
    private ArrayList<Forecastday> forecastday;
}
