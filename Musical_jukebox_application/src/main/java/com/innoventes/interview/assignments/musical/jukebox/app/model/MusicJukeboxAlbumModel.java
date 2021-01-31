package com.innoventes.interview.assignments.musical.jukebox.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="ALBUM")
public class MusicJukeboxAlbumModel implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ALBUM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "ALBUM_NAME")
	private String albumName;
		
	@Column(name = "ALBUM_MUSICIAN_NAME")
	private String albumMusicianName;
	
	@Column(name = "ALBUM_GENRE")
	private String genre;
	
	@Column(name = "ALBUM_PRICE")
	private double price;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ALBUM_DATE")
	private Date date;
	
	@Column(name = "ALBUM_DESCRIPTION")
	private String description;

	public MusicJukeboxAlbumModel(int id, String albumName, String albumMusicianName, String genre, double price,
			Date date, String description) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.albumMusicianName = albumMusicianName;
		this.genre = genre;
		this.price = price;
		this.date = date;
		this.description = description;
	}

	public MusicJukeboxAlbumModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAlbumMusicianName() {
		return albumMusicianName;
	}

	public void setAlbumMusicianName(String albumMusicianName) {
		this.albumMusicianName = albumMusicianName;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MusicJukeboxAlbumModel [id=" + id + ", albumName=" + albumName + ", albumMusicianName="
				+ albumMusicianName + ", genre=" + genre + ", price=" + price + ", date=" + date + ", description="
				+ description + ", getId()=" + getId() + ", getAlbumName()=" + getAlbumName()
				+ ", getAlbumMusicianName()=" + getAlbumMusicianName() + ", getGenre()=" + getGenre() + ", getPrice()="
				+ getPrice() + ", getDate()=" + getDate() + ", getDescription()=" + getDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
