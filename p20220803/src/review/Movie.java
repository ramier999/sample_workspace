package review;

public class Movie extends Culture{
	
	String genreM;
	
	public Movie() {
		
	}
	
	public Movie(String cTitle, int directorNo, int actorNo) {
		super(cTitle, directorNo, actorNo);
	}
	
	public void getInformation() {
		System.out.println("제목: "+cTitle);
		System.out.println("감독: "+directorNo);
		System.out.println("배우: "+actorNo);
		System.out.println("총점: "+score);
		System.out.println("평점: "+getGrade());
	}
}
