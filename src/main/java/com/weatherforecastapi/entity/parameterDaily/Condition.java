package com.weatherforecastapi.entity.parameterDaily;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Condition {
    private String text;
    private String icon;
    private int code;
}