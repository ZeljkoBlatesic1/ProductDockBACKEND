package com.productDock.empMngr.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.productDock.empMngr.model.Emply;
import com.productDock.empMngr.service.EmplyService;

import java.util.List;

@RestController
@RequestMapping("/emply")
public class EmplyRsrc {
    private final EmplyService emplyService;

    public EmplyRsrc(EmplyService emplyService){
        this.emplyService=emplyService;
    }

    //methods for actions
    @GetMapping("/all")
    public ResponseEntity<List<Emply>> getAllEmplies(){
        List<Emply> emplies = emplyService.findAllEmply();
        return new ResponseEntity<>(emplies, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Emply> getEmplyById (@PathVariable("id") Long id) {
        Emply emply = emplyService.findEmplyById(id);
        return new ResponseEntity<>(emply, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Emply> addEmply(@RequestBody Emply emply){
        Emply newEmply=emplyService.addEmply(emply);
        return new ResponseEntity<>(newEmply, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Emply> updateEmply(@RequestBody Emply emply){
        Emply updateEmply=emplyService.updateEmply(emply);
        return new ResponseEntity<>(updateEmply, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmply(@PathVariable("id") Long id){
        emplyService.deleteEmply(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
