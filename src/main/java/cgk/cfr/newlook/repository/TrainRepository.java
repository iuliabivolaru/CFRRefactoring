package cgk.cfr.newlook.repository;

import cgk.cfr.newlook.service.entity.Train;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.awt.print.Book;
import java.util.List;

/**
 * Created by iuliab on 13.02.2018.
 */
@Repository
public class TrainRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Train> findTrainsByDepartureAndArrivalLocalities(String departureLocality, String arrivalLocality) {
        String selectStatement = "SELECT t FROM Train t";

        TypedQuery<Train> selectAllQuery = entityManager.createQuery(selectStatement + " WHERE DEPARTURE_LOCALITY = " +
                departureLocality + " AND ARRIVAL_LOCALITY = ", Train.class);

        return selectAllQuery.getResultList();
    }

}
