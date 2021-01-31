package com.innoventes.interview.assignments.musical.jukebox.app.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PLAYLIST_SONG")
public class PlayListSong implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PLS_ID")
    private int id;

    @Column(name = "MUSICIAN_NAME")
	private String musicianName;

    @Column(name = "ALBUM_MUSICIAN_NAME")
	private String albumMusicianName;

	public PlayListSong(int id, String musicianName, String albumMusicianName) {
		super();
		this.id = id;
		this.musicianName = musicianName;
		this.albumMusicianName = albumMusicianName;
	}

	public PlayListSong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMusicianName() {
		return musicianName;
	}

	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}

	public String getAlbumMusicianName() {
		return albumMusicianName;
	}

	public void setAlbumMusicianName(String albumMusicianName) {
		this.albumMusicianName = albumMusicianName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PlayListSong [id=" + id + ", musicianName=" + musicianName + ", albumMusicianName=" + albumMusicianName
				+ ", getId()=" + getId() + ", getMusicianName()=" + getMusicianName() + ", getAlbumMusicianName()="
				+ getAlbumMusicianName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
	

}
