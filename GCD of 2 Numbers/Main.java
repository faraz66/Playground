#include<iostream>
using namespace std;
int gcd(int n1, int n2)
{
    if (n2 != 0)
       return gcd(n2, n1 % n2);
    else 
       return n1;
}
int main()
{
int n1,n2,small;
 cin>>n1>>n2;
  if(n1>n2)
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(n1,n2);
  else
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(n2,n1);  
}