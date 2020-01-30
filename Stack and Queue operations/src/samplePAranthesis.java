import java.util.*;
public class samplePAranthesis {
	static String isBalanced(String s) {
	    Stack stack = new Stack();
	    stack.push(s.charAt(0));
	    char peek;
	    char charAt;

	    for (int i = 1; i < s.length(); i++) {
	        try {
	            peek = (char) stack.peek();
	            charAt = s.charAt(i);
	            if(!stack.empty()) {
	            if ((charAt == '}' && peek == '{') || (charAt == ')' && peek == '(')
	                    || (charAt == ']' && peek == '[')) {
	                stack.pop();
	            } else
	                stack.push(charAt);
	            }
	            else
	                stack.push(i);
	        } catch (Exception e) {
	            //i++;
	            charAt = s.charAt(i);
	            stack.push(charAt);
	        }
	    }
	    if (stack.empty())
	        return "YES";
	    else
	        return "NO";

	}

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    in.nextLine();
	    String result[] = new String[t];
	    for (int a0 = 0; a0 < t; a0++) {
	        String s = in.next();
	        result[a0] = isBalanced(s);
	    }
	    in.close();
	    for (int i = 0; i < t; i++)
	        System.out.println(result[i]);
	}
		} 
