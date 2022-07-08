package com.game.model;

public class announcement {
	private int announcementID;
	private String announcement;
	private String description;
	private String section;
	private String announcementHead;
	
	
	public announcement(int announcementID, String announcement, String description, String section,
			String announcementHead) {
		
		this.announcementID = announcementID;
		this.announcement = announcement;
		this.description = description;
		this.section = section;
		this.announcementHead = announcementHead;
	}
	public int getAnnouncementID() {
		return announcementID;
	}
	
	public String getAnnouncement() {
		return announcement;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getSection() {
		return section;
	}
	
	public String getAnnouncementHead() {
		return announcementHead;
	}
	
	
	
}
