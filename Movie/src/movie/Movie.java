/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

/**
 *
 * @author Jonas Elias
 */
public class Movie {
    
    private String nameMovie, gender, director;
    
    private int yearLaunch;
    
    private double duration;
    
    Movie() {
        
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearLaunch() {
        return yearLaunch;
    }

    public void setYearLaunch(int yearLaunch) {
        if (this.verifyIntegrityYear(yearLaunch)) {
            this.yearLaunch = yearLaunch;
        } else {
            this.yearLaunch = 2022;
        }
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (this.verifyIntegrityDuration(duration)) {
            this.duration = duration;
        } else {
            this.duration = 60;
        }
    }
    
    public String toString(Movie mov) {
        MethodToString mts = new MethodToString();
        return mts.toString(mov);
    }
    
    boolean verifyIntegrityYear(int year) {
        return year > 0;
    }
    
    boolean verifyIntegrityDuration(double duration) {
        return duration > 0;
    }
}
