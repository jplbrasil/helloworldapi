package com.jplbrasil.helloworldapi.repositories;

import com.jplbrasil.helloworldapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {
}
