//package cgk.cfr.newlook.application.resource;
//
//import cgk.cfr.newlook.service.TrainService;
//import cgk.cfr.newlook.service.entity.Train;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import javax.ws.rs.*;
//import javax.ws.rs.core.GenericEntity;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
///**
// * Created by iuliab on 14.02.2018.
// */
//@Path("/trains")
//@Component
//public class TrainResource {
//
//    @Autowired
//    private TrainService trainService;
//
//    @GET
//    @Path("/available")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getAllAvailableBooks(@QueryParam("departureLocality") String departureLocality,
//                                         @QueryParam("arrivalLocality") String arrivalLocality){
//        List<Train> trains = trainService.findTrainsByDepartureAndArrivalLocalities(departureLocality, arrivalLocality);
//        if(trains.size() == 0){
//            return Response.status(Response.Status.NOT_FOUND).build();
//        }
//        return Response.ok().entity(new GenericEntity<List<Train>>(trains){}).build();
//    }
//}
