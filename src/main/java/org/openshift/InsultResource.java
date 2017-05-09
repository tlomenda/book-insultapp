package org.openshift;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;

/**
 * Created by tlomenda on 5/9/17.
 */
@RequestScoped
@Path("/insult")

public class InsultResource {

    @GET()
    @Produces("application/json")
    public HashMap<String, String> getInsult() {
        HashMap<String, String> theInsult = new HashMap<String, String>();

        theInsult.put("insult", new InsultGenerator().generateInsult());
        return theInsult;
    }
}