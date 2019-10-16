package com.company;

import Domain.Movie;
import Repository.MovieRepository;
import Service.MovieService;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
	// write your code here
        Movie m1 = new Movie("1","test1", 10);
        Movie m2 = new Movie("1","test2", 10);
        Movie m3 = new Movie("1","test3", 10);

        MovieRepository mr = new MovieRepository();

        MovieService movieService=new MovieService ( mr );
        movieService.addOrUpdate ( m1.getId (), m1.getName (), m1.getPrice () );
        movieService.addOrUpdate ( m2.getId (), m2.getName (), m2.getPrice () );
        movieService.addOrUpdate ( m3.getId (), m3.getName (), m3.getPrice () );

        scanner = new Scanner (System.in);
        while (true) {
            int command;
            try {
                command = scanner.nextInt();
            } catch(Exception e) {
                System.out.println("Exit!");
                return;
            }
            switch (command) {
                case 1: //add movie
                 break;
                case 2: //delete movie
                    break;
                case 3: // get all movies
                    break;

            }
        }

    }

}
