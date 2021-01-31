package com.innoventes.interview.assignments.musical.jukebox.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.interview.assignments.musical.jukebox.app.model.MusicJukeboxAlbumModel;
import com.innoventes.interview.assignments.musical.jukebox.app.model.MusicJukeboxMusicianModel;
import com.innoventes.interview.assignments.musical.jukebox.app.model.PlayListSong;
import com.innoventes.interview.assignments.musical.jukebox.app.repository.AlbumRepository;
import com.innoventes.interview.assignments.musical.jukebox.app.repository.MusicianRepository;
import com.innoventes.interview.assignments.musical.jukebox.app.repository.PlayListSongRepository;


@Service
public class JukeboxServiceImpl {

   
    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private MusicianRepository musicianRepository;

    @Autowired
    private PlayListSongRepository playListSongRepository;

    private static List<MusicJukeboxAlbumModel> list1 = new ArrayList<>();
    private static List<MusicJukeboxMusicianModel> list2 = new ArrayList<>();
    private static List<PlayListSong> list3 = new ArrayList<>();
    
    
public MusicJukeboxAlbumModel addMusicJukeboxAlbumModel(MusicJukeboxAlbumModel a) {
		
		list1.add(a);
		return a;
	}


public MusicJukeboxMusicianModel addMusicJukeboxMusicianModel(MusicJukeboxMusicianModel m) {
	
	list2.add(m);
	return m;
}


public List<MusicJukeboxAlbumModel> getAllMusicJukeboxAlbumModel(){
	
	return list1;
}

public MusicJukeboxAlbumModel getMusicJukeboxAlbumModelById(int id) {
	MusicJukeboxAlbumModel musicJukeboxAlbumModel=null;
	try {
		musicJukeboxAlbumModel=list1.stream().filter(e->e.getId()==id).findFirst().get();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return musicJukeboxAlbumModel;
}


public List<MusicJukeboxMusicianModel> getAllMusicJukeboxMusicianModel(){
	
	return list2;
}

public MusicJukeboxMusicianModel getMusicJukeboxMusicianModelById(int id) {
	MusicJukeboxMusicianModel musicJukeboxMusicianModel=null;
	try {
		musicJukeboxMusicianModel=list2.stream().filter(e->e.getId()==id).findFirst().get();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return musicJukeboxMusicianModel;
}




public void deleteMusicJukeboxAlbumModel(int did)
{
	list1=list1.stream().filter(musicJukeboxAlbumModel->musicJukeboxAlbumModel.getId()!=did).collect(Collectors.toList());
	
	/*list=list.stream().filter(demo->{
		if(demo.getId()!=did)
		{
			return true;
		}
		else {
			return false;
		}
	}).collect(Collectors.toList());*/
}


public void updateMusicJukeboxAlbumModel(MusicJukeboxAlbumModel musicJukeboxAlbumModel,int musicJukeboxAlbumModelId)
{
	list1=list1.stream().map(a->{
		if(a.getId()==musicJukeboxAlbumModelId) {
			a.setAlbumName(musicJukeboxAlbumModel.getAlbumName());
			a.setAlbumMusicianName(musicJukeboxAlbumModel.getAlbumMusicianName());
			a.setGenre(musicJukeboxAlbumModel.getGenre());
			a.setPrice(musicJukeboxAlbumModel.getPrice());
			a.setDate(musicJukeboxAlbumModel.getDate());
			a.setDescription(musicJukeboxAlbumModel.getDescription());
		}
				
		return a;
	}).collect(Collectors.toList());
}

public void deleteMusicJukeboxMusicianModel(int did)
{
	list2=list2.stream().filter(musicJukeboxMusicianModel->musicJukeboxMusicianModel.getId()!=did).collect(Collectors.toList());
	
	/*list=list.stream().filter(demo->{
		if(demo.getId()!=did)
		{
			return true;
		}
		else {
			return false;
		}
	}).collect(Collectors.toList());*/
}


public void updateMusicJukeboxMusicianModel(MusicJukeboxMusicianModel musicJukeboxMusicianModel,int musicJukeboxMusicianModelId)
{
	list2=list2.stream().map(m->{
		if(m.getId()==musicJukeboxMusicianModelId) {
			m.setMusicianName(musicJukeboxMusicianModel.getMusicianName());
			m.setMusicianType(musicJukeboxMusicianModel.getMusicianType());
		}
				
		return m;
	}).collect(Collectors.toList());
}




    }

    