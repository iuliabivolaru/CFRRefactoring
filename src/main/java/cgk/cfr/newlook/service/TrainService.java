//package cgk.cfr.newlook.service;
//
//import cgk.cfr.newlook.repository.TrainRepository;
//import cgk.cfr.newlook.service.entity.Train;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.persistence.TypedQuery;
//import java.util.List;
//
///**
// * Created by iuliab on 14.02.2018.
// */
//public class TrainService {
//
//    @Autowired
//    private TrainRepository trainRepository;
//
//    public List<Train> findTrainsByDepartureAndArrivalLocalities(String departureLocality, String arrivalLocality) {
//
//        return trainRepository.findTrainsByDepartureAndArrivalLocalities(departureLocality, arrivalLocality);
//    }
//}
