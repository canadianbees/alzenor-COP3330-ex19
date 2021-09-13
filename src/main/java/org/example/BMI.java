/*
 *  UCF COP3330 Fall 2021 BMI Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class BMI
{
    private int height;
    private int weight;

    //asks user for their height and weight
    public BMI()
    {
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        //runs until flag has been raised
        while(!flag)
        {
            System.out.print("Enter your height: ");
            //if user inputs a numeric value
            if(input.hasNextInt())
            {
                this.height = input.nextInt();

                //if that value is positive
                if(this.height > 0)
                {
                    //raise flag
                    flag = true;
                }

                //if its negative or 0
                else
                {
                    System.out.print("Not a valid input. Please try again!\n");
                }

            }
            else
            {
                System.out.print("Not a valid input. Please try again!\n");
            }

            input.nextLine();
        }

        //reset flag for the next question
        flag = false;
        while(!flag)
        {
            System.out.print("Enter your weight: ");
            if(input.hasNextInt())
            {
                this.weight = input.nextInt();

                //if that value is positive
                if(this.weight > 0)
                {
                    flag = true;
                }

                else
                {
                    System.out.print("Not a valid input. Please try again!\n");
                }
            }

            //if user inputted a non-numeric value
            else
            {
                System.out.print("Not a valid input. Please try again!\n");
            }

            input.nextLine();
        }
    }

    public void Calculator()
    {
        float bmi = (float) (this.weight/(Math.pow(this.height,2)) * 703);

        //rounds bmi to one decimal place
        DecimalFormat round = new DecimalFormat("###.#");
        System.out.println("Your BMI is "+round.format(bmi));

        //if bmi is within the healthy range
        if(bmi >= 18.5 && bmi <= 25)
        {
            System.out.print("You are within the ideal weight range");
        }

        //if its under
        if(bmi < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor");
        }

        //if its over
        if(bmi > 25)
        {
            System.out.println("You are overweight. You should see your doctor");
        }
    }

}
