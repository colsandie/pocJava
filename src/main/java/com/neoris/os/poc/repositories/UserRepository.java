package com.neoris.os.poc.repositories;

import com.neoris.os.poc.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 * Descripcion:
 * <p>
 * <p>
 * Control de versiones:
 * Version  Date/Hour               	  By                 				Company     Description
 * -------  -------------------     	  ----------------    				--------    -----------------------------------------------------------------
 * 1.0      08/02/2021/11:10 a. m.         [Diego Colchado S.]              NEORIS	    Creacion de clase UserRepository.java
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
