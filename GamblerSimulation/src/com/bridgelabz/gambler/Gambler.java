package com.bridgelabz.gambler;


public class Gambler {
    int betPrice = 1;
    int numberOfPlay = 0;
    double goal = 200;
    double stack = 100;
    int numberOfWins = 0;
    int numberOfLoss = 0;


    public static void main(String[] args) {

        System.out.println("Gambler simulation program");
        winOrLoss();
        System.out.println(winOrLoss());
        Gambler gambler = new Gambler();
        gambler.playGame();
        gambler.printResult();
    }

    public static boolean winOrLoss() {
        if (Math.random() < 0.5)
            return true;
        else
            return false;

    }

    public void playGame() {
        for (int i = 0; i <= 20; i++) {
            numberOfPlay++;
            if (winOrLoss()) {
                stack += betPrice;
                stack = stack/2;
                numberOfWins++;
            } else {
                stack -= betPrice;
                stack = stack/2;
                numberOfLoss++;
            }

            if (stack <= 0 || stack >= goal)
                return;
            else
                playGame();
        }
        }
        public void printResult () {
            System.out.println("Number of time Game play is:" + numberOfPlay);
            System.out.println("Stack is:" + stack);
            System.out.println("Goal is:" + goal);
            System.out.println("Number of wins:" + numberOfWins);
            System.out.println("Number of Loss:" + numberOfLoss);
            System.out.println("Bet price:" + betPrice);
        }
    }



