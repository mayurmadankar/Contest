//time - O(n+m)
//space -O(m)
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> bannedSet = new HashSet<>();

        for(String word : bannedWords){
            bannedSet.add(word);
        }
        int count=0;
        for(String word : message){
            if(bannedSet.contains(word)){
                count++;
            }
            if(count>=2){
                return true;
            }
        }
        return false;
    }
}