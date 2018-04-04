package cgk.cfr.newlook.repository;

import cgk.cfr.newlook.service.entity.Agency;
import cgk.cfr.newlook.service.entity.Route;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by iuliab on 13.02.2018.
 */
@Repository
public class RouteRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Route> findAllRoutes() {
        String selectStatement = "SELECT r FROM Route r";
        TypedQuery<Route> selectAllQuery = entityManager.createQuery(selectStatement, Route.class);
        return selectAllQuery.getResultList();
    }

    public List<Route> findRoutesByDepartureAndArrival(String departure, String arrival) {
        String selectStatement = "SELECT r FROM Route r WHERE longName LIKE '%" + departure + "%" + arrival + "%'";
        TypedQuery<Route> selectAllQuery = entityManager.createQuery(selectStatement, Route.class);
        return selectAllQuery.getResultList();
    }

    public Route createRoute(Route route) {
        entityManager.persist(route.getAgency());
        entityManager.persist(route);

        return route;
    }

    public void deleteAllRoutes() {
        String deleteStatement = "DELETE FROM Route r";
        Query deleteAllQuery = entityManager.createQuery(deleteStatement);
        deleteAllQuery.executeUpdate();
    }
}
