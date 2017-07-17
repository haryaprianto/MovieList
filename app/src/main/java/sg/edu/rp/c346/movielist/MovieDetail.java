package sg.edu.rp.c346.movielist;

/**
 * Created by 16022596 on 17/7/2017.
 */

public class MovieDetail {
    private String movieName;
    private  String movieDesc;
    private String movieAuthor;
    private int movieReleaseYear;

    public MovieDetail(String movieName, String movieDesc, String movieAuthor, int movieReleaseYear ){
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.movieAuthor = movieAuthor;
        this.movieReleaseYear = movieReleaseYear;
    }


    public String getMovieName() {
        String strMovieTitleDisplay = "Title: " + movieName;
        return strMovieTitleDisplay;
    }


    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        String strMovieDescDisplay = "Desc: " + movieDesc;
        return strMovieDescDisplay;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public String getMovieAuthor() {
        String strMovieAuthorDisplay = "Author: " + movieAuthor;
        return strMovieAuthorDisplay ;
    }

    public void setMovieAuthor(String movieAuthor) {
        this.movieAuthor = movieAuthor;
    }

    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public String getMovieReleaseString(){
        String strReleaseDate = "Release Date: " + movieReleaseYear;
        return  strReleaseDate;
    }

    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    @Override
    public  String toString(){
        return "EmployeeInfoDetail{" +
                "movieName'" + movieName + '\'' + "movieDesc'" + movieDesc + "movieAuthor'" + movieAuthor + "movieReleaseYear'" + movieReleaseYear + '}';
    }
}
