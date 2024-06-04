// Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
// palindrome
//  that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

public class longestPalindrome {

    public static int longestPalindromes(String s) {
        int len = s.length();
        int arr[] = new int[52];
        int ans = 0;
        for(int i = 0; i< len; i++){
            char c = s.charAt(i);
            if(c>='a' && c <= 'z'){
                arr[c - 'a']++;
                if(arr[c - 'a'] == 2){
                  arr[c - 'a'] = 0;
                  ans += 2;  
                }
            }else{
                arr[c - 'A' + 26]++;
                if(arr[c - 'A' + 26] == 2){
                  arr[c - 'A' + 26] = 0;
                  ans += 2;  
                }
            }
        }
        
          if(len %2 != 0){
            ans += 1;
          }
          else if(ans != len){
            ans += 1;
          }
          return ans;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindromes(s));
    }
    
}
