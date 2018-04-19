public class Album {
	private String albumId;
	private String id;
	private String title;
	private final String ID_LINE = "\"id\":";
	private final String TITLE_LINE = "\"title\":";
	
	public Album() {
		
	}
	
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getID_LINE() {
		return ID_LINE;
	}
	public String getTITLE_LINE() {
		return TITLE_LINE;
	}

	public String toString() {
		return "Album [albumId=" + albumId + ", id=" + id + ", title=" + title + "]";
	}
	
}
