package movies;

public class Movie {
    private String name;
    private String category;

    //create a constructor, the constructor has the same name as the class.
    public Movie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }

    //Create methods to access these properties and change them (getters and setters).
    public String getMovieInfo(String name){
        return "name: " + name;
    }

    public String getMovieInfo(String name, String category){
        return "name: " + name + "category: " + category;
    }

    public void setMovieInfo(String movieName){
        this.name = movieName;
    }

    public void setMovieInfo(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }




}
