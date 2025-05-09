package org.com.mx.mappers.modelMapper;

import org.com.mx.mappers.modelMapper.dto.PersonCustomDTO;
import org.com.mx.mappers.modelMapper.entity.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class modelMapper {
	
	public static void main(String[] args) {
		
		  	ModelMapper modelMapper = new ModelMapper();

	        TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);
	        propertyMapper.addMapping(Person::getId, PersonCustomDTO::setIdDTO);
	        propertyMapper.addMapping(Person::getName, PersonCustomDTO::setNameDTO);
	        propertyMapper.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
	        propertyMapper.addMapping(Person::getEmail, PersonCustomDTO::setEmailDTO);
	        propertyMapper.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);

	        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
	        System.out.println(personEntity);

	        PersonCustomDTO personDTO = propertyMapper.map(personEntity);
	        System.out.println(personDTO.toString());
		
	}

}
