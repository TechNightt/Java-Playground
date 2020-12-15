/*********************************************************************************************************************
 Bracket Logic

Brackets and parentheses in mathematical expressions have to conform to certain logical rules. Every opening bracket must have a closing mate somewhere further down the line. Although brackets can be nested, different types cannot overlap:

([<x+y>+3]-1) makes sense because each set of brackets contains or is contained by another set.
([<x+y>+3)-1] makes no sense because the parentheses and the square brackets overlap.
Given a string expression that can contain four types of brackets: () <> [] {}, create a function that returns true if the bracket logic is valid and false if it is not.

Examples
bracketLogic("[<>()]") ➞ true

bracketLogic("[<(>)]") ➞ false

bracketLogic("[(a*b+<7-c>+9]") ➞ false
// Opening parenthesis has no mate.

bracketLogic("[{(h*i+3)-12]/4*x+2}") ➞ false
// Square and curly brackets overlap.

bracketLogic("[ab(c/d<e-f+(7*6)>)+2]") ➞ true

Notes
Any characters other than the brackets can be ignored.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.*;
​
public class Challenge {
  public static boolean bracketLogic(String xp) {
    Stack<Character> st = new Stack<Character>();
    for(char c:xp.toCharArray()){
      switch(c){
        case '(': case '[': case '<': case '{':
          st.push(c);
          break;
        case ')':
          if(st.empty())return false;
          else if(st.peek()=='(')st.pop();
          else return false;          
          break;
        case ']':
          if(st.empty())return false;
          else if(st.peek()=='[')st.pop();
          else return false;          
          break;
        case '>':
          if(st.empty())return false;
          else if(st.peek()=='<')st.pop();          
          else return false;          
          break;
        case '}':
          if(st.empty())return false;
          else if(st.peek()=='{')st.pop();          




//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
public class Challenge {
  public static boolean bracketLogic(String xp) {
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < xp.length(); i++) {
			if (isBracket(xp.charAt(i))) {
				if(!s.empty() && isMatch(s.peek().charAt(0), xp.charAt(i))) s.pop();
				else s.push(""+xp.charAt(i));	
			}
		}
		return s.empty();
  }
	public static boolean isBracket(char ch) {
		if (ch=='(' || ch==')' || ch=='[' || ch==']' || ch=='<' | ch=='>' ||
			  ch=='{' || ch=='}')
			return true;
		return false;
	}
	public static boolean isMatch(char ch1, char ch2){
		if (ch1 == '(' && ch2 == ')') return true;
		if (ch1 == '[' && ch2 == ']') return true;
		if (ch1 == '<' && ch2 == '>') return true;
		if (ch1 == '{' && ch2 == '}') return true;
		return false;
	}
}


//#############################################################
//#                        MY SOLUTION 3   



import java.util.Stack;
public class Challenge {
  public static boolean bracketLogic(String xp) {
						if (!(xp.endsWith(")") || xp.endsWith("]") || xp.endsWith("}")))
            return false;
						xp = xp.replaceAll("[^\\[\\]{}()]", "");
						Stack<Character> stack = new Stack<>();
        		for (int i = 0; i < xp.length(); i++) {
            char current = xp.charAt(i);

            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (current) {
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
  }
}



//#############################################################
//#                        MY SOLUTION 4



import java.util.*; 

public class Challenge {
  public static boolean bracketLogic(String xp) {
		Stack<Character> stack = new Stack<Character>(); 

		for(char c: xp.toCharArray()) {
			
			if(c=='['||c=='<'||c=='{'||c=='(') {
				stack.push(c);
			}else if(c==']' && stack.pop()!='[') {
				return false;
			}else if(c=='>' && stack.pop()!='<')
				return false;
			else if(c=='}' && stack.pop()!= '{')
				return false;
			else if(c==')' && stack.pop()!= '(')
				return false;
			
		}
		
		return stack.isEmpty();
  }
}





//#############################################################
//#                        MY SOLUTION 5


import java.util.*;
public class Challenge {
  public static boolean bracketLogic(String xp) {
		xp = xp.replaceAll("[^\\(\\)\\[\\]\\{}<>]", "");
		Deque<Character> deque = new ArrayDeque<>();
		for (int i = 0; i < xp.length(); i++) {
			char c = xp.charAt(i);
			if (("" + c).matches("[\\(\\[\\{<]")) {
				deque.addFirst((c == '(') ? ')' : (c == '[') ? ']' : (c == '{') ? '}' : '>');
			}
			else {
				if (deque.isEmpty() || c != deque.removeFirst()) {
					return false;
				}
			}
		}
		return deque.isEmpty();
  }
}




//#############################################################
//#                        MY SOLUTION 6


import java.util.Stack;
public class Challenge {
  public static boolean bracketLogic(String xp) {
		xp = xp.replaceAll("[a-zA-Z0-9\\s+]", "");
		Stack<Character> stack = new Stack<Character>();
		for(char c: xp.toCharArray()) {
			if(c=='(' || c=='[' || c== '<' || c=='{') {
				stack.push(c);
			}
			else if((c == ')' && (stack.isEmpty() || stack.pop() != '(')) ||
	                 (c == ']' && (stack.isEmpty() || stack.pop() != '[')) ||
	                 (c == '>' && (stack.isEmpty() || stack.pop() != '<')) ||
	                 (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
				return false;
			}
		}
		 return stack.isEmpty();
  }
}





//#############################################################
//#                        MY SOLUTION 7


import java.util.*;
public class Challenge {
  
	public static boolean checkIt(char i, char n){
		if(n == '<' && i == '>') return true;
		if(n == '[' && i == ']') return true;
		if(n == '(' && i == ')') return true;
		if(n == '{' && i == '}') return true;
		return false;
	}
	public static boolean bracketLogic(String xp) {
			Deque<Character> deque = new LinkedList<Character>();
		
		for(int i = 0; i < xp.length(); ++i){
				if(xp.charAt(i) == '<' ||  xp.charAt(i) == '(' || xp.charAt(i) == '[' || xp.charAt(i) == '{'){
					deque.addFirst(xp.charAt(i));
				}
					if(xp.charAt(i) == '>' ||  xp.charAt(i) == ')' || xp.charAt(i) == ']' || xp.charAt(i) == '}'){
						if(!checkIt(xp.charAt(i), deque.pollFirst())) return false;
				}
			}		
		if(deque.size() != 0 ){return false;}
		
		return true;
  }
}