package com.astontech.RestFA.controllers;

import com.astontech.RestFA.domain.Vehicle;
import com.astontech.RestFA.domain.VehicleMakeAndModel;
import com.astontech.RestFA.exceptions.VehicleMakeAndModelNotFoundException;
import com.astontech.RestFA.exceptions.VehicleNotFoundException;
import com.astontech.RestFA.services.VehicleMakeAndModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/vehicleMakeAndModel")
public class VehicleMakeAndModelRestController {

    //regionDI
    private VehicleMakeAndModelService vehicleMakeAndModelService;

    public VehicleMakeAndModelRestController(VehicleMakeAndModelService vehicleMakeAndModelService){
        this.vehicleMakeAndModelService = vehicleMakeAndModelService;
    }
    //endregion

    //regionCRUD MAPPINGS

    @GetMapping("/")
    public ResponseEntity<Iterable<VehicleMakeAndModel>> getAllMakesAndModels(){
        Iterable<VehicleMakeAndModel> vehicleMakeAndModelIterable = vehicleMakeAndModelService.getAllMakeAndModel();
        return new ResponseEntity<>(vehicleMakeAndModelIterable, HttpStatus.ACCEPTED);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<VehicleMakeAndModel> getVehicleMakeAndModelById(@PathVariable Integer id) throws VehicleMakeAndModelNotFoundException{
//        VehicleMakeAndModel vehicleMakeAndModel = vehicleMakeAndModelService.findVehicleMakeAndModelById(id)
//                .orElseThrow(()-> new VehicleMakeAndModelNotFoundException(id));
//        return new ResponseEntity<>(vehicleMakeAndModel, HttpStatus.ACCEPTED);
//    }
//
////    @PatchMapping("/{id}")
////    public ResponseEntity<VehicleMakeAndModel> partialUpdateDynamic(@RequestBody Map<String, Object> updates,
////                                                                    @PathVariable Integer id){
////        return new ResponseEntity<>(vehicleMakeAndModelService.patchVehicleMakeAndModel(updates, id),
////                HttpStatus.ACCEPTED
////        );
////    }
//
//    @PostMapping("/")
//    public ResponseEntity<VehicleMakeAndModel> addVehicleMakeAndModel(@RequestBody VehicleMakeAndModel vehicleMakeAndModel){
//        return  new ResponseEntity<>(vehicleMakeAndModelService.saveMakeAndModel(vehicleMakeAndModel),
//                HttpStatus.CREATED
//        );
//    }
//
//    @PutMapping("/")
//    public ResponseEntity<VehicleMakeAndModel> updateVehicleMakeAndModel(
//            @RequestBody VehicleMakeAndModel vehicleMakeAndModel){
//        return new ResponseEntity<>(vehicleMakeAndModelService.saveMakeAndModel(vehicleMakeAndModel),
//        HttpStatus.ACCEPTED
//        );
//    }
//
//    @DeleteMapping("{id}")
//    public void deleteVehicleById(@PathVariable Integer id){
//        vehicleMakeAndModelService.deleteMakAndModelById(id);
//    }
//
//
//







    //endregion





}
