/**
 * 
 */
package edu.a4s.campaign.dao;

import java.util.List;

import edu.a4s.campaign.model.AdCampaign;

/**
 * @author abhay
 *
 */
public interface CampaignDao {

	
	public  List<AdCampaign> listCampaigns();
	public String createCampaign(AdCampaign adc);
	
	
}
