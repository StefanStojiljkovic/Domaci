package d13_01_2022;

public class FaceBookPost1 {
	
	
	private String profileFrom;
	private String profileTo;
	private String post;
	private int likes;
	private int shares;
	
	
	public FaceBookPost1 (int likes, int shares) {
		this.likes = likes;
		this.shares = shares;
	}
	public FaceBookPost1 (String profileFrom, String profileTo, String post, int likes, int shares) {
		this.profileFrom = profileFrom;
		this.profileTo = profileTo;
		this.post = post;
		this.likes = likes;
		this.shares = shares;
	}
	public String getProfileFrom() {
		return this.profileFrom;
	}
	public void setProfileFrom(String profil) {
		this.profileFrom = profil;
	}
	public String getProfileTo(String profil) {
		return this.profileTo;
	}
	public void setProfileTo(String profil) {
		this.profileTo = profil;
	}
	public String getPost() {
		return this.post;
	}
	public void setPost(String tekst) {
		this.post = tekst;
	}
	public int getLikes() {
		return this.likes;
	}
	public int getShares() {
		return this.shares;
	}
	public void like() {
		this.likes = this.likes + 1;
	}
	public void dislike() {
		if( this.likes - 1 >= 0) {
			this.likes = this.likes - 1;
		}
	}
	public void share() {
		this.shares = this.shares + 1;
	}
	public void print() {
		System.out.println(this.profileFrom + " >>> " + this.profileTo);
		System.out.println(this.post);
		System.out.println("Likes " + this.likes + " | " + "Shares " + this.shares);
	}

		
	}


