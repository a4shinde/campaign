package edu.a4s.campaign.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model for campaign advertisement Content
 * 
 * @author abhay
 * @version 1.0
 */
@XmlRootElement
public class AdCampaign {

	// Unique String representing a partner
	private String partner_id = "";
	// campaign duration in seconds from now
	private int duration = 0;
	// AdContent : details about he Ad
	private String adContent = "";

	
	/**
	 * default constructor
	 */
	public AdCampaign() {

	}

	/**
	 * Constructor with parameters
	 * 
	 * @param pid
	 * @param duration
	 * @param adContent
	 */
	public AdCampaign(String pid, int duration, String adContent) {
		this.partner_id = pid;
		this.duration = duration;
		this.adContent = adContent;

	}

	/**
	 * @return the partner_id
	 */
	public String getPartner_id() {
		return partner_id;
	}

	/**
	 * @param partner_id
	 *            the partner_id to set
	 */
	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the adContent
	 */
	public String getAdContent() {
		return adContent;
	}

	/**
	 * @param adContent
	 *            the adContent to set
	 */
	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}

	@Override
	public String toString() {

		return "partner_id : " + partner_id + "duration : " + duration + "adContent : " + adContent;
	}
}
