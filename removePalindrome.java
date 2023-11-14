/**
 * removePalindrome
 */
public class removePalindrome {

    public static void main(String[] args) {
        String str = "I saw the racecar yesterday";
        String[] arr = str.split(" "); 
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            if(!isPalindrome(arr[i])){
                ans.append(arr[i]).append(" ");
            }
        }
        System.out.println(ans.toString());

    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        while (i<j) {
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }                  
        }
        return true;
    }
    
}