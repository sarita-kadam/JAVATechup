package String;

public class ConsonantsandVolwels {

    public static void main(String[] args) {

        String str = "India";
        int vowels = 0, consonants = 0;
        String small = str.toLowerCase();

        for(int i = 0; i < small.length(); i++ ){

            char ch = small.charAt(i);

            if ( ch != ' ' && (ch >= 'a' && ch <= 'z'))
            {
                if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch == 'u'){

                    vowels ++ ;
                }
                else {
                    consonants ++;
                }
            }

            System.out.println("Number of vowels are : " + vowels);
            System.out.println("Number of Consonants are : " + consonants);
        }
    }
}



