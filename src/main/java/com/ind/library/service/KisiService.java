package com.ind.library.service;

import com.ind.library.entity.Users;
import com.ind.library.repo.UsersRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class KisiService {
    private final UsersRepository usersRepository;

    public KisiService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    @Transactional
    public boolean userCheck(BigDecimal id, String sifre) {
        Users kullanici =  usersRepository.findById(id).get();
        if(sifre.equalsIgnoreCase(kullanici.getSifre()))
            return true;

        return false;
    }
}
