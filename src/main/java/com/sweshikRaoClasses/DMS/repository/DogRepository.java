package com.sweshikRaoClasses.DMS.repository;
/*
 * @ Sweshik Rao Nemarukommula
 */

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.sweshikRaoClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog> findByName(String name);

}
