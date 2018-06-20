package com.sinosoft.hbins.dbplatform.repository;

import com.sinosoft.hbins.dbplatform.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
