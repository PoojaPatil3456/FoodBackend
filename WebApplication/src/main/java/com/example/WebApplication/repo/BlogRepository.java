package com.example.WebApplication.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.WebApplication.model.Blog;

public interface BlogRepository extends CrudRepository<Blog , Integer> {

	/*@Query(value = "from Blog where user_name=?1 and password=?2")
	boolean findByNameAndPassword(String userName, String password);*/

	boolean existsByuserName(String userName);

	boolean existsBypassword(String password);

}
