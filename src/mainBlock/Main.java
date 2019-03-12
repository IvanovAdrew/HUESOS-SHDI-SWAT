package mainBlock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        String[] arrayOfMyStrings = new String[20];//I use static massive because I don't need more lines
        int numberOfLines = -1;
        System.out.println("write how many lines you need, but not higher than 20");
        while (b) {
            try {
                try {
                    numberOfLines = Integer.parseInt(sc.nextLine());
                    if (numberOfLines>20) {
                        throw new StringTooLongException();
                    } else{
                        break;
                    }
                }catch (StringTooLongException e){
                    System.out.println("it's more than 20!");
                }

            }catch (NumberFormatException e) {
                System.out.println("please write a number");
            }
        }
        if (numberOfLines >0) {
            System.out.println("please write " + numberOfLines + " number of lines");
            for (int i = 1; i <= numberOfLines; i++) {
                arrayOfMyStrings[i] = sc.nextLine();
            }
        }
        System.out.println("I'm here");
    }
}
