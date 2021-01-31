package com.innoventes.interview.assignments.musical.jukebox.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.innoventes.interview.assignments.musical.jukebox.app.model.MusicJukeboxAlbumModel;
import com.innoventes.interview.assignments.musical.jukebox.app.model.MusicJukeboxMusicianModel;
import com.innoventes.interview.assignments.musical.jukebox.app.service.impl.JukeboxServiceImpl;





@RestController

public class JukeboxController {
	
	
	@Autowired
	private JukeboxServiceImpl jukeboxServiceImpl;
	
	
	
	@PostMapping("/albums")
	public ResponseEntity<MusicJukeboxAlbumModel> AddMusicJukeboxAlbumModel(@RequestBody  MusicJukeboxAlbumModel musicJukeboxAlbumModel) {
				
		MusicJukeboxAlbumModel a=null;
		
		try {
			a=this.jukeboxServiceImpl.addMusicJukeboxAlbumModel(musicJukeboxAlbumModel);
			System.out.println(musicJukeboxAlbumModel);
			
			return ResponseEntity.of(Optional.of(a));
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
	}
	
	@PostMapping("/musicians")
	public ResponseEntity<MusicJukeboxMusicianModel> AddMusicJukeboxMusicianModel(@RequestBody  MusicJukeboxMusicianModel musicJukeboxMusicianModel) {
				
		MusicJukeboxMusicianModel m=null;
		
		try {
			m=this.jukeboxServiceImpl.addMusicJukeboxMusicianModel(musicJukeboxMusicianModel);
			System.out.println(musicJukeboxMusicianModel);
			
			return ResponseEntity.of(Optional.of(m));
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
	}
	
	@GetMapping("/albums")
	public ResponseEntity<List<MusicJukeboxAlbumModel>> getMusicJukeboxAlbumModel() {
		
		List<MusicJukeboxAlbumModel>  list1=jukeboxServiceImpl.getAllMusicJukeboxAlbumModel();
		if(list1.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list1));
	}
	
	
	@GetMapping("/albums/{id}")
	public ResponseEntity<MusicJukeboxAlbumModel> getMusicJukeboxAlbumModel(@PathVariable("id") int id) {
		
		MusicJukeboxAlbumModel musicJukeboxAlbumModel=jukeboxServiceImpl.getMusicJukeboxAlbumModelById(id);
		if(musicJukeboxAlbumModel==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(musicJukeboxAlbumModel));
		
	}
	
	@GetMapping("/musicians")
	public ResponseEntity<List<MusicJukeboxMusicianModel>> getMusicJukeboxMusicianModel() {
		
		List<MusicJukeboxMusicianModel>  list2=jukeboxServiceImpl.getAllMusicJukeboxMusicianModel();
		if(list2.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list2));
	}
	
	
	@GetMapping("/musicians/{id}")
	public ResponseEntity<MusicJukeboxMusicianModel> getMusicJukeboxMusicianModel(@PathVariable("id") int id) {
		
		MusicJukeboxMusicianModel musicJukeboxMusicianModel=jukeboxServiceImpl.getMusicJukeboxMusicianModelById(id);
		if(musicJukeboxMusicianModel==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(musicJukeboxMusicianModel));
		
	}
	
	@DeleteMapping("/albums/{musicJukeboxAlbumModelId}")
	public ResponseEntity<Void> deleteMusicJukeboxAlbumModel(@PathVariable("musicJukeboxAlbumModelId") int musicJukeboxAlbumModelId) {
		 
		try {
			this.jukeboxServiceImpl.deleteMusicJukeboxAlbumModel(musicJukeboxAlbumModelId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("/albums/{musicJukeboxAlbumModelId}")
	public ResponseEntity<MusicJukeboxAlbumModel> updateMusicJukeboxAlbumModel(@RequestBody MusicJukeboxAlbumModel musicJukeboxAlbumModel,@PathVariable("musicJukeboxAlbumModelId") int musicJukeboxAlbumModelId) {
		
		try {
			this.jukeboxServiceImpl.updateMusicJukeboxAlbumModel(musicJukeboxAlbumModel,musicJukeboxAlbumModelId);
			return ResponseEntity.ok().body(musicJukeboxAlbumModel);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}@DeleteMapping("/musicians/{musicJukeboxMusicianModelId}")
	public ResponseEntity<Void> deleteMusicJukeboxMusicianModel(@PathVariable("musicJukeboxMusicianModelId") int musicJukeboxMusicianModelId) {
		 
		try {
			this.jukeboxServiceImpl.deleteMusicJukeboxMusicianModel(musicJukeboxMusicianModelId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("/musicians/{musicJukeboxMusicianModelId}")
	public ResponseEntity<MusicJukeboxMusicianModel> updateMusicJukeboxMusicianModel(@RequestBody MusicJukeboxMusicianModel musicJukeboxMusicianModel,@PathVariable("musicJukeboxMusicianModelId") int musicJukeboxMusicianModelId) {
		
		try {
			this.jukeboxServiceImpl.updateMusicJukeboxMusicianModel(musicJukeboxMusicianModel,musicJukeboxMusicianModelId);
			return ResponseEntity.ok().body(musicJukeboxMusicianModel);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	

    }