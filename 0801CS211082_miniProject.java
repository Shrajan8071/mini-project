import java.util.*;
import java.lang.Math;
// class containing all functions
class allFunctions
{
    // function for binary to decimal conversion
    public int BintoDec( int num)
    {
        int b = num;
        int ans =0, i = 0;
        while( b != 0)
        {
            int digit = b%10;
            if( digit == 1)
            {
                ans = ans + pow (2,i);
            }
            b = b/10;
            i++;
            }   
        return ans;
    }
    // function for Decimal to binary conversion
    public int DectoBin( int num)
    {
        int n = num;
        int ans = 0;
        int i = 0;
        while( n!=0)
        {
            int bit = n & 1;
            ans = (bit * pow(10, i) ) + ans;
            n = n >> 1;
            i++;
        }
        return ans;
    }
    // function to find number of bits in given binary number
    public int noOfBits( int num)
    {
        int n=num;
        int count = 0;
        while ( n!=0)
        {
            if( n&1==1)
            {
                count++;
            }
            n=n>>1;
        }    
        return count;
    }
    // function to add binary numbers
    public int BinAdd( int n1, int n2)
    {
        int a,b,c;
        a=BintoDec(n1);
        b=BintoDec(n2);
        c=a+b;
        int d=DectoBin(c);
        return d;
    }
    // function to substract two binary numbers
    public int BinSub( int n1, int n2)
    {
        int a,b,c;
        a=BintoDec(n1);
        b=BintoDec(n2);
        c=a-b;
        int d=DectoBin(c);
        return d;
    }
    // function to multiply two binary numbers
    public int BinMult( int n1, int n2)
    {
        int a,b,c;
        a=BintoDec(n1);
        b=BintoDec(n2);
        c=a*b;
        int d=DectoBin(c);
        return d;
    }
    // function to divide two binary numbers
    public int BinDiv( int n1, int n2)
    {
        int a,b;
        a=BintoDec(n1);
        b=BintoDec(n2);
        float c=float(a)/(b);
        int d=DectoBin(c);
        return d;
    }
    // function to find 1's compliment of given binary
    public void Bin_1s_complement( int arr[], int size )
    {
        int newarray[]=new int[8];
        int j=0;
        for( j=0;j<size;j++)
        {
            if(arr[j]==1)
            {
                newarray[j]=0;
            }
            else if(arr[j]==0)
            {
                newarray[j]=1;
            }
        }
        for(int k=0; k < size ; k++)
        {
            
            System.out.println( newarray[k] + "/n");
        }
    }
    // function to convert decimal to octal conversion
    public int DecToOcta(int num)
    {
        int n=num;
        int digit=0,i=0,ans=0;
        while(n!=0)
        {
            digit=n%8;
            ans = ans + digit*pow(8,i);
            n=n/10;
            i=i*10;
        }
        return ans;
    }
    // function to convert binary to octal conversion
    public int BintoOcta(int num)
    {
        int n=num;
        int p=BintoDec(num);
        int answer=DecToOcta(p);
        return answer;
    }
    // function to convert octal to  decimal conversion
    public int OctatoDec(int num)
    {
        int n=num;
        int digit=0,i=0,ans=0;
        while(n!=0)
        {
            digit=n%10;
            ans=ans+digit*pow(8,i);
            n=n/10;
            i++;
        }
        return ans;
    }
    // function to convert octal to binary conversion
    public int OctatoBin(int num)
    {
        int n= num;
        int p=OctatoDec(n);
        int answer=DectoBin(n);
        return answer;
    }
}

public class miniProjectinjava extends allFunctions
{
    public static void main(String[] args)
    {
        int choice;
        //taking input from user to perform a task
        Scanner s=new Scanner(System.in);
        miniProjectinjava a=new miniProjectinjava();
        
        System.out.println(" Welcome to Binary CODE HELPER -!!! \n");
        System.out.println(" Enter choice \n");
        System.out.println(" Enter 1 for Binary to decimal conversion \n");
        System.out.println(" Enter 2 for Decimal to binary conversion \n");
        System.out.println(" Enter 3 to find no. of setbits in number \n");
        System.out.println(" Enter 4 for Binary addition \n");
        System.out.println(" Enter 5 for Binary substraction \n" );
        System.out.println(" Enter 6 for Binary multiplication \n");
        System.out.println(" Enter 7 for Binary division \n");
        System.out.println(" Enter 8 to find 1's complement of binary \n");
        System.out.println(" Enter 9 to find decimal to octal conversion \n");
        System.out.println(" Enter 10 to find binary to octal conversion \n" );
        System.out.println(" Enter 11 to find octal to decimal conversion \n" );
        System.out.println(" Enter 12 to find octal to binary conversion \n");

        choice=s.nextInt() ;
        
        switch (choice)
        {
        case 1: {   int number;
                System.out.println(" Enter input \n");
                number=s.nextInt();
                System.out.println(" Decimal value for this binary is: \n") ;                 
                System.out.println(a.BintoDec( number));
                break;
                }
        case 2: {   int number;
                System.out.println(" Enter input \n");
                number=s.nextInt();
                System.out.println(" Binary reprentation for this decimal number is: \n") ;
                System.out.println(a.DectoBin( number));
                break;
                }
        case 3: {
                int number;
                System.out.println( " Enter input decimal number: \n") ;
                number=s.nextInt();
                System.out.println("No. of setbits are : \n" + a.noOfBits(number));
                break;
                }
        case 4: {   int num1,num2;
                System.out.println (" Enter binary no.1 \n ");
                num1=s.nextInt(); 
                System.out.println(" Enter binary no.2 \n" );      
                num2=s.nextInt();
                System.out.println(" Binary addition is: " + a.BinAdd(num1,num2)) ;
                break;                      
                }
        case 5: {   int num1,num2;
                System.out.println(" Enter binary no.1 \n" );
                num1=s.nextInt(); 
                System.out.println(" Enter binary no.2 \n");     
                num2=s.nextInt();
                System.out.println(" Binary substraction is: " + a.BinSub(num1,num2));
                break;                            
                }
        case 6: {   int num1,num2;
                System.out.println(" Enter binary no.1 \n");
                num1=s.nextInt(); 
                System.out.println(" Enter binary no.2 \n");      
                num2=s.nextInt();
                System.out.println(" Binary multiplication is: " + a.BinMult(num1,num2)) ;
                break;                           
                }
        case 7: {   int num1,num2;
                System.out.println(" Enter binary no.1 \n" );
                num1=s.nextInt();
                System.out.println(" Enter binary no.2 \n" );      
                num2=s.nextInt();
                cSystem.out.println(" Binary division is: " + a.BinDiv(num1,num2));
                break;                           
                }
        case 8: {   int number[] = new int[8];
                System.out.println(" Enter the 8 digit binary number \n");
                System.out.println(" please input space after every input \n");
                for(int i=0; i<8;i++)
                {
                    number[i]=s.nextInt();
                }
                a.Bin_1s_complement( number , 8);
                break;
                }
        case 9: {   
                System.out.println(" enter decimal input \n");
                int number;
                number=s.nextInt();
                System.out.println("Decimal to octal conversion for this decimal is:" + a.DecToOcta(number) + "\n") ;
                break;
                }
        case 10: {   
                System.out.println(" enter binary input \n");
                int number;
                number=s.nextInt();
                System.out.println("Binary to octal conversion for this decimal is:" + a.BintoOcta(number) + "\n");
                break;
                }
        case 11: {   
                System.out.println(" enter octal input \n");
                int number;
                number=s.nextInt();
                System.out.println("Octal to decimal conversion for this decimal is:" + a.OctatoDec(number) + "\n");
                break;
                }   
        case 12: {   
                System.out.println(" enter octal input \n");
                int number;
                number=s.nextInt();
                System.outprintln("Octal to binary conversion for this decimal is:" + a.OctatoBin(number) + "\n");
                break;
                }   
        default: {
                System.out.println (" Invalid choice entered. Thank you and try again . ");
                break;
                 }
         }
         System.out.println(" \n \n End of program , Final Thank you \n");
        
    }
}
