class Movie {
    String movie_name, language, genere, rating;

    public Movie(String movie_name, String language, String genere, String rating) {
        this.movie_name = movie_name;
        this.language = language;
        this.genere = genere;
        this.rating = rating;
    }

    void displayMovieInfo() {
        // System.out.println("Movie: " + movie_name);
        // System.out.println("Language: " + language);
        // System.out.println("Genre: " + genere);
        // System.out.println("Rating: " + rating);
    }

}

class NowShowing extends Movie {

    String showTime;

    public NowShowing(String movie_name, String language, String genere, String rating, String showTime) {
        super(movie_name, language, genere, rating);
        this.showTime = showTime;
    }

    void displayMovieInfo() {
        System.out.println("NowShowing");

        System.out.println("Movies in Theatre ");
        System.out.println("------------------------");
        System.out.println("Movie: " + movie_name);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genere);
        System.out.println("Rating: " + rating);
        System.out.println("Show Time: " + showTime);
    }

}

class ComingSoon extends Movie {
    String releaseDate;

    public ComingSoon(String movie_name, String language, String genere, String rating, String releaseDate) {
        super(movie_name, language, genere, rating);
        this.releaseDate = releaseDate;
    }

    void displayMovieInfo() {
        System.out.println("ComingSoon ");
        System.out.println("Upcoming Movies ");
        System.out.println("------------------------");
        System.out.println("Movie: " + movie_name);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genere);
        System.out.println("Rating: " + rating);
        System.out.println("Release Date: " + releaseDate);

    }
}

public class Requirement1 {

    public static void main(String[] args) {
        NowShowing n = new NowShowing("KGF", "Kannada", "Action", " 4.9/5 ", " 10:00AM ");
        n.displayMovieInfo();
        System.out.println();
        ComingSoon m = new ComingSoon("Fantasic4", "English", "Action", "NA", "25-July-2025");
        m.displayMovieInfo();
    }
}