package br.com.mio.di.bao.systemsecurity.repository;

import br.com.mio.di.bao.systemsecurity.model.System;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemRepository extends JpaRepository<System, Integer> {
}
