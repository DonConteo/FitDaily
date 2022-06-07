package com.TsoyDmitriy.FitDaily.repository.security;

import com.TsoyDmitriy.FitDaily.domain.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
