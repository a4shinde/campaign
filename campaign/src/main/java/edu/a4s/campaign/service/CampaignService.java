package edu.a4s.campaign.service;

import java.util.List;

import edu.a4s.campaign.model.AdCampaign;

public interface CampaignService {

	/**
	 * 
	 * @return List Campaigns
	 */
	public List<AdCampaign> getCampaignList(); 
	
	/**
	 * 
	 * @param adc
	 * @return
	 */
	public String createCampaign(AdCampaign adc);
	
}
