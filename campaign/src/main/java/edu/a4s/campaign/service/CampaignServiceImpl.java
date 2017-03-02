package edu.a4s.campaign.service;

import java.util.List;

import edu.a4s.campaign.dao.CampaignDAOImpl;
import edu.a4s.campaign.model.AdCampaign;

/**
 * 
 * @author abhay
 * @version 1.0
 */
public class CampaignServiceImpl {

	private CampaignDAOImpl cd =  new CampaignDAOImpl();
	
	/**
	 * GET : To list the AdCampaigns
	 * 
	 * @return list of campaigns
	 */
	public List<AdCampaign> getCampaignList() {
		return cd.listCampaigns();
	}

	/**
	 * Create an Ad Campaign
	 * @param adc
	 * @return
	 */
	public String createCampaign(AdCampaign adc){
       	 return cd.createCampaign(adc);
	}
}