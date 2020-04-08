package com.example.mapstruts.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SourceTargetMapper {

    @Mapping(source = "qax", target = "baz")
    @Mapping(source = "baz", target = "qax")
    Target sourceToTarget(Source source);

}
