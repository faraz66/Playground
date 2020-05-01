#include<iostream>
using namespace std;
int main()
{
  int i,j,r,c;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  cin>>a[i][j];
 
  for(i=0;i<c;i++)
  {
     int max_value=0;
  for(j=0;j<r;j++)
  {
    if(a[j][i]>=max_value)
      max_value=a[j][i];
  }
  cout<<max_value<<endl;
  }
}