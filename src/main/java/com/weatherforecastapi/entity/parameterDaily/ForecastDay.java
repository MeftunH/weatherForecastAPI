package com.weatherforecastapi.entity.parameterDaily;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Setter
@Getter
public class Forecastday {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;
    private int date_epoch;
    private Day day;
    private Astro astro;
    private ArrayList<Hour> hour;
}