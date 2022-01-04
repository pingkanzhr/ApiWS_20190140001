/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservice.a.project.akhir;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@CrossOrigin
@RestController
@RequestMapping("/data")
public class DatabaseCont {
    @Autowired
    private OushopRepo oushop;
    
    @GetMapping("/oushop")
    public List<Oushop> getAllOushop(){
        return oushop.findAll();
    }
    
    @GetMapping ("/oushop/{kode}")
    public Oushop getOushopById(@PathVariable String kode){
        return oushop.findById(kode).get();
    }
    
    @PostMapping ("/oushop")
    public Oushop saveOushopDetails(@RequestBody Oushop o){
        return oushop.save(o);
    }
    
    @PutMapping("/oushop")
    public Oushop updateOushop(@RequestBody Oushop o){
        return oushop.save(o);
    }
    
    @DeleteMapping("/oushop/{kode}")
    public ResponseEntity<HttpStatus> deleteOushopById(@PathVariable String kode){
        oushop.deleteById(kode);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
            
}
