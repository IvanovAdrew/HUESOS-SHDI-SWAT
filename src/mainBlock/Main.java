package mainBlock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        //I use static massive because I don't need more lines
        int numberOfLines = -1;
        System.out.println("write how many lines you need");
        while (b) {
            try {
                    numberOfLines = Integer.parseInt(sc.nextLine());
                    break;

            }catch (NumberFormatException e) {
                System.out.println("please write a number");
            }
        }

        if (numberOfLines >0) {
            String[] arrayOfMyStrings = new String[numberOfLines];
            System.out.println("please write " + numberOfLines + " number of lines, but it must not more than 20 symbols");
            for (int i = 1; i <= numberOfLines; i++) {
                while(b) {
                    try {

                        arrayOfMyStrings[i] = sc.nextLine();
                        if (arrayOfMyStrings[i].length() > 20) {
                            throw new StringTooLongException();
                        } else {
                            break;
                        }
                    } catch (StringTooLongException e) {
                        System.out.println("it's more than 20 symbols!");
                    }
                }
            }
        }
        System.out.println("I'm here");
    }
}
