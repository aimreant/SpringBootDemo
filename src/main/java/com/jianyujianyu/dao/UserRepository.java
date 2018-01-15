package com.jianyujianyu.dao;

import com.jianyujianyu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lujianyu on 2018/1/15.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select t from User t where t.name = :name")
    User findByUsername(@Param("name") String name);
}
