#include<iostream>
using namespace std;
int main()
{
  int n,sum_even,sum_odd;
  cin>>n;
  int a[15];
    for(int i=0;i<n;i++)
      cin>>a[i];
  	for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
        sum_even+=a[i];
  	  else
        sum_odd+=a[i];
    }
  cout<<"The sum of the even numbers in the array is "<<sum_even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum_odd;
  
  
    
}