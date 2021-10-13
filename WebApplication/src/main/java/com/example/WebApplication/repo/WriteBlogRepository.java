package com.example.WebApplication.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.WebApplication.model.WriteBlog;


public interface WriteBlogRepository extends CrudRepository<WriteBlog,Integer>{
	List<WriteBlog> findByTag(String string);
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          