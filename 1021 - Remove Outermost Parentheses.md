# 1021 - Remove Outermost Parentheses

## Description
A valid parentheses string is either empty (""), "(" + A + ")", or A + B, 
where A and B are valid parentheses strings, and + represents string concatenation.  
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is **primitive** if it is nonempty, 
and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: 
`S = P_1 + P_2 + ... + P_k`, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

## Explanation

### Valid Parentheses String : 
1. Empty (""), 
2. "(" + A + ")", 
3. or A + B, 
where A and B are valid parentheses strings, and + represents string concatenation.  

#### Example #1 : "()"
It can be considered as in the form of "(" + A + ")" => "(" + "" + ")" => a valid paranthesis

#### Example #2 : "(())" 
It can be considered as in the form of "(" + A + ")" => "(" + () + ")" => a valid paranthesis

#### Example #3 : "(())()"
"(())()" => A + B => "(" + () + ")" + "()"

#### Example #4 : "(()(()))"
"(()(()))" => "( + A + ")" where A = "()(())" which in turn is in the form of A + B.

### Primitive Valid Parentheses String:
- Nonempty
- There does not exist a way to split it into A+B, with A and B nonempty valid parentheses strings

#### Example #1 : "()" => Primitive Valid Parentheses String
- It is nonempty
- If we split into A + B, then A = "" and B = "()" and A is non-empty so there does not exist a way to split it into A+B, with A and B nonempty valid parentheses strings 

#### Example #2 : "(())" => Primitive Valid Parentheses String
- It is nonempty
- If we split into A + B, then A = "" and B = "(())" and A is non-empty so there does not exist a way to split it into A+B, with A and B nonempty valid parentheses strings 


### Primitive Decomposition of a Valid Paranthesis String, S
S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

#### Example #1 : "()"
Primitive decomposition of "()" = "()", where "()" is primitive valid parentheses string

#### Example #2 : "()()" 
Primitive decomposition of "()()" = "()" + "()", where "()" is primitive valid parentheses string

#### Example #3 : "(())()" 
Prmitive decomposition of "(())()" = "(())" + "()", where "(())" and "()" are primitive valid parentheses strings

#### Example #4 : "(()())(())"
Primitive decomposition of "(()())(())" = "(()())" + "(())", where "(()())" and "(())" are primitive valid parentheses strings

#### Example #5 : "(()())(())(()(()))"
Primitive decomposition of "(()())(())(()))" = "(()())"+ "(())" + "(()(()))", where "(()())", "(())" and "(()(()))" are primitive valid parentheses strings

### Remove the outermost parentheses of every primitive string in the primitive decomposition of S.

#### Example #1 : "()"
Primitive decomposition of "()" = "()", where "()" is primitive valid parentheses string

Output : ""

#### Example #2 : "()()" 
Primitive decomposition of "()()" = "()" + "()", where "()" is primitive valid parentheses string

Output : "" + "" = ""

#### Example #3 : "(())()" 
Primitive decomposition of "(())()" = "(())" + "()", where "()" is primitive valid parentheses string

Output : "()" + "" = "()

#### Example #4 : "(()())(())"
Primitive decomposition of "(()())(())" = "(()())" + "(())", where "(()())" and "(())" are primitive valid parentheses strings

Output : "()()" + "()" = "()()()"

#### Example #5 : "(()())(())(()(()))"
Primitive decomposition of "(()())(())(()))" = "(()())" + "(())" + "(()(()))", where "(()())", "(())" and "(()(()))" are primitive valid parentheses strings

Output : "()()" + "()" + "()(())" = "()()()()(())"

