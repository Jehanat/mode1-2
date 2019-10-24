package com.jehanat.demo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends PagingAndSortingRepository<Employ,Integer> {

	@Query("SELECT e FROM Employ e WHERE dept=?1 AND desig=?2")
	List<Employ>findByDeptAndDesig(String dept,String desig);
	
	

	@Query("SELECT e FROM Employ e WHERE dept=?1 AND desig=?2 AND basic>=?3 ")
	List<Employ>findBySalary(String dept,String desig,int basic);
	
	@Query("SELECT e FROM Employ e WHERE  dept=?1 AND desig=?2 AND basic=?3 AND name like 'J%' ")
	List<Employ>findByEmployeeSalary(String dept,String desig,int basic,String name);


	@Query("SELECT e FROM Employ e WHERE  dept=?1 AND desig=?2 order by basic desc")
	List<Employ> findByDeptAndDesig(String dept, String desig, String basic);
	

	
	
	
}
