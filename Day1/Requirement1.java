
class Movie {
    String movie_name, language, genere, rating;

    public Movie(String movie_name, String language, String genere, String rating) {
        this.movie_name = movie_name;
        this.language = language;
        this.genere = genere;
        this.rating = rating;
    }

    void displayMovieInfo() {
        System.out.println("Movie: " + movie_name);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genere);
        System.out.println("Rating: " + rating);
    }

}

public class Requirement1 {

    public static void main(String[] args) {
        Movie m = new Movie("KGF", "Kannada", "Action", "4.9/5");
        m.displayMovieInfo();

    }
}