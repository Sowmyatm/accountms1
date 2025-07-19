package com.tekarch.tafDataStore.Repositories;

import com.tekarch.tafDataStore.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

