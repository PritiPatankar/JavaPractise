package JDBC_Movies;

public class MoviesBean {
    private int MovieID;
    private String MovieName;
    private int movieReleasedYear;

    public void setMovieID(int MovieID){
        this.MovieID = MovieID;
    }
    public int getMovieID(){
        return MovieID;
    }
    public void setMovieName(String MovieName){
        this.MovieName = MovieName;
    }
    public String getMovieName(){
        return MovieName;
    }
    public void setmovieReleasedYear(int movieReleasedYear){
        this.movieReleasedYear = movieReleasedYear;
    }
    public int getmovieReleasedYear(){
        return movieReleasedYear;
    }
}
