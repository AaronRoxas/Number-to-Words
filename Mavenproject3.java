package com.mycompany.mavenproject3;
import javax.swing.JOptionPane;
public class Mavenproject3 
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number [0-9999]"));
        //Variables
        String display = "";
        int thou = num/1000;
        int r = num % 1000;
        int hun = r/100;
        int r2 = r%100;
        int tens = r2/10;
        int ones = r2%10;
        
        if (num == 0)
            JOptionPane.showMessageDialog(null , "Zero");
        //Thousands
        switch(thou)
        {
            case 9:
                display = "Nine thousand";
                break;
            case 8:
                display = "Eight thousand";
                break;
            case 7:
                display = "Seven thousand";
                break;
            case 6:
                display = "Six thousand";
                break;
            case 5:
                display = "Five thousand";
                break;
            case 4:
                display = "Four thousand";
                break;
            case 3:
                display = "Three thousand";
                break;
            case 2:
                display = "Two thousand";
                break;
            case 1:
                display = "One thousand";
                break;
        }
        //Hundreds
        switch (hun)
        {
            case 9:
                display+=" nine hundred";
                break;
            case 8:
                display+=" eight hundred";
                break;
            case 7:
                display+=" seven hundred";
                break;
            case 6:
                display+=" six hundred";
                break;
            case 5:
                display+=" five hundred";
                break;
            case 4:
                display+=" four hundred";
                break;
            case 3:
                display+=" three hundred";
                break;
            case 2:
                display+=" two hundred";
                break;
            case 1:
                display+= " one hundred";
                break;
        }
        //Tens
         switch (tens)
        {
            case 9:
                display+=" ninety";
                break;
            case 8:
                display+=" eighty";
                break;
            case 7:
                display+=" seventy";
                break;
            case 6:
                display+=" sixty";
                break;
            case 5:
                display+=" fifty";
                break;
            case 4:
                display+=" fourty";
                break;
            case 3:
                display+=" thirty";
                break;
            case 2:
                display+=" twenty";
                break;
            case 1:
                if(r2 == 19)
                {
                    display+=" nineteen";
                }
                else if (r2 == 18)
                {
                    display+=" eighteen ";
                }
                else if (r2 == 17)
                {
                    display+=" seventeen";
                }
                else if (r2 == 16)
                {
                    display+=" sixteen";
                }
                else if (r2 == 15)
                {
                    display+=" fifteen";
                }
                else if (r2 == 14)
                {
                    display+=" fourteen";
                }
                else if (r2 == 13)
                {
                    display+=" thirteen";
                }
                else if (r2 == 12)
                {
                    display+=" twelve";
                }
                else if (r2 == 11)
                {
                    display+=" eleven";
                }
                else if (r2 == 10)
                {
                   display+=" ten";
                }
                JOptionPane.showMessageDialog(null, display);
                System.exit(0);
                break;
        }
         //Ones
         switch (ones)
         {
             case 9:
                 display+=" nine";
                 break;
             case 8:
                 display+=" eight";
                 break;
             case 7:
                 display+=" seven";
                 break;
             case 6:
                 display+=" six";
                 break;
             case 5:
                 display+=" five";
                 break;
             case 4:
                 display+=" four";
                 break;
             case 3:
                 display+=" three";
                 break;
             case 2:
                 display+=" two";
                 break;
             case 1:
                 display+=" one";
                 break;   
         }
        JOptionPane.showMessageDialog(null, display);       
        System.exit(0);
    }
}