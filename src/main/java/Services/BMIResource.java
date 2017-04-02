package Services;

import Domain.BMIData;
import javax.ws.rs.*;

/**
 * Created by Polle on 31-3-2017.
 */
@Path("/bmi")
public class BMIResource {

    @GET
    @Produces("application/json")
    @Path("get")
    public String bmi(@QueryParam("lengte") String lengte, @QueryParam("gewicht") String gewicht) {
        String res;
        try{

            BMIData bmiData = new BMIData(Float.parseFloat(lengte), Float.parseFloat(gewicht));
            res = "{'BMI':'" + bmiData.getBMI() + "'}";
        }
        catch(NumberFormatException e){
            res = "{ERROR: 'Lengte and Gewicht both have to be numbers'}";
        }
        return res;
    }
}