package review;

public class Performance extends Culture {
	
	String genreP;
	
	public Performance() {
		
	}
	
	public Performance(String cTitle, int directorNo, int actorNo) {
		super(cTitle, directorNo, actorNo);
	}
	
	public void getInformation() {
		System.out.println("제목: "+getcTitle());
		System.out.println("감독: "+getDirectorNo());
		System.out.println("배우: "+getActorNo());
		System.out.println("총점: "+getScore());
		System.out.println("평점: "+getGrade());
	}
}
