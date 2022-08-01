package com.tournee.otimisation;

import com.tournee.otimisation.algo.BranchAndBound;
import com.tournee.otimisation.inputs.Matrix;

import java.io.IOException;

public class OptimMain {
    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix();
        int[][] matriceDistances = matrix.readFile();
        matrix.afficher(matriceDistances);

        int size = matriceDistances.length;
        BranchAndBound branchAndBound = new BranchAndBound();



        /* ------------------------- ALGORITHM INITIALIZATION ----------------------- */

        // Initial variables to start the algorithm
        String path = "";
        int[] vertices = new int[size - 1];

        // Filling the initial vertices array with the proper values
        for (int i = 1; i < size; i++) {
            vertices[i - 1] = i;
        }


}
}
