package hw16;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to know your compatibility with other sings?");
            String answer = c.nextLine();
            if (answer.equals("yes") || answer.equals("Yes")) {
                System.out.println("Enter your name, please");
                String name = c.nextLine();
                System.out.println("Hi, " + name + "! " + "Enter your birth date");
                System.out.println("P.S.: use space!");
                int day = c.nextInt();
                int month = c.nextInt();
                int year = c.nextInt();
                Date date = new Date(day, month, year);
                String zodiac = "";
                if ((month == 1) && (day <= 20) || (month == 12) && (day >= 23)) {
                    zodiac = "Capricorn";
                } else ;
                if ((month == 1) && (day >= 21) || (month == 2) && (day <= 19)) {
                    zodiac = "Aquarius";
                } else ;
                if ((month == 2) && (day >= 20) || (month == 3) && (day <= 20)) {
                    zodiac = "Pisces";
                } else ;
                if ((month == 3) && (day >= 21) || (month == 4) && (day <= 19)) {
                    zodiac = "Aries";
                } else ;
                if ((month == 4) && (day >= 21) || (month == 5) && (day <= 21)) {
                    zodiac = "Taurus";
                } else ;
                if ((month == 5) && (day >= 22) || (month == 6) && (day <= 21)) {
                    zodiac = "Gemini";
                } else ;
                if ((month == 6) && (day >= 22) || (month == 7) && (day <= 22)) {
                    zodiac = "Cancer";
                } else ;
                if ((month == 7) && (day >= 23) || (month == 8) && (day <= 21)) {
                    zodiac = "Leo";
                } else ;
                if ((month == 8) && (day >= 22) || (month == 9) && (day <= 23)) {
                    zodiac = "Virgo";
                } else ;
                if ((month == 9) && (day >= 24) || (month == 10) && (day <= 23)) {
                    zodiac = "Libra";
                } else ;
                if ((month == 10) && (day >= 24) || (month == 11) && (day <= 22)) {
                    zodiac = "Scorpio";
                } else ;
                if ((month == 11) && (day >= 23) || (month == 12) && (day <= 22)) {
                    zodiac = "Sagittarius";
                } else ;
                Account user = new Account(name, date, zodiac);
                user.printInfo();
                System.out.println("Looking for the perfect fit...");

                System.out.println("ready!");

                String compatibility = "";
                if (zodiac == "Capricorn") {
                    compatibility = "Taurus, Virgo, Scorpio, Aquarius";
                } else ;
                if (zodiac == "Aquarius") {
                    compatibility = "Aries, Gemini, Libra, Pisces";
                } else ;
                if (zodiac == "Pisces") {
                    compatibility = "Cancer, Scorpio, Aquarius";
                } else ;
                if (zodiac == "Aries") {
                    compatibility = "Gemini, Leo, Sagittarius, Aquarius";
                } else ;
                if (zodiac == "Taurus") {
                    compatibility = "Cancer, Virgo, Capricorn";
                } else ;
                if (zodiac == "Gemini") {
                    compatibility = "Aries, Leo, Sagittarius, Aquarius";
                } else ;
                if (zodiac == "Cancer") {
                    compatibility = "Taurus, Virgo, Scorpio, Pisces";
                } else ;
                if (zodiac == "Leo") {
                    compatibility = "Aries, Gemini, Libra, Sagittarius";
                } else ;
                if (zodiac == "Virgo") {
                    compatibility = "Taurus, Cancer, Libra, Capricorn";
                } else ;
                if (zodiac == "Libra") {
                    compatibility = "Gemini, Leo, Virgo, Aquarius";
                } else ;
                if (zodiac == "Scorpio") {
                    compatibility = "Cancer, Sagittarius, Capricorn, Pisces";
                } else ;
                if (zodiac == "Sagittarius") {
                    compatibility = "Aries, Leo, Libra, Aquarius";
                } else ;
                System.out.println("You have great compatibility with infinite sings: " + compatibility);
            } else if (answer.equals("no") || (answer.equals("No"))){
                System.out.println("Have a good day!");
                break;
            }
        }
        c.close();
    }
}

        



