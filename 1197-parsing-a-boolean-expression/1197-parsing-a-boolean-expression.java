class Solution {
    public char solveOperator(HashSet<Character> arr, char op) {
        if (op == '!') {
            if (arr.contains('t')) return 'f';
            else return 't';
        } else if (op == '&') {
            if (arr.contains('f')) return 'f';
            else return 't';
        } else { // case for '|'
            if (arr.contains('t')) return 't';
            else return 'f';
        }
    }

    public boolean parseBoolExpr(String exp) {
        Stack<Character> st = new Stack<Character>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if (ch != ',' && ch != ')') {
                st.push(ch);
            } else if (ch == ')') {
                set.clear(); // Initialize set here to avoid stale data issues
                char aa = st.pop();
                while (aa != '(') {
                    set.add(aa);
                    aa = st.pop();
                }
                char op = st.pop(); // Get the operator for this operation
                char solve = solveOperator(set, op);
                st.push(solve); // Push the result back onto the stack for further evaluation
            }
        }

        // Check the final value after all evaluations
        return st.pop() == 't';
    }
}
