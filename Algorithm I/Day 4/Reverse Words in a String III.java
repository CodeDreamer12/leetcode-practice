class Solution {
    public void reverse(char str[], int start, int end){
       while(start<end){
           char temp=str[start];
           str[start]=str[end];
           str[end]=temp;
           start++;
           end--;
       }
    }
    public String reverseWords(String s) {
        if(s.length()<=1){
            return s;
        }
       char str[]=s.toCharArray();
       int start=0;
       for(int i=0; i<str.length; i++){
           if(str[i]==' '){
               reverse(str,start,i-1);
               start=i+1;
           }
           else if(i==str.length-1){
               reverse(str,start,i);
           }
       }
       return String.valueOf(str);

    }
}
