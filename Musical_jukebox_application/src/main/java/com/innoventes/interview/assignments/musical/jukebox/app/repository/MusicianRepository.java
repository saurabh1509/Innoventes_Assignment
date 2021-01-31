package com.innoventes.interview.assignments.musical.jukebox.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.interview.assignments.musical.jukebox.app.model.MusicJukeboxMusicianModel;

@Repository
public interface MusicianRepository extends JpaRepository<MusicJukeboxMusicianModel, Long>{

	Optional<MusicJukeboxMusicianModel> findFirstByMusicianName(String musicianName);
}





