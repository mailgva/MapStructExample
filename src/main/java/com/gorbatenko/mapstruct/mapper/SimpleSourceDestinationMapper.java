package com.gorbatenko.mapstruct.mapper;

import com.gorbatenko.mapstruct.model.simple.SimpleDestination;
import com.gorbatenko.mapstruct.model.simple.SimpleSource;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring")
@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}