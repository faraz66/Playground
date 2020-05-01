#include<iostream>
using namespace std;
int main()
{
int i,sum,j,r,c;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<r;i++)
  {
     sum=0;
    for(j=0;j<c;j++)
     sum+=a[i][j];
    cout<<sum<<endl;
  }
}