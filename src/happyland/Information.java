package happyland;

public class Information {
	private String name;
	private int score;
	private int ticketPrice;
	private int timePlay;
	private int totalScore = 0;
	
	public Information(String aName,int aScore,int aTicketPrice,int aTimePlay){
		name = aName;
		score = aScore;
		ticketPrice = aTicketPrice;
		timePlay = aTimePlay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTimePlay() {
		return timePlay;
	}

	public void setTimePlay(int timePlay) {
		this.timePlay = timePlay;
	}
	
	public String toString(){
		String result = name;
		return result;
	}
}
