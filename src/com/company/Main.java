
//H6 van het boek.

package com.company;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Array initialiseren, met en zonder waardes
        int[] x = {1, 2, 3, 1, 5, 1, 7, 8};
        int[] y = new int[5];

        //2-d array initialiseren, met en zonder waardes
        int[][] y1 = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 0, 1}
        };
        int[][] y2 = new int[2][5];


//         6.3.1 Filling, hoe je een array met waardes vult. De elementen dus.
//        for (int i = 0; i < x.length; i++) {
//            x[i] = i * i;
//        }

//         6.3.2 Methode om totaal(Sum) en gemiddelde(Avg) uit te rekenen.
//        int total = 0;
//        int avg = 0;
//        for (int j : x) {
//            total = total + j;
//        }
//        if (x.length > 0) {
//            avg = total / x.length;
//        }
//

//        6.3.3 Methode om Max en Min waarde(element) uit een array te halen.
//        int Max = x[0];
//        for (int i = 1; i < x.length; i++) {
//            if (x[i] > Max) {
//                Max = x[i];
//            }
//        }

//        6.3.4 Methode om de elementen in een array te scheiden met een '|' of ',' .
//        for (int i = 0; i < x.length; i++){
//            if (i > 0) {
//                System.out.println("|");
//            }
//            System.out.println(x[i]);
//        }
//        Of je kan ook simpelweg de functie hieronder gebruiken.
//        System.out.println(Arrays.toString(x));

//      6.3.5 Methode om Linair te zoeken. Flipt door alle elementen totdat de gewenste waarde is gevonden.
        int searchValue = 5;
        int pos = 0;
//        boolean found = false;
//        while (pos < x.length && !found) {
//            if (x[pos] == searchValue) {
//                found = true;
//            } else {
//                pos++;
//            }
//        }

//      6.1.3/ 6.3.10 Een array vullen met input.
        int currentSize = 0;
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextDouble() && currentSize < x.length -1) {
//            if (currentSize >= x.length){
//                x = Arrays.copyOf(x, 2 * x.length);     //array lengte verdubbelen
//            }
//                x[currentSize] = in.nextInt();
//                currentSize++;
//        } System.out.println(Arrays.toString(x));

//       6.3.6 Een element uit een array verwijderen.
//
//        x[pos] = x[currentSize] -1;
//        currentSize--;
//
//        for (int i = pos +1; i < currentSize; i++) {
//            x[i -1] = x[i];
//        }
//        currentSize--;

//       6.3.7 Een element in een array invoegen.
        int newElement = 15;
//        if (currentSize < x.length) {
//            currentSize++;
//            x[currentSize -1] = newElement;
//        }
//        System.out.println(Arrays.toString(x));

//      Op een gegeven positie het element invoeren.
//        if (currentSize < x.length) {
//            currentSize++;
//            for (int i = currentSize -1; i > pos; i--) {
//                x[i] = x[i -1];
//            }
//            x[pos] = newElement;
//            System.out.println(Arrays.toString(x));
//        }

//       6.3.8 Swapping Elements. Swapped de elementen zonder deze te vervangen.
//        int j= 3;
//        for (int i = 0; i < x.length; i++) {
//            int temp = x[i];
//            x[i] = x[j];
//            x[j] = temp;
//            System.out.println(Arrays.toString(x));
//        }

//        6.3.9 Copying Arrays copieert de waardes uit een array in een andere array.
////        1. Je zegt xCopy is precies wat x is.
//        int[] xCopy = x;
////        2. Je maakt een kopie van x die niet veranderd als x veranderd.
//        int[] xCopy = Arrays.copyOf(x, x.length);
////        3. Als je out of space voor je array bent kan je de space verdubellen met;
//        int[] xCopy = Arrays.copyOf(x, 2 * x.length);

//        14/02/2018

//        P6.6 Compute the alternating sum of elements in an array.
//        int total = 0;
//        for (int i = 0; i <= 7; i++) {
//            if (i % 2 == 0) {
//                total = total + x[i];
//            } else {
//                total = total - x[i];
//            }
//        } System.out.println(total);

//        P6.7 Write a method that reverses the sequence of elements in an array.
//        int j= 7;
//        for (int i = 0; i <= 3; i++) {
//            int temp = x[i];
//            x[i] = x[j];
//            x[j] = temp;
//            j--;
//        } System.out.println(Arrays.toString(x));

//        Een meer handige manier om dit te doen is;
//        int i = 0;
//        int j = x.length -1;
//        while ( i < j ) {
//            int temp = x[i];
//            x[i] = x[j];
//            x[j] = temp;
//            i++;
//            j--;
//        } System.out.println(Arrays.toString(x));

//        R 6.29 Develop an algorithm for finding the most occurring value in an array.
        int k = 0;
        int b = 0;
        int temp = 0;
        for (int i = 0; i <= 7; i++) {
              for (int j = i + 1; j <= 7; j++) {
                  if (x[i] == x[j] && x[i] == temp){
                      x[i] = temp;
                      k++;
                      System.out.println("The value :" + x[i] + " , occurred " + k + " times." );
                  }
                  // else methode als een andere waarde ook dubbel voorkomt.
              }
          }

//      6.7.2 Accesing Elements in a 2-D array.
        int countries = 7;
        int medals = 3;
        int[][] xx = new int[countries][medals];

//        Of de waardes gelijk declareren.
        int[][] yy = {
            {1, 0, 1},
            {1, 1, 0},
            {0, 0, 1}
        };


        xx[3][0] = 15;
        xx[3][2] = 15;
        xx[3][1] = 15;
        xx[6][1] = 45;
        xx[0][1] = 10;
        xx[1][1] = 10;
        int medalcount = xx[3][1];
//        System.out.println(medalcount);
//
        for (int i = 0; i < countries; i++) {
            for (int j = 0; j < medals; j++) {
                System.out.printf("%8d", xx[i][j]);
            }
            System.out.println();
        }

//        6.7.3 Locating Neighboring Elements.
//        int total = 0;
//        if (yy[1][1] == 1){
//            total = total + yy[1][0];
//        }
//        System.out.println(total);

//        Alternatief
//        if (i > 0) { total = total + yy[i-1][j]; }
//        if ( i < Rows -1) { total = total + yy[i +1][j]; }

//        6.7.4 Computing Row and Column totals.
        int totalj = 0;
//        for (int j = 0; j < medals; j++){
//            totalj = totalj + xx[3][j];
//        }
//        System.out.println(totalj);

        int Max = xx[0][0];
        int totali = 0;
        for (int i = 0; i < countries; i++) {
            totali = totali + xx[i][1];
            if (xx[i][1] > Max) {
                Max = xx[i][1];
            }
        }
        System.out.println(Max);

//        P6.18 Magic squares. A 4x4 matrix that outputs the sum of 34 on each row and column.
        int[][] magic = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

//        int totalj = 0;
//        int totali = 0;
//        for (int j = 0; j < magic[0].length; j++){
//            totalj = totalj + magic [0][j];
//
//            for (int i = 0; i < magic.length; i++) {
//            totali = totali + magic[i][0];
//        }
//        }
//        System.out.println(totalj);

//      P6.21 Print an amount of X's by the number of the input.
        String Ax = "x-";
        String result = " ";
        int i = 0;
        int j = 0;
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> Input = new ArrayList<Integer>(5);
        ArrayList<String> Output = new ArrayList<String>();

        while (in.hasNextInt() && Input.size() < 5) {
            Input.add(in.nextInt());
           while ( i < Input.get(j)) {
                i++;
                result += Ax;
               System.out.println(result);
            }
            Output.add(result);
            i = 0;
            result = "";
            j++;
        }
        System.out.println(Input);
        System.out.println(result);
        System.out.println(Output);








//        6.8.6 Finding largest nr in Array List.
//        double largest = x[0];
//        for (int i = 1; i < x.length; i++) {
//            if (x[i] > largest) {
//                largest = x[i];
//            }
//        }

//        6.8.7 Storing input values in an Array List.
//        while {in.hasNextDouble()) {
//            x.add(in.nextDouble());
//        }

//        6.8.8 Removing a wanted Value.
//            int i = 0;
//            while (i < x.size()) {
//                String word = x.get(i);
//                if (word.length() < 4) {
//                    words.remove(i);
//                } else {
//                    i++;
//                }
//            }


        // voor een rare 'Binary Search' split je shit doormidden
//        boolean found = false;
//        int low = 0;
//        int high = values.length - 1;
//        int pos = 0;
//
//        while (low <= high && !found){
//            pos = (low + high) /2;
//            if (values[pos] == searchedNumber) {
//                found = true;
//            } else if (values[pos] < searchedNumber) {
//                low = pos + 1;
//            }
//            else {
//                high = pos -1;
//            }
//            if (found) {
//                System.out.println("Found at position " + pos);
//            } else {
//                System.out.println("Not found. Insert before position " + pos);
//            }
//        }








    }
}

