package com.company;
import java.util.Scanner;

public class Main {
public static void CtoFahrenheit( Scanner input){
        int C = input.nextInt();
        int Fahrenheit;
        Fahrenheit = (C * 9/5) +32;
    System.out.println("Hasilnya adalah: "+Fahrenheit);
    }
    public static void CtoKelvin( Scanner input){
        int C = input.nextInt();
        double kelvin;

        kelvin = C + 273.15;
        System.out.println("Hasilnya adalah: "+kelvin);
    }
    public static void CtoReamur( Scanner input){
        int C = input.nextInt();
        double reamur;
        reamur = C * 0.8;
        System.out.println("Hasilnya adalah: "+reamur);
    }
    public static void main(String[] args) {
	// 2.	Buat program konversi suhu 78o C ke dalam satuan Reamur, Farenheit dan Kelvin
    // Source : http://www.cs.utsa.edu/~cs1063/lectures/Scanner.html


        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Celcius yang Akan di Ubah ke Fahrenheit: ");
        CtoFahrenheit(input);
        System.out.print("Masukan Celcius yang Akan di Ubah ke Kelvin: ");
        CtoKelvin(input);
        System.out.print("Masukan Celcius yang Akan di Ubah ke Reamur: ");
        CtoReamur(input);
    }
}
