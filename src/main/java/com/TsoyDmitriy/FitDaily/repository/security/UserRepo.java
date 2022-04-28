package com.TsoyDmitriy.FitDaily.repository.security;

import com.TsoyDmitriy.FitDaily.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Modifying
    @Transactional
    void deleteById(Long id);

    Optional<User> findByLogin(String login);
}
