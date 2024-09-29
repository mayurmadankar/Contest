class Solution {
    public char kthCharacter(int k) {
        // Initial string
        StringBuilder word = new StringBuilder("a");
        
        // Keep performing operations until the length is greater than or equal to k
        while (word.length() < k) {
            int len = word.length();
            StringBuilder nextPart = new StringBuilder();
            
            // Generate the next part by incrementing each character of the current word
            for (int i = 0; i < len; i++) {
                char nextChar = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                nextPart.append(nextChar);
            }
            
            // Append the new part to the current word
            word.append(nextPart);
        }
        
        // Return the k-th character (1-based index)
        return word.charAt(k - 1);
    }
}
