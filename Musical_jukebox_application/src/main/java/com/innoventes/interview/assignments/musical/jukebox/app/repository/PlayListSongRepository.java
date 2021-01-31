package com.innoventes.interview.assignments.musical.jukebox.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innoventes.interview.assignments.musical.jukebox.app.model.PlayListSong;



@Transactional
@Repository
public interface PlayListSongRepository extends JpaRepository<PlayListSong, Long> {
	
	
	@Modifying
    @Query("SELECT * FROM PlayListSong p WHERE p.albumMusicianName = :albumMusicianName")
    String getByAlbumMusicianName(@Param("albumMusicianName") String albumMusicianName);

    @Modifying
    @Query("SELECT * FROM PlayListSong p WHERE p.musicianName = :musicianName")
    String getByMusicianName(@Param("musicianName") String musicianName);

    @Modifying
    @Query("SELECT * FROM PlayListSong p WHERE p.musicianName = :musicianName AND p.albumMusicianName = :albumMusicianName")
    String getByMusicianNameAndAlbumMusicianName(@Param("musicianName") String musicianName, @Param("albumMusicianName") String albumMusicianName);
	
	
	

}
