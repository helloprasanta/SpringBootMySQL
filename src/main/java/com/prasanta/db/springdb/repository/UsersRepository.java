package com.prasanta.db.springdb.repository;

import com.prasanta.db.springdb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
