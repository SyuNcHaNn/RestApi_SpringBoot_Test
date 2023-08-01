package nexmore.RestApi.swagger.entity;

import java.util.Date;

public class Post {
	
    private String postId;
    private String title;
    private String contents;
    
    public Post(){}

	public Post(String postId, String title, String contents) {
		super();
		this.postId = postId;
		this.title = title;
		this.contents = contents;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
//    private String userId;
//    private double lat;
//    private double lon;
//    private double battery;
//    private int eventStatus;
//    private String eventCancel;
//    private Date date;
//
//    public Post(){}
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public double getLat() {
//		return lat;
//	}
//
//	public void setLat(double lat) {
//		this.lat = lat;
//	}
//
//	public double getLon() {
//		return lon;
//	}
//
//	public void setLon(double lon) {
//		this.lon = lon;
//	}
//
//	public double getBattery() {
//		return battery;
//	}
//
//	public void setBattery(double battery) {
//		this.battery = battery;
//	}
//
//	public int getEventStatus() {
//		return eventStatus;
//	}
//
//	public void setEventStatus(int eventStatus) {
//		this.eventStatus = eventStatus;
//	}
//
//	public String getEventCancel() {
//		return eventCancel;
//	}
//
//	public void setEventCancel(String eventCancel) {
//		this.eventCancel = eventCancel;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public Post(String userId, double lat, double lon, double battery, int eventStatus, String eventCancel, Date date) {
//		super();
//		this.userId = userId;
//		this.lat = lat;
//		this.lon = lon;
//		this.battery = battery;
//		this.eventStatus = eventStatus;
//		this.eventCancel = eventCancel;
//		this.date = date;
//	}

    
}