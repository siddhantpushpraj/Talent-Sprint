/*import java.text.DecimalFormat;

class Batsman {

	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	private int id;
	private static int idGenerator=100000;
	public Batsman() {
		this.id =++idGenerator;
	}

	public Batsman(String name, int runsScored, int centuries,
			int halfCenturies, int ballsFaced, int fours, int sixes) {
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
		this.id =++idGenerator;
	}

	public float getStrikeRate() {
		return (runsScored * 100) / ballsFaced;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
	}

	public int getRunsScoredInBoundaries() {
		return (this.fours * 4) + (this.sixes * 6);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

}

public class COJ_01_03_Batsman {

	public static void main(String[] args) {

		Batsman batsman1 = new Batsman();
		batsman1.setName("Virak Kohli");
		batsman1.setRunsScored(973);
		batsman1.setCenturies(4);
		batsman1.setHalfCenturies(7);
		batsman1.setBallsFaced(640);
		batsman1.setFours(83);
		batsman1.setSixes(38);

		System.out.println("ID : " + batsman1.getId());
		System.out.println("Name : " + batsman1.getName());
		System.out.println("Runs Scored : " + batsman1.getRunsScored());
		System.out.println("Balls Faced : " + batsman1.getBallsFaced());
		System.out.println("Centuries : " + batsman1.getCenturies());
		System.out.println("Half Centuries : " + batsman1.getHalfCenturies());
		System.out.println("Fours : " + batsman1.getFours());
		System.out.println("Sixes : " + batsman1.getSixes());
		System.out.println("Strike Rate : " + batsman1.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : "
				+ batsman1.getRunsScoredInBoundaries());

		Batsman batsman2 = new Batsman("AB de Villers", 687, 1, 6, 407, 57, 37);
		System.out.println("ID : " + batsman2.getId());
		System.out.println("Name : " + batsman2.getName());
		System.out.println("Runs Scored : " + batsman2.getRunsScored());
		System.out.println("Balls Faced : " + batsman2.getBallsFaced());
		System.out.println("Centuries : " + batsman2.getCenturies());
		System.out.println("Half Centuries : " + batsman2.getHalfCenturies());
		System.out.println("Fours : " + batsman2.getFours());
		System.out.println("Sixes : " + batsman2.getSixes());
		System.out.println("Strike Rate : " + batsman2.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : "+ batsman2.getRunsScoredInBoundaries());

	}

}
*/
