import java.util.Scanner;

public class Sol {

    static boolean chkAnagram(String first, String second) {
        first=first.toUpperCase();
        second=second.toUpperCase();
        boolean ans = false;
        StringBuilder c= new StringBuilder(second);

        if(first.length()==second.length()){
            for(int i=0; i<second.length();i++){
                for(int j=0; j<c.length();j++){
                    if(first.charAt(i)==c.charAt(j)){
                       c.deleteCharAt(j);
                        if(i==first.length()-1 && c.length()==0){
                        ans=true;
                        break;
                        }
                        break;

                }

           }
       }
       }
   return ans;
   
   }
    

  public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        String first = s.next();
        String second = s.next();
        s.close();
        boolean ans = chkAnagram(first,second);
        System.out.println( (ans) ? "Anagrams" : "Not Anagrams" );
    }
}
