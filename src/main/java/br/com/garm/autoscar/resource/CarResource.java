package br.com.garm.autoscar.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.garm.autoscar.model.Car;

/**
 * @author Gerdon Mafra
 *
 */

@Path("car")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {
	
	@GET
    public List<Car> list() {
        return Car.listAll();
    }

    @POST
    @Transactional
    public Response add(Car car) {
        Car.persist(car);
        return Response.ok(car).status(200).build();
    }

}
