//package cgk.cfr.newlook.repository;
//
//import cgk.cfr.newlook.service.entity.Train;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
///**
// * Created by iuliab on 13.02.2018.
// */
//@Repository
//public class TrainRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<Train> findTrainsByDepartureAndArrivalLocalities(String departureLocality, String arrivalLocality) {
//        String selectStatement = "SELECT t FROM Train t INNER JOIN t.routes r";
//
//        TypedQuery<Train> selectAllQuery = entityManager.createQuery(selectStatement + " WHERE r.departureLocality = '" +
//                departureLocality + "'"  + " AND r.arrivalLocality = '" + arrivalLocality + "'", Train.class);
//
//        return selectAllQuery.getResultList();
//    }
//
//}
