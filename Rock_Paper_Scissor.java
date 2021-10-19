package com.company;
import java.util.Scanner;
import java.util.Random;
  class Rock_paper_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper , 2 for Scissor ");
        int a= sc.nextInt();
         Random no= new Random();
         int computer = no.nextInt(3);
         if (a==computer){
             System.out.println("Draw");
         }
         else if (a==0&&computer==2||a==1&&computer==0||a==2&&computer==1){
             System.out.println("You Win the game");
         }
         else {
             System.out.println("you lose the game! computer Win");
         }
         if (computer==0){
             System.out.println("computer choice:rock");
         }
       else if (computer==1){
            System.out.println("computer choice:Paper");
        }
        else if(computer==2){
            System.out.println("computer choice:Scissor");
        }

    }
}
