package Ass3;

class Solution{
	public static String isMatching(String str){
		// fill you code Here
		stack st=new stack(); 
		char[] exp = new char[str.length()]; 
		for (int i = 0; i < str.length(); i++) { 
            exp[i] = str.charAt(i); 
        } 
		for(int i=0;i<exp.length;i++) 
		{ 
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
				st.push(exp[i]); 
			
			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') { 
				
				if (st.isEmpty()) 
					return "NO"; 
				else if ( !isMatchingPair(st.pop(), exp[i]) ) { 
					return "NO"; 
				} 
			} 
		} 
		if (st.isEmpty()) 
			return "YES";
		else
			return "NO";
		
	}
		static class stack 
		{ 
			int top=-1; 
			char items[] = new char[100]; 

			void push(char x) 
			{ 
				if (top == 99) 		{ 
					System.out.println("Stack full"); 
				} 
				else{ 
					items[++top] = x; 
				} 
			} 

			char pop() 
			{ 
				if (top == -1) { 
					System.out.println("Underflow error"); 
					return '\0'; 
				} 
				else	{ 
					char element = items[top]; 
					top--; 
					return element; 
				} 
			} 

			boolean isEmpty() 
			{ 
				return (top == -1) ? true : false; 
			} 
		} 
		
		static boolean isMatchingPair(char character1, char character2) 
		{ 
		if (character1 == '(' && character2 == ')') 
			return true; 
		else if (character1 == '{' && character2 == '}') 
			return true; 
		else if (character1 == '[' && character2 == ']') 
			return true; 
		else
			return false; 
		} 
}