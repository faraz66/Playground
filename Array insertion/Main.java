#include<iostream>
using namespace std;
int main()
{
  int n,i,b[n+1];
  cin>>n;
  int a[20];
  for(i=0;i<n;i++)
    cin>>a[i];
  int loc;
  cin>>loc;
  cout<<"Enter the number of elements in the array"<<endl;
  cout<<"Enter the elements in the array"<<endl;
  cout<<"Enter the location where you wish to insert an element"<<endl;

  if(loc>n)
  {
    cout<<"Invalid Input";
    exit(0);
  }
  else
  { 
      cout<<"Enter the value to insert"<<endl;
  cout<<"Array after insertion is"<<endl;
   
    int no,j;
   	cin>>no;
    b[0]=a[loc-1];      //b[0]=a[3]
   a[loc-1]=no;             // a[3] =10
    for(i=loc,j=1;i<n;i++)    //a[4]
   	  b[j]=a[i];        //b[1]=5
    a[loc]=b[0];
  for(i=loc+1,j=1;i<=n;i++)    
    a[i]=b[j];
  }


  for(i=0;i<=n;i++)
    cout<<a[i]<<endl;
}