import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int result = 0;
        
        // Sliding window over the word
        for (int i = 0; i <= n - 5; i++) { // Each substring needs at least 5 characters for all vowels
            int consonantCount = 0;
            boolean[] foundVowels = new boolean[5]; // To track if all vowels are found
            
            // Extend the window from index i and check each possible substring
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                
                if (vowels.contains(c)) {
                    if (c == 'a') foundVowels[0] = true;
                    else if (c == 'e') foundVowels[1] = true;
                    else if (c == 'i') foundVowels[2] = true;
                    else if (c == 'o') foundVowels[3] = true;
                    else if (c == 'u') foundVowels[4] = true;
                } else {
                    consonantCount++;
                }

                // Check if the substring contains all vowels and exactly k consonants
                if (foundVowels[0] && foundVowels[1] && foundVowels[2] && foundVowels[3] && foundVowels[4] && consonantCount == k) {
                    result++;
                }
            }
        }

        return result;
    }
}
