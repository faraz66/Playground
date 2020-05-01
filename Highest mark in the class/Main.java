#include<iostream>
using namespace std;
int main()
{
 int n,highest_marks=0;
  cin>>n;
  int marks[n];
  for(int i=0;i<n;i++)
    cin>>marks[i];
  
  for(int i=0;i<n;i++)
  {
    if(highest_marks<marks[i])
    highest_marks=marks[i];
    
      
  }
cout<<highest_marks;
  
}