#include<iostream>
using namespace std;
int main()
{
  int a,i,sum=0,sum1=0;
  cin>>a;
  int n=a;
 /* while(a!=0)
  {
   int  remainder =a/10;
   	i++;
  }*/
  while(n!=0)
  { 
	int remainder=n%10;
     sum=sum+remainder;
      n/=10;
  }
 
  while(sum!=0)
  { 
	int remainder=sum%10;
     sum1=sum1+remainder;
      sum/=10;
  }
   cout<<sum1;
}