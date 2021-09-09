package com.example.WebApplication.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.WebApplication.model.WriteBlog;


public interface WriteBlogRepository extends CrudRepository<WriteBlog,Integer>{
	public List<WriteBlog> findByTag(String tag);

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          