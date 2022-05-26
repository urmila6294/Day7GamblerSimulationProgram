package com.bridgelabz.gambler;

public class Gambler {
    int betPrice = 0;
    int numberOfPlay = 0;
    int goal = 0;
    int stack = 100;


    public static void main(String[] args) {

        System.out.println("Gambler simulation program");
        winOrLoss();
        System.out.println(winOrLoss());


    }

    public static boolean winOrLoss(){
        if(Math.random()<0.5)
                return true;
         else
                return false;

        }


    /*public void playGame(){
        numberOfPlay++;
        if(winOrloss())
            stack+=betPrice;
        else
            stack-=betPrice;
        if(stack<=0 || stack>=goal)
            return;
        else
            playGame();
    }*/
}
