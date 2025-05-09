package org.com.mx.mappers.modelMapper;

import org.com.mx.mappers.modelMapper.dto.PersonCustomDTO;
import org.com.mx.mappers.modelMapper.entity.Person;
import org.com.mx.mappers.modelMapper.mapStruct.PersonMapper;

public class mapStructExample {

	  /* MapStruct - Custom */
    public static void main(String[] args) {
        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonCustomDTO personCustomDTO = PersonMapper.INSTANCE.personToPersonCustomDTO(personEntity);
        System.out.println(personCustomDTO);
    }
	
}
