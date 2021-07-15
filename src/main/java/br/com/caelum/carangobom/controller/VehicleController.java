package br.com.caelum.carangobom.controller;

import br.com.caelum.carangobom.domain.Vehicle;
import br.com.caelum.carangobom.exception.VehicleNotFoundException;
import br.com.caelum.carangobom.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carangobom/v1/vehicle")
@ResponseBody
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAll() {
        return new ResponseEntity<>(vehicleService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getById(@PathVariable Long id) throws VehicleNotFoundException {
        return new ResponseEntity<>(vehicleService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create() {
        return "OK";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id) {
        return "OK";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return "OK";
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable long id) {
//        return ResponseEntity.notFound().build();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getById(@PathVariable  long id) {
//        return ResponseEntity.notFound().build();
//    }
}
