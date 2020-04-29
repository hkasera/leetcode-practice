# 953. Verifying an Alien Dictionary

In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. 
The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet, 
return true if and only if the given words are sorted lexicographicaly in this alien language.

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

Example 3:
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) 
According to lexicographical rules "apple" > "app", because 'l' > '∅', 
where '∅' is defined as the blank character which is less than any other character

# Solution

The question is pretty straight forward. We are asked to sort a list of words lexicographically based on an alien dictionary. 
Lexicographical sorting is same as alphabetical sorting if the dictionary was abcdefghijklmnopqrstuvwxyz.

Here, we have a different dictionary where the order of characters a-z can vary.

### Approach :
For every two adjacent words, index i = 0,1...min(word1.length, word2.length), compare indices of characters at these positions in the alien dictionary
- if word1’s character is at smaller index then word1 is lexicographically smaller, compare next 2 words.
- if word1’s character is at larger index then word1 is not lexicographically smaller, return
- if word1’s character is at same index then compare next two letters of the words. If the characters of the two words are same until when one of the words length exhausts, then if word1 is of larger length then it is not lexicographically smaller.

## Verification of Solution :

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"

word1 = "hello"
word2 = "leetcode"

0 : index of h in alien dictionary -> 0
0 : index of l in alien dictionary -> 1

Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
