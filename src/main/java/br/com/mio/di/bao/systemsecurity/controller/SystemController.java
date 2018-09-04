package br.com.mio.di.bao.systemsecurity.controller;

import br.com.mio.di.bao.systemsecurity.model.System;
import br.com.mio.di.bao.systemsecurity.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {


    @Autowired
    private SystemService systemService;

    @PostMapping
    public System save(@RequestBody System system){
        return systemService.save(system);
    }
}
