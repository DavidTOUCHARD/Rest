package eu.ensup.demojj.domaine;

public class Track {

	String title;
	String singer;

	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + "]";
	}

}