#include<iostream>
using namespace std;
int check(int *,int);
int main()
{
  int n,a[n],i;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>a[i];
  check(a,n);
}
int check(int *a,int n)
{
  int i,x=0,y=0;
  
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
   		x++;
    else
       y++;
  }
  if(x>0 && y==0)
  {
    cout<<"The array is Even";
    return 1;
  }
  else if (x==0 && y>0)
  {
    cout<<"The array is Odd";
  	return 2;
  }
  else
  {
    cout<<"The array is Mixed";
  	return 3;
  }
}
