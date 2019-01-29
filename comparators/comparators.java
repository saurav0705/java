
import java.util.*;
import java.io.*;

class test implements Comparable<test> {
    private int number;
    private String name;
    private int weight;

    test(int n, String s, int w) {
        number = n;
        name = s;
        weight = w;
    }

    public int compareTo(test t2) {
        if (this.weight == t2.weight) {
            if ((this.name).compareTo(t2.name) == 0) {
                return this.number - t2.number;
            } else {
                return (this.name).compareTo(t2.name);
            }
        } else {
            return this.weight - t2.weight;
        }
    }

    public String getName() {
        return name;
    }

    public int getnumber() {
        return number;
    }

    public int getweight() {
        return weight;
    }
}

class newtest {
    public static void main(String[] args) {
        ArrayList<test> al = new ArrayList<test>(9);
        al.add(new test(1, "saurav", 85));
        al.add(new test(2, "sawan", 75));
        al.add(new test(1, "shivam", 95));
        al.add(new test(4, "shivam", 100));
        al.add(new test(1, "shivamraj", 100));
        Collections.sort(al);
        // System.out.println(al);
        System.out.println("Movies after sorting : ");
        for (test movie : al) {
            System.out.println(movie.getName() + " " + movie.getnumber() + " " + movie.getweight());
        }
    }
}

/*
 * // A Java program to demonstrate use of Comparable import java.io.*; import
 * java.util.*;
 * 
 * // A class 'Movie' that implements Comparable class Movie implements
 * Comparable<Movie> { private double rating; private String name; private int
 * year; private int earning;
 * 
 * // Used to sort movies by year public int compareTo(Movie m) { if
 * (this.earning == m.earning) { return this.year - m.year; } else { return
 * this.earning - m.earning; } }
 * 
 * // Constructor public Movie(String nm, double rt, int yr, int ern) {
 * this.name = nm; this.rating = rt; this.year = yr; this.earning = ern; }
 * 
 * // Getter methods for accessing private data public double getRating() {
 * return rating; }
 * 
 * public String getName() { return name; }
 * 
 * public int getYear() { return year; }
 * 
 * public int geteran() { return earning; } }
 * 
 * // Driver class class Main { public static void main(String[] args) {
 * ArrayList<Movie> list = new ArrayList<Movie>(); list.add(new
 * Movie("Force Awakens", 8.3, 2015, 999)); list.add(new Movie("Star Wars", 8.7,
 * 1977, 999)); list.add(new Movie("Empire Strikes Back", 8.8, 1980, 9));
 * list.add(new Movie("Return of the Jedi", 8.4, 1983, 5));
 * 
 * Collections.sort(list);
 * 
 * System.out.println("Movies after sorting : "); for (Movie movie : list) {
 * System.out .println(movie.getName() + " " + movie.getRating() + " " +
 * movie.getYear() + " " + movie.geteran()); } } }
 */
