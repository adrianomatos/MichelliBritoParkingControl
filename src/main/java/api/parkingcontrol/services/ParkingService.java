package api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import api.parkingcontrol.repositories.ParkingRepository;

@Service
public class ParkingService {

	@Autowired
	ParkingRepository parkingRepository;
	
}
