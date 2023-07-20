package interview;

import java.util.*;

public class ParenthesisValidator{

    public static void main(String args[]) {

        String parentheses = "[{(){()}}]{{}}";

        char parenthesesList[] = parentheses.toCharArray();

        Stack<Character> stack = new <Character>Stack();
        boolean isValid = true;
        for (int index = 0; index < parenthesesList.length; index++) {
            char prn = parenthesesList[index];
            if (prn == '[' || prn == '(' || prn == '{') {
                stack.push(prn);
            } else {
                switch (prn) {
                    case ']':
                        if (stack.pop() != '[')
                            isValid = false;
                        break;
                    case '}':
                        if (stack.pop() != '{')
                            isValid = false;
                        break;
                    case ')':
                        if (stack.pop() != '(')
                            isValid = false;
                        break;
                }
            }
            if (!isValid) {
                break;
            }
        }

        if (!stack.empty()) {
            isValid = false;
        }
        if (isValid) {
            System.out.println(parentheses + " is valid.");
        } else {
            System.out.println(parentheses + " is not invalid.");
        }
    }
}

