package com.innoventes.interview.assignments.musical.jukebox.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.interview.assignments.musical.jukebox.app.model.MusicJukeboxAlbumModel;

@Repository
public interface AlbumRepository extends JpaRepository<MusicJukeboxAlbumModel, Long> {
	 Optional<MusicJukeboxAlbumModel> findOneByAlbumName(String albumName);
}







