package com.jplbrasil.helloworldapi.dto.mapper;

package com.jplbrasil.helloworldapi.dto.request.PersonDTO;
package com.jplbrasil.helloworldapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}