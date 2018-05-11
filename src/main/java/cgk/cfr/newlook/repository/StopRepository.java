package cgk.cfr.newlook.repository;

import cgk.cfr.newlook.service.entity.Stop;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class StopRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Stop> findAllStops() {
        String selectStatement = "SELECT s FROM Stop s";
        TypedQuery<Stop> selectAllQuery = entityManager.createQuery(selectStatement, Stop.class);

        return selectAllQuery.getResultList();
    }

    public Stop createStop(Stop stop) {
        entityManager.persist(stop);

        return stop;
    }

    public void deleteAllStops() {
        String deleteStatement = "DELETE FROM Stop s";
        Query deleteAllQuery = entityManager.createQuery(deleteStatement);
        deleteAllQuery.executeUpdate();
    }

}
