package movies;

public class Movie {
    private String name;
    private String category;
    public short rating;
    //bonus info
    public String toString(){
        return this.name + " " + this.category + " " + rating;
    }


    //create a constructor, the constructor has the same name as the class.
    public Movie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }

    public Movie(String movieName, String movieCategory, short rating){
        this.name = movieName;
        this.category = movieCategory;
        this.rating = rating;
    }

    //Create methods to access these properties and change them (getters and setters).
    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }

    public void setMovieName(String movieName){
        this.name = movieName;
    }

    public void setMovieCategory(String movieCategory){
        this.category = movieCategory;
    }

}
