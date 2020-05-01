#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max_value=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      if(a[i][j]>=max_value)
        max_value=a[i][j];
    cout<<"The maximum element is "<<max_value;
  
}