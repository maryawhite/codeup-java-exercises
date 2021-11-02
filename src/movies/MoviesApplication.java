package movies;

import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] library = MoviesArray.findAll();   //library is my own array of movies
//        for(Movie movie : library){
//            System.out.println(movie.getMovieName());
//        }

//        Movie[] searchResult = new Movie[0];    //this is a new Movie array called searchResult
//        for(Movie movie : library){
//            if(movie.getMovieCategory().equalsIgnoreCase("drama")){
//               searchResult= Arrays.copyOf(searchResult, searchResult.length + 1);
//               searchResult[searchResult.length - 1] = movie;
//            }
//        }
//        for(Movie movie : searchResult){
//                System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
//            }

        Input input = new Input();              //import my input class that I created last week
        Scanner scanner = new Scanner(System.in);

        Movie varmovie = new Movie("Shrek", "comedy", (short) 5);  //a literal number in java is by default a double
        System.out.println("varmovie = " + varmovie);

        String userReply;
        OUTER:
        do {
            System.out.println("What would you like to do?");
            System.out.println(" 0 - exit\n 1 - view all movies\n 2 - view movies in the animated category\n 3 - view movies in the drama category\n 4 - view movies in the horror category\n 5 - view movies in the scifi category\n 6 - view movies in the musical category\n");
            System.out.print("Enter your choice: ");
            int userChoice = input.getInt();
            System.out.println("You selected # " + userChoice);
            for (Movie movie : library) {
                if (userChoice == 1) {
//                    System.out.println("\t" + movie.getMovieName() + " - " + movie.getMovieCategory());
                    System.out.println(movie);
                }
                if (userChoice == 2) {
                    //show movies in the category of animated
                    if (movie.getMovieCategory().equalsIgnoreCase("animated")) {
                        System.out.println("\t" + movie.getMovieName() + "--" + movie.getMovieCategory());
                    }
                }
                if (userChoice == 3) {
                    if (movie.getMovieCategory().equalsIgnoreCase("drama")) {
                        System.out.println("\t" + movie.getMovieName() + "--" + movie.getMovieCategory());
                    }
                }
                if (userChoice == 4) {
                    if (movie.getMovieCategory().equalsIgnoreCase("horror")) {
                        System.out.println("\t" + movie.getMovieName() + "--" + movie.getMovieCategory());
                    }
                }
                if (userChoice == 5) {
                    if (movie.getMovieCategory().equalsIgnoreCase("scifi")) {
                        System.out.println("\t" + movie.getMovieName() + "--" + movie.getMovieCategory());
                    }
                }
                if (userChoice == 6) {
                    if (movie.getMovieCategory().equalsIgnoreCase("musical")) {
                        System.out.println("\t" + movie.getMovieName() + "--" + movie.getMovieCategory());
                    }
                }
                if (userChoice == 0) {
                    System.out.println("###########");
                    System.out.println("# Goodbye #");
                    System.out.println("###########");
                    break OUTER;
                }
            }
            System.out.println("Would you like to make another selection? Y for yes, N to exit");
            userReply = scanner.nextLine();
        }while(userReply.equalsIgnoreCase("Y"));

    }

}
