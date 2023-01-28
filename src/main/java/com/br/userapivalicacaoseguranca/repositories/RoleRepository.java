package com.br.userapivalicacaoseguranca.repositories;

import com.br.userapivalicacaoseguranca.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
