package review;

public abstract class Culture {
	
	protected String cTitle;
	protected int directorNo;
	protected int actorNo;
	protected int audienceNo = 0;
	protected int score = 0;
	
	public Culture() {
		
	}
	
	public Culture(String cTitle, int directorNo, int actorNo) {
		this.cTitle = cTitle;
		this.directorNo = directorNo;
		this.actorNo = actorNo;
	}
	
	public void setTotalScore(int score) {
		this.score += score;
		audienceNo++;
	}
	
	public String getGrade() {
		String grade = null;
		double starScore = (double)score/audienceNo;
		if(starScore<1.5) {
			grade = "☆";
		} else if(starScore>=1.5 && starScore<2.5) {
			grade = "☆☆";
		} else if(starScore>=2.5 && starScore<3.5) {
			grade = "☆☆☆";
		} else if(starScore>=3.5 && starScore<4.5) {
			grade = "☆☆☆☆";
		} else if(starScore>=4.5) {
			grade = "☆☆☆☆☆";
		}
		return grade;
	}
	
	public String getcTitle() {
		return cTitle;
	}

	public int getDirectorNo() {
		return directorNo;
	}

	public int getActorNo() {
		return actorNo;
	}

	public int getAudienceNo() {
		return audienceNo;
	}

	public int getScore() {
		return score;
	}

	public abstract void getInformation();
}
