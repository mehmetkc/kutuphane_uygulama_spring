package com.ind.library.repo;

import com.ind.library.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface UsersRepository extends JpaRepository<Users, BigDecimal>  {
}
