#include<iostream>
using namespace std;
int main()
{
  int i,j,n,d1_sum=0,d2_sum=0;
  cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
    cin>>a[i][j];
  for(i=0;i<n;i++)
    d1_sum+=a[i][i];
  for(i=0;i<n;i++)
    d2_sum+=a[i][n-1-i];
    if(d1_sum==d2_sum)
      cout<<"Yes";
  	else
      cout<<"No";
}