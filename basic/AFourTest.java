package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class AFourTest {
    static void countDomainName(String[] arr, int length){
        Map<String,Integer> domain = new HashMap<String,Integer>();

        for(int i = 0; i < length; i++){
            String d = arr[i].split("@")[1];
            ////alternate way u can split with '.' for more accuracy with .co, .in domain name
            String domainName = d.substring(0, d.length() - 4);
            
            if(!domain.containsKey(domainName)){
                domain.put(domainName, 1);
            }else{
                domain.put(domainName, domain.get(domainName) + 1);
            }
        }

        for(String name : domain.keySet()){
            System.out.println(name.toString()+" = "+domain.get(name));
        }
    }
    public static void main(String[] args) {
    //    String[] arr = {"sanjay@redmiffmail.com","vijay@gmail.com","swapnil@hotmail.com","nitesh@yahoo.com","kanav@gmail.com",
    //              "mayur@gmail.com","rah@hotmail.com","rahul@yahoo.com",
    //              "krishna@hotmail.com","gaurav@gmail.com"};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of email id you want to enter : ");

        int no = Integer.parseInt(sc.nextLine());

        String[] arr1 = new String[no];
        for(int i = 0; i < no; i++){
            arr1[i] = sc.nextLine();
        }
        countDomainName(arr1, no);
        sc.close();
    }  
}
