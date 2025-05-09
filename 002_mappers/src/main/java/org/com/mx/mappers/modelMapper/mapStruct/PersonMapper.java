package org.com.mx.mappers.modelMapper.mapStruct;

import org.com.mx.mappers.modelMapper.dto.PersonCustomDTO;
import org.com.mx.mappers.modelMapper.dto.PersonDefaultDTO;
import org.com.mx.mappers.modelMapper.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDTO personToPersonDefaultDTO(Person person);

    @Mapping(source = "id", target = "idDTO")
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "email", target = "emailDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDTO personToPersonCustomDTO(Person person);
}