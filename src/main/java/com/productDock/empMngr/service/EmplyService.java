package com.productDock.empMngr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.productDock.empMngr.exception.UserNotFoundException;
import com.productDock.empMngr.model.Emply;
import com.productDock.empMngr.repo.EmplyRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional //important for DELETE
public class EmplyService {
    private final EmplyRepo emplyRepo;

    @Autowired
    public EmplyService(EmplyRepo emplyRepo){
        this.emplyRepo=emplyRepo;
    }

    public Emply addEmply(Emply emply){
        emply.setPersonalCode(UUID.randomUUID().toString());
        return emplyRepo.save(emply);
    }

    public List<Emply> findAllEmply(){
        return emplyRepo.findAll();
    }

    public Emply updateEmply(Emply emply){
        return emplyRepo.save(emply);
    }

    public Emply findEmplyById(Long id)  {
        return emplyRepo.findEmplyById(id).orElseThrow(()->new UserNotFoundException("Employee by this id " + id + " is not fount"));
    }

    public void deleteEmply(Long id){ emplyRepo.deleteEmplyById(id); }
}
