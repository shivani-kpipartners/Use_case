package com.Assignment_20oct.Insurance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepo extends JpaRepository<Client_entity, Integer>{
	
    @Query(value="SELECT * from Client_data c where c.Client_id= ?1",nativeQuery=true)
	public List<Client_entity> getdetails(Integer Client_id);
	
	@Query(value="SELECT * from Client_data c",nativeQuery=true)
	public List<Client_entity> getdetails();

}
