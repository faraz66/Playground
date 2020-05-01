#include<iostream>
using namespace std;
int pow(int a,int n)
{
	if(n==0)
      return 1;
  	else
      return a*pow(a,n-1);
}
int main()
{
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  cin>>a>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}