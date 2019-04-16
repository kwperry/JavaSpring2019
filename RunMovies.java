
public class RunMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie deadRising = new Movie("Dead Rising", Movie.MPAARating.PG13);
		deadRising.rateMovie(1);
		deadRising.rateMovie(1);
		deadRising.rateMovie(1);
		deadRising.rateMovie(1);
		deadRising.rateMovie(2);
		deadRising.rateMovie(-3);
	
		System.out.println(deadRising.getName() + " " + deadRising.getRating() + " has an average"
				+ " rating of " + deadRising.calcAverageRating() + " stars");
		
		Movie khumba = new Movie("Khumba", Movie.MPAARating.G);
		khumba.rateMovie(2);
		khumba.rateMovie(2);
		khumba.rateMovie(2);
		khumba.rateMovie(2);
		khumba.rateMovie(2);
		khumba.rateMovie(3);
		khumba.rateMovie(2);
		khumba.rateMovie(2);
		khumba.rateMovie(1);
		khumba.rateMovie(5);
		System.out.println(khumba.getName() + " " + khumba.getRating() + " has an average"
				+ " rating of " + khumba.calcAverageRating() + " stars");
	}
}
