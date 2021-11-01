package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] library = MoviesArray.findAll();   //library is my own array of movies
//        for(Movie movie : library){
//            System.out.println(movie.getMovieName());
//        }

        Movie[] searchResult = new Movie[0];
        for(Movie movie : library){
            if(movie.getMovieCategory().equalsIgnoreCase("drama")){
               searchResult= Arrays.copyOf(searchResult, searchResult.length + 1);
               searchResult[searchResult.length - 1] = movie;
            }
        }
        System.out.println(library.length);
        System.out.println(searchResult.length);
        for(Movie movie : searchResult){
                System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
            }

        Input input = new Input();              //import my input class that I created last week
        System.out.println("What would you like to do?");
        System.out.println(" 0 - exit\n 1 - view all movies\n 2 - view movies in the animated category\n 3 - view movies in the drama category\n 4 - view movies in the horror category\n 5 - view movies in the scifi category\n");
        System.out.print("Enter your choice: ");
        int userChoice = input.getInt();
        System.out.println(userChoice);
        if(userChoice == 1){
            for(Movie movie : library){
                System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
            }
        }

    }

}
