package com.learningtree.spring.boot_web_thymeleaf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRecordingJpaRepository extends JpaRepository<MusicRecording, Integer> {
	List<MusicRecording> findByCategoryOrderByArtistNameAsc(String category);
	
	List<MusicRecording> readByArtistNameAndTitleAllIgnoringCase (String artistName, String Title);
	
	List<MusicRecording> getByArtistNameStartingWith (String prefix);
	
	List<MusicRecording> queryTop5ByArtistNameStartingWith (String prefix);
	
	boolean existsRecordingByStockCountBetween (int min, int max);
	
	int countRecordingsByStockCountBetween (int min, int max);
	
	MusicRecording findFirstRecordingByStockCountBetween (int min, int max);
	
	double countByPriceGreaterThan (double price);
	
	List<MusicRecording> findFirst10ByPriceGreaterThan (double price);
}