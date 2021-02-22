import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisCheck {
    public static void main(String[] args) {
        String x = "{([])}";
        System.out.println(ispar(x));
    }
    static boolean ispar(String x)
    {
        Deque<Character> stack =new ArrayDeque<>();
        for(char c : x.toCharArray()){
            if(c=='{'){
                stack.push('}');
            }
           else if(c=='('){
                stack.push(')');
            }
           else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
            
        }
        return stack.isEmpty();
    }
}
