package net.therailwayproject.alex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Station implements Serializable {

	private String name;
	private double lat, lon;
	private List<Integer> stationTracks;
	
	public Station(String name, double lat, double lon) {
		this.name = name;
		this.lat = lat;
		this.lon = lon;
		stationTracks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public void addTrack(int id) {
		stationTracks.add(id);
	}
	
	public List<Integer> getTracks() {
		return this.stationTracks;
	}
}
