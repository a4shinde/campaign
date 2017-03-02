package edu.a4s.campaign.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import edu.a4s.campaign.model.AdCampaign;
import edu.a4s.campaign.service.CampaignServiceImpl;

/**
 * Root resource (exposed at "ad" path)
 */
@Path("ad")
public class MyCampaign {

	
	CampaignServiceImpl cService = new CampaignServiceImpl(); 
    /**
     * Method handling HTTP GET requests. 
     *
     * @return String that will be returned as a JSON response.
     */
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AdCampaign> listCampaigns() {
    	
        return cService.getCampaignList();
    }
    
    /**
     * 
     * Method handling HTTP POST request
     * 
     * Method consumes and produces JSON object
     * 
     * @return int 
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createCampaign(Request req) {
    	
    	req.toString();
    	
    	
    	AdCampaign adc  = new AdCampaign();
    	
    	//Make it Auto generated when adding to DB
    	adc.setPartner_id("A100");
    	adc.setDuration(50);
    	adc.setAdContent("This is the content for the Ad campaign A100");
    	
    	return cService.createCampaign(adc);
    }
}