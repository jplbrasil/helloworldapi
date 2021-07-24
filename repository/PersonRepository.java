package com.jplbrasil.helloworldapi.repository;

import com.jplbrasil.helloworldapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {
}
