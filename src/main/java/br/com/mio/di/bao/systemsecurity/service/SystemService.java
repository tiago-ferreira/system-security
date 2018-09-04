package br.com.mio.di.bao.systemsecurity.service;

import br.com.mio.di.bao.systemsecurity.model.System;
import br.com.mio.di.bao.systemsecurity.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemService {

    @Autowired
    private SystemRepository systemRepository;

    public System save(System system) {
        return systemRepository.save(system);
    }
}
