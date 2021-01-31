package com.innoventes.interview.assignments.musical.jukebox.app.dto;

import java.util.Date;

public class AlbumDto {

	private String albumName;
	private String musicianName;
	private String genre;
	private double price;
	private Date date;
	private String description;
	
	public AlbumDto(String albumName, String musicianName, String genre, double price, Date date, String description) {
		super();
		this.albumName = albumName;
		this.musicianName = musicianName;
		this.genre = genre;
		this.price = price;
		this.date = date;
		this.description = description;
	}

	public AlbumDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getMusicianName() {
		return musicianName;
	}

	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AlbumDto [albumName=" + albumName + ", musicianName=" + musicianName + ", genre=" + genre + ", price="
				+ price + ", date=" + date + ", description=" + description + ", getAlbumName()=" + getAlbumName()
				+ ", getMusicianName()=" + getMusicianName() + ", getGenre()=" + getGenre() + ", getPrice()="
				+ getPrice() + ", getDate()=" + getDate() + ", getDescription()=" + getDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
