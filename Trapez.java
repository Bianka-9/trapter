/*
* File: Trapez.java
* Author: Nagy Bianka
* Copyright: 2025, Nagy Bianka
* Group: Szoft 1/N
* Date: 2025.02.24
* Github: https://github.com/Bianka-9
* Licenc: MIT
*/


import java.util.Scanner;



public class Trapez{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nagy Bianka\nTrapéz terület:");

        System.out.println("a oldal: ");
        double a = sc.nextDouble();

        System.out.println("b oldal: ");
        double b = sc.nextDouble();

        System.out.println("c oldal: ");
        double c = sc.nextDouble();

        System.out.println("d oldal: ");
        double d = sc.nextDouble();

        double oldalak = (a+b+c+d)/2;
        double terulet = Math.sqrt((oldalak-a)*(oldalak-b)*(oldalak-c)*(oldalak-d));

        System.out.println("A megadott oldalak alapján a trapézod területe: " + terulet);


    }





    }


