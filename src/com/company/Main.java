package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table[][] = new int[3][3];
        int a;
        int b;
        boolean turn = true;
        //String status = Game over!;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (isValid(a, b)) {
                if (turn) {
                    table[a][b] = 1;
                } else {
                    table[a][b] = 2;
                }
                turn = !turn;
            }

            showTable(table);

            int cod = checkGameState(table);

            if(cod==3)
            {
                System.out.println("r");
                break;
            }
            else
                if(cod==1)
                {
                    System.out.println("a castigat x");
                    break;
                }
                else
                    if(cod==2)
                    {
                        System.out.println("a castigat  y");
                        break;
                    }


        }

    }

    //pasul 2
    public static boolean isValid(int a, int b) {


        if (a >= 0 && a <= 2 && b >= 0 && b <= 2)
            return true;
        else
            return false;
    }

    //pasul 3
    public static void showTable(int[][] table) {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    public static int checkGameState(int table[][]) {
        if (((table[0][0] == 1) && (table[0][1] == 1) && (table[0][2] == 1)) ||
                ((table[1][0] == 1) && (table[1][1] == 1) && (table[1][2] == 1)) ||
                ((table[2][0] == 1) && (table[2][1] == 1) && (table[2][2] == 1)) ||
                ((table[0][0] == 1) && (table[1][0] == 1) && (table[2][0] == 1)) ||
                ((table[0][1] == 1) && (table[1][1] == 1) && (table[2][1] == 1)) ||
                ((table[0][2] == 1) && (table[1][2] == 1) && (table[2][2] == 1)))

        {
            return 1;

        } else {
            if (((table[0][1] == 2) && (table[0][2] == 2) && (table[0][0] == 2)) ||
                    ((table[1][0] == 2) && (table[1][1] == 2) && (table[1][2] == 2)) ||
                    ((table[2][0] == 2) && (table[2][1] == 2) && (table[2][2] == 2)) ||
                    ((table[0][0] == 2) && (table[1][0] == 2) && (table[2][0] == 2)) ||
                    ((table[0][1] == 2) && (table[1][1] == 2) && (table[2][1] == 2)) ||
                    ((table[0][2] == 2) && (table[1][2] == 2) && (table[2][2] == 2))) {
                return 2;
            } else {


                if (((table[0][2] == 0) || (table[0][1] == 0) || (table[0][0] == 1)) ||
                        ((table[1][0] == 0) || (table[1][1] == 0) || (table[1][2] == 0)) ||
                        ((table[2][0] == 0) || (table[2][1] == 0) || (table[2][2] == 0)) ||
                        ((table[0][0] == 0) || (table[1][0] == 0) || (table[2][0] == 0)) ||
                        ((table[0][1] == 0) || (table[1][1] == 0) || (table[2][1] == 0)) ||
                        ((table[0][2] == 0) || (table[1][2] == 0) || (table[2][2] == 0))) {

                    return 0;

               }
            }
        }
        return 3;
    }
}





//nu am facut nici o modificare