
public class Movie {
	private String name;
	
	//an enum of all the MPAA ratings
	public enum MPAARating
	{
		G,PG, PG13, R
	};
	
	//counter for the total number
	//of stars for each number of stars
	private int oneStar;
	private int twoStar;
	private int threeStar;
	private int fourStar;
	private int fiveStar;
	
	private MPAARating rating;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public MPAARating getRating() {
		return rating;
	}


	public void setRating(MPAARating rating) {
		this.rating = rating;
	}
	
	
	//increments the star counter based on which number was input
	//only works with 1-5
	public void rateMovie(int num)
	{
		switch(num)
		{
		case 1:
			this.oneStar++;
			break;
		case 2:
			this.twoStar++;
			break;
		case 3:
			this.threeStar++;
			break;
		case 4:
			this.fourStar++;
			break;
		case 5:
			this.fiveStar++;
			break;
		default:
			System.out.println("Number is out of range. Must be between 1 & 5 inclusive");
			break;
		}
	}

	//constructs the movie with the movie name
	//sets the counter for each star to 0
	Movie(String movieName, MPAARating MovieRating)
	{

		this.setName(movieName);
		this.setRating(MovieRating);
		this.fiveStar = 0;
		this.fourStar = 0;
		this.threeStar = 0;
		this.twoStar = 0;
		this.oneStar = 0;
	}

	//calculates the weighted average of the stars. 
	public float calcAverageRating()
	{
		int totalRatings = fiveStar + fourStar + threeStar + twoStar + oneStar;
		float result = (5*fiveStar) + (4*fourStar) + (3*threeStar) + (2*twoStar) + (1*oneStar);
		return result/totalRatings;
	}






}
