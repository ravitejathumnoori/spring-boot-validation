package com.self.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.self.controller.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Long> {
}
