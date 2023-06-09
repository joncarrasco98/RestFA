package com.astontech.RestFA.repositories;

import com.astontech.RestFA.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> {

    Vehicle getVehicleById(Integer id);

    Optional<Vehicle> findByPurchasePrice(String purchasePrice);

    Optional<Vehicle> findByPurchasePriceOrId(String purchasePrice, Integer id);

    Vehicle findByVin(String vin);

    void deleteByVin(String vin);

}
