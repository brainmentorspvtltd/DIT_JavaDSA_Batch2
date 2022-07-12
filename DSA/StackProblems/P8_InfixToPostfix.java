import java.util.Stack;

/*
 * 1. Scan expression from left to right
 * 2. if scanned character is an operand, store in output
 * 3. if scanned character is an operator
 * 4. then follow BODMAS
 *      if character is '(' then push in stack
 *      if character is ')' then pop the stack and print until '(' is encountered
 *      in between keep on checking operators precedence
 */

 class P8_InfixToPostfix {
    static int precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            // If character is a letter
            if(Character.isLetterOrDigit(c)) {
                result += c;
            }
            // if character is '(', push in stack
            else if(c == '(') {
                stack.push(c);
            }
            // if character is ')', pop and output from stack unitl '(' is encountered
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression...";
                }
                else {
                    stack.pop();
                }
            }
            // if character is an operator
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if(stack.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            if(stack.peek() == '(') {
                return "Invalid Expression...";
            }
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(expression));
    }

 }