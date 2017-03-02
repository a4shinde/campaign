package edu.a4s.campaign.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.a4s.campaign.model.AdCampaign;

/**
 * 
 * Database details
 *  
 * @author abhay
 *
 */
public class CampaignDAOImpl implements CampaignDao{
	
	private static List<AdCampaign> AdCompaignList = new ArrayList<AdCampaign>();
	
	public CampaignDAOImpl() {
		super();
		AdCompaignList.add(new AdCampaign("A100",90,"Description about the adcontent A100"));
		AdCompaignList.add(new AdCampaign("A200",100,"Description about the adcontent A200"));
	}
	
	/**
	 * 
	 * @return
	 */
	public List<AdCampaign> listCampaigns(){
		if(AdCompaignList.isEmpty()){
			AdCompaignList.add(new AdCampaign("0000",00,"Dummy Ad Campaign - 0000"));
		}
        return AdCompaignList;	
	}


	@Override
	public String createCampaign(AdCampaign adc) {
		
		int randomNumber = new Random().nextInt();
		String uniqueid = "A" + randomNumber;
		System.out.println("uniqueId : " + uniqueid);
		
		System.out.println("Adding : " + uniqueid + " : " + adc.getDuration() + "" + adc.getAdContent() );
		AdCompaignList.add(adc);
		return "Created !!";
	}
}