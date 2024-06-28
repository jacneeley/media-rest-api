package com.learningtree.spring.boot_web_thymeleaf;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "music_recordings")
public class MusicRecording {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MUSIC_REC")
	@SequenceGenerator(name = "SEQ_MUSIC_REC", sequenceName = "music_recordings_seq", allocationSize = 1)
	private int recordingId;
	
	private String artistName;
	private String title;
	private String category;
	private String imageName;
	private int numTracks;
	private double price;
	private int stockCount;
	
	public MusicRecording() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(artistName, category, imageName, numTracks, price, recordingId, stockCount, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicRecording other = (MusicRecording) obj;
		return Objects.equals(artistName, other.artistName) && Objects.equals(category, other.category)
				&& Objects.equals(imageName, other.imageName) && numTracks == other.numTracks
				&& Objects.equals(price, other.price) && recordingId == other.recordingId
				&& stockCount == other.stockCount && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "MusicRecording [recordingId=" + recordingId + ", artistName=" + artistName + ", title=" + title
				+ ", category=" + category + ", imageName=" + imageName + ", numTracks=" + numTracks + ", price="
				+ price + ", stockCount=" + stockCount + "]";
	}

	public int getRecordingId() {
		return recordingId;
	}

	public void setRecordingId(int recordingId) {
		this.recordingId = recordingId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getNumTracks() {
		return numTracks;
	}

	public void setNumTracks(int numTracks) {
		this.numTracks = numTracks;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
}
