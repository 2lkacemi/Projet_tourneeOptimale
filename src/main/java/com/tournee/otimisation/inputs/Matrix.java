package com.tournee.otimisation.inputs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Matrix {
    private int lengh;

    public int getLengh() {
        return lengh;
    }

    private static int[][] distances;

    public int[][] readFile() throws IOException {

        // The path to the files with the distances is asked
        Scanner input = new Scanner(System.in);
        System.out.println("Please, introduce the path where the text file is stored");
        String file = input.nextLine();

        // The size of the distance matrix is asked
        System.out.println("Please, introduce the size of the matrix");
        int size = input.nextInt();
        lengh = size;


        // Global variables are initialized considering the size of the matrix
        int numSolutions = factorial(size - 1);
        distances = new int[size][size];

        // The file in that location is opened
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);


        // Our matrix is filled with the values of the file matrix
        for (int row = 0 ; row < size ; row++) {
            // Every value of each row is read and stored
            String line = b.readLine();
            String[] values = line.trim().split("\\s+");
            for (int col = 0; col < size; col++) {
                distances[row][col] = Integer.parseInt(values[col]);
            }
        }
        // Closing file
        b.close();

        return distances;
    }

    // Factorial function used to calculate the number of solutions
    public static int factorial(int n) {
        if (n <= 1) return 1;
        else return (n * factorial(n - 1));
    }

    public void afficher(int[][] matrice){
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
