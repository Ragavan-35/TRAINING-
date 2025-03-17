// Find remainder and quoitent
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter num 1:");
	    int num1 = scan.nextInt();
	    System.out.print("ENter num 2:");
	    int num2 = scan.nextInt();
	    int quo = num1/num2;
	    int rem = num1%num2;

	    System.out.println("Quotient:" +quo);
	    System.out.println("Remainder:"+rem);
		
	}
}



//Divisibility
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Divisible by 3 and 5");
        }
        else{
        System.out.println("Enter valid number");
        }
    }
    
}

//Input =5; output=15
class Main{
    public static void main(String args[]){
        int sum =0;
        for(int i=1; i<=5;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

//Factorial of numbers
class Main{
    public static void main(String args[]){
        int mul =1;
        for(int i=1; i<=5;i++){
            mul=mul*i;
        }
        System.out.println(mul);
    }
}


//Print numbers from 1 to 100 divisible by 3 and 5
class Main{
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}

//Multiplication table 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scan.nextInt();
        for(int i = 1; i<=10;i++){
            int res = num*i;
            System.out.println( num+ "*" +i+ "=" +res);
        }
    }
}


//ENter a number and check which numbers are divisible by the entered number
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        for(int i =1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}

//pattern 1
class Main{
    public static void main(String args[]){
        for(int i=1;i<=3;i=i+1){
            for(int j=1;j<=3;j=j+1){
                System.out.print("*");
            }
            System.out.println();
             
        }
        
    }
}

//count the no.of digits
class Main{
    public static void main(String args[]){
        int n = 8341;
        int count = 0;
        while(n>0){
            n=n/10;
            count=count+1;
            //when given inside the loop prints the count every single time
            //System.out.println(count);
            
            
        }
        //when give out of the loop gives the total count
        System.out.println(count);
    }
}

//Reverse the number
class Main{
    public static void main(String args[]){
        int n = 8341;
        int count=0;
        
        while(n>0){
            System.out.println(n%10);
            n=n/10;
        }
        
        
    }
}

//Reverse number
class Main{
    public static void main(String args[]){
        int num = 8341;
        int reverse = 0;
        while(num>0){
            int rem = num%10;
            reverse=reverse*10+rem;
            num = num/10;
        }
        System.out.print("The Reverse number is:" +reverse);
    }
}

