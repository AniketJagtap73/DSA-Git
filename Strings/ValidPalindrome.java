class ValidPalindrome{
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));

    }
    static boolean isValidPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        char startChar;
        char endChar;

        while(start<end){
            startChar = s.charAt(start);
            endChar = s.charAt(end);
            
            if(!Character.isLetterOrDigit(startChar)){
                start++;
            }
            else if(!Character.isLetterOrDigit(endChar)){
                end--;
            }
            else if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)){
                return false;
            }
            else{
                start++;
                end--;
            }

        }
        return true;

    }
}