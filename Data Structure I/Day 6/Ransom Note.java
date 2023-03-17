class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()==1 && magazine.length()==1){
            if(ransomNote.charAt(0)==magazine.charAt(0)){
                return true;
            }
            else{
                return false;
            }
        }
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        Arrays.fill(freq1,0);
        Arrays.fill(freq2,0);
        for(int i=0; i<ransomNote.length(); i++){
            freq1[ransomNote.charAt(i)-'a']++;
        }
        for(int j=0; j<magazine.length(); j++){
            freq2[magazine.charAt(j)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq1[i]!=0){
                if(freq1[i]>freq2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
