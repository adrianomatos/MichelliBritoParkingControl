package api.parkingcontrol.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.parkingcontrol.models.ParkingModel;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingModel, UUID>{

}
