package string;

/**
 * Recursively remove all adjacent duplicates
 */
public class program_38 {
    static char last_removed;
    static String removeUtil(String str){
        if(str.length() == 0 || str.length() == 1)
            return str;
        
        if(str.charAt(0)  == str.charAt(1)){
            last_removed = str.charAt(0);
            while(str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1, str.length());
            str = str.substring(1, str.length());
            return removeUtil(str);
        }

        String rem_str = removeUtil(str.substring(1, str.length()));

        if(rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)){
            last_removed = str.charAt(0);
            return rem_str.substring(1, rem_str.length());
        }

        if(rem_str.length() == 0 && last_removed == str.charAt(0))
            return rem_str;

        return (str.charAt(0) + rem_str);
    }

    static String remove(String str){
        last_removed = '\0';
        return removeUtil(str);
    }
    public static void main(String[] args) {
        String str1 = "geeksforgeeg";
        System.out.println(remove(str1));
 
        String str2 = "azxxxzy";
        System.out.println(remove(str2));
 
        String str3 = "caaabbbaac";
        System.out.println(remove(str3));
 
        String str4 = "gghhg";
        System.out.println(remove(str4));
 
        String str5 = "aaaacddddcappp";
        System.out.println(remove(str5));
 
        String str6 = "aaaaaaaaaa";
        System.out.println(remove(str6));
 
        String str7 = "qpaaaaadaaaaadprq";
        System.out.println(remove(str7));
 
        String str8 = "acaaabbbacdddd";
        System.out.println(remove(str8));
    }
}
/** 
 * OUTPUT
 * 
 * gksfor
 * ay  
 *   
 * g   
 * a   
 * 
 * qrq 
 * acac
 * 
 */