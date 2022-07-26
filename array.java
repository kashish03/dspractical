import java.util.Scanner;



public class array{
    void printsubsets(int[] arr){
        int n = arr.length;
        for ( int k=0;k<(1<<n);k++){
            System.out.print("{");
            int m =1;
            for(int h =0 ; h<n;h++){
                if((k & m)>0){
                    System.out.print(arr[h]+"");
                }
                m=m<<1;
            }
            System.out.println("}");
        }
    }
    
    
    
    
    public void isamember(int a,int[] arr){
        int temp=0;
        for (int j =0 ; j<5; j++){
            if ( arr [j]==a){
                temp=1;
                break;
               
                
                

            }
            else{
                temp=0;
               
            }
            
        }
        if (temp==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        
        
        
        

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[5];
        for (int i=0;i<5;i++){
            System.out.println("element:"+ i);
            arr[i]=sc.nextInt();
        }
        System.out.println("set provided:"+ arr);
        int a= sc.nextInt();
        array m= new array();
        System.out.println("isamember" );
        m.isamember(a, arr);
        m.printsubsets(arr);
        
        
        


    }
    
    }


