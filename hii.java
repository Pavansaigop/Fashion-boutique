import java.util.*;
class hii{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        if(a1%3==0 && a1%5==0){
            System.out.println(2);
        }
            else if(a1%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            
            }
            
        }

    }
