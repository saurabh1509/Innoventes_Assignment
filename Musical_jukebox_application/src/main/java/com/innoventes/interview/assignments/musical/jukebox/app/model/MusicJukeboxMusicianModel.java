package com.innoventes.interview.assignments.musical.jukebox.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "MUSICIAN")
public class MusicJukeboxMusicianModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

 
	@Id
    @Column(name = "MUSICIAN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "MUSICIAN_NAME")
	private String musicianName;
	
	@Column(name = "MUSICIAN_TYPE")
	private String musicianType;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "PLAYLIST_SONG", joinColumns = @JoinColumn(name = "MUSICIAN_NAME", referencedColumnName = "MUSICIAN_NAME"), inverseJoinColumns = @JoinColumn(name = "ALBUM_MUSICIAN_NAME", referencedColumnName = "ALBUM_MUSICIAN_NAME"))
    private List<MusicJukeboxMusicianModel> song = new ArrayList<>();

	
	
	
	
	
	public MusicJukeboxMusicianModel(int id, String musicianName, String musicianType) {
		super();
		this.id = id;
		this.musicianName = musicianName;
		this.musicianType = musicianType;
	}


	public MusicJukeboxMusicianModel() {
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


	public String getMusicianType() {
		return musicianType;
	}


	public void setMusicianType(String musicianType) {
		this.musicianType = musicianType;
	}


	@Override
	public String toString() {
		return "MusicJukeboxMusicianModel [id=" + id + ", musicianName=" + musicianName + ", musicianType="
				+ musicianType + ", getId()=" + getId() + ", getMusicianName()=" + getMusicianName()
				+ ", getMusicianType()=" + getMusicianType() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
