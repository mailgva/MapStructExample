package com.gorbatenko.mapstruct.model.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleSource {
    private String name;
    private String description;
}
