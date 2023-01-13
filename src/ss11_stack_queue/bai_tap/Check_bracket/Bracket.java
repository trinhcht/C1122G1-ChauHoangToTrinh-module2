package ss11_stack_queue.bai_tap.Check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    // trả về true false.
    public static boolean checkBracket(String string){
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char index = string.charAt(i);
            if (index == '('){
                bStack.push(index);
            }else if (index == ')'){
                if (bStack.isEmpty()){
                    return false;
                }
                bStack.pop();
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String string = scanner.nextLine();
        System.out.println(checkBracket(string));
    }
}
