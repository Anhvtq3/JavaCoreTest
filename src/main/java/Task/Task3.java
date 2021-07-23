package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 *
 * Write a method upperCaseString to change the first letter of each word to uppercase
 *
 * Display the result on the screen.
 *
 * Example input:
 * sam i am.
 *
 * Example output:
 * Sam I Am.
 *
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */
public class Task3 {
    public String readString()  {
        //write your code here
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
        message = sc.nextLine();
        return message;
    }
    public String upperCaseString (String message){
        //write your code here
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {

            if(Character.isLetter(charArray[i])) {

                if(foundSpace) {

                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        
        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + message);
        System.out.println("\n---------------------------------");
        return null;
    }
    public static void main(String[] args) {
        //write your code here
        Task3 task3 = new Task3();
        String mes = task3.readString();
        task3.upperCaseString(mes);
    }
}
