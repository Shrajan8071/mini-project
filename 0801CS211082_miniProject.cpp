#include<iostream>
#include<math.h>
using namespace std;
// function for binary to decimal conversion
int BintoDec( int num)
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
int DectoBin( int num)
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
int noOfBits( int num)
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
    }    return count;
}
// function to add binary numbers
int BinAdd( int n1, int n2)
{
    int a,b,c;
    a=BintoDec(n1);
    b=BintoDec(n2);
    c=a+b;
    int d=DectoBin(c);
    return d;
}
// function to substract two binary numbers
int BinSub( int n1, int n2)
{
    int a,b,c;
    a=BintoDec(n1);
    b=BintoDec(n2);
    c=a-b;
    int d=DectoBin(c);
    return d;
}
// function to multiply two binary numbers
int BinMult( int n1, int n2)
{
    int a,b,c;
    a=BintoDec(n1);
    b=BintoDec(n2);
    c=a*b;
    int d=DectoBin(c);
    return d;
}
// function to divide two binary numbers
int BinDiv( int n1, int n2)
{
    int a,b;
    a=BintoDec(n1);
    b=BintoDec(n2);
    float c=float(a)/float(b);
    int d=DectoBin(c);
    return d;
}
// function to find 1's compliment of given binary
int Bin_1s_complement( int arr[], int size )
{
    int newarray[8];
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
        cout << newarray[k] << ends;
    }
}
// function to convert decimal to octal conversion
int DecToOcta(int num)
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
int BintoOcta(int num)
{
    int n=num;
    int p=BintoDec(num);
    int answer=DecToOcta(p);
    return answer;
}
// function to convert octal to  decimal conversion
int OctatoDec(int num)
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
int OctatoBin(int num)
{
    int n= num;
    int p=OctatoDec(n);
    int answer=DectoBin(n);
    return answer;
}
//
int main()
{
    int choice;
    //taking input from user to perform a task
    cout << " Welcome to Binary CODE HELPER -!!! " << endl << endl ;
    cout << " Enter choice" << endl;
    cout << " Enter 1 for Binary to decimal conversion " << endl ;
    cout << " Enter 2 for Decimal to binary conversion " << endl ;
    cout << " Enter 3 to find no. of setbits in number" << endl ;
    cout << " Enter 4 for Binary addition " << endl ;
    cout << " Enter 5 for Binary substraction " << endl ;
    cout << " Enter 6 for Binary multiplication " << endl ;
    cout << " Enter 7 for Binary division " << endl ;
    cout << " Enter 8 to find 1's complement of binary " << endl ;
    cout << " Enter 9 to find decimal to octal conversion " << endl ;
    cout << " Enter 10 to find binary to octal conversion " << endl ;
    cout << " Enter 11 to find octal to decimal conversion " << endl ;
    cout << " Enter 12 to find octal to binary conversion " << endl ;
    
    cin >> choice ;
    
    switch (choice)
    {
    case 1: {   int number;
                cout<< " Enter input " << endl;
                cin >> number;
                cout << " Decimal value for this binary is: " ;                 
                cout << BintoDec( number);
                break;
            }
    case 2: {   int number;
                cout<< " Enter input " << endl;
                cin >> number;
                cout << " Binary reprentation for this decimal number is: " ;
                cout << DectoBin( number);
                break;
            }
    case 3: {
                int number;
                cout << " Enter input decimal number: ";
                cin >> number ;
                cout << "No. of setbits are :" << noOfBits(number);
                break;
            }
    case 4: {   int num1,num2;
                cout << " Enter binary no.1 " << endl;
                cin >> num1; 
                cout << " Enter binary no.2 " << endl;      
                cin >> num2;
                cout << " Binary addition is: " << BinAdd(num1,num2) ;
                break;                      
            }
    case 5: {   int num1,num2;
                cout << " Enter binary no.1 " << endl;
                cin >> num1; 
                cout << " Enter binary no.2 " << endl;      
                cin >> num2;
                cout << " Binary substraction is: " << BinSub(num1,num2);;
                break;                            
            }
    case 6: {   int num1,num2;
                cout << " Enter binary no.1 " << endl;
                cin >> num1; 
                cout << " Enter binary no.2 " << endl;      
                cin >> num2;
                cout << " Binary multiplication is: " << BinMult(num1,num2); ;
                break;                           
            }
    case 7: {   int num1,num2;
                cout << " Enter binary no.1 " << endl;
                cin >> num1; 
                cout << " Enter binary no.2 " << endl;      
                cin >> num2;
                cout << " Binary division is: " << BinDiv(num1,num2);
                break;                           
            }
    case 8: {   int number[8];
                cout << " Enter the 8 digit binary number " << endl;
                cout << " please input space after every input " << endl;
                for(int i=0; i<8;i++)
                {
                    cin >> number[i];
                }
                Bin_1s_complement( number , 8);
                break;
            }
    case 9: {   
                cout << " enter decimal input " << endl;
                int number;
                cin >> number;
                cout << "Decimal to octal conversion for this decimal is:" << DecToOcta(number) << endl;
                break;
            }
    case 10: {   
                cout << " enter binary input " << endl;
                int number;
                cin >> number;
                cout << "Binary to octal conversion for this decimal is:" << BintoOcta(number) << endl;
                break;
            }
    case 11: {   
                cout << " enter octal input " << endl;
                int number;
                cin >> number;
                cout << "Octal to decimal conversion for this decimal is:" << OctatoDec(number) << endl;
                break;
            }   
    case 12: {   
                cout << " enter octal input " << endl;
                int number;
                cin >> number;
                cout << "Octal to binary conversion for this decimal is:" << OctatoBin(number) << endl;
                break;
            }   
    default: {
                cout << " Invalid choice entered. Thank you and try again . ";
                break;
             }
    }
    cout<< endl << endl << " End of program , Final Thank you" << endl;
    return 0;
}