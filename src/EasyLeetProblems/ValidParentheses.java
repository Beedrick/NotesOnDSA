package EasyLeetProblems;

public class ValidParentheses {

    private char[] line;
    private int top;

    public ValidParentheses() {
        this.line = new char[10000];
        this.top = -1;
    }

    public boolean isValid(String s) {

        ValidParentheses stackX = new ValidParentheses();

        boolean validCheck = true;

        for (int index = 0; index < s.length(); index++) {

            char ch = s.charAt(index);

            switch (ch) {

                case '(':
                case '[':
                case '{':
                    stackX.push(ch);
                    break;

                case ')':
                case ']':
                case '}':

                    if (!stackX.isEmpty()) {
                        char open = stackX.pop();
                        if (open != '(' && ch == ')'
                                || open != '[' && ch == ']'
                                || open != '{' && ch == '}') {
                            return false;
                        }

                    } else {
                        return false;
                    }
            }
        }

        //if the stack is not empty given the for loop conditions have all been met then 
        //that means there is a missing right delimiter because the top of the stack 
        //was never popped off because there wasnt a case where either closing delimeter
        //was present in the string meaning line 36 was never reached char open = stackX.pop();
        //or did not have enough closing delimeters to empty the stack (there should be equal closing and opening)
        if (!stackX.isEmpty()) {
            return false;
        }

        return validCheck;
    }

    public void push(char value) {
        ++this.top;
        this.line[top] = value;
    }

    public char pop() {

        return this.line[this.top--];

    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public static void main(String[] args) {

        String s = "[";

        ValidParentheses vP = new ValidParentheses();

        boolean isVP = vP.isValid(s);
        System.out.println(isVP);
    }

}
