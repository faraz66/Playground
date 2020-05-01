#include<iostream>
using namespace std;
int main()
{
 int i,j,n,sum_top,sum_last=0,sum_diagonal=0;
  cin>>n>>n;
  
  int a[n][n];
  
  for(i=0;i<n;i++)
  for(j=0;j<n;j++)
  cin>>a[i][j];
  
  //sum of top row
  sum_top=0;
    for(j=0;j<n;j++)
      sum_top+=a[0][j]; 
  //sum of last row
    for(j=0;j<n;j++)
      sum_last+=a[n-1][j];
  // sum of diagonal
  for(i=0;i<n;i++)
      sum_diagonal+=a[i][n-1-i];
  //total sum
  int total_sum=sum_top + sum_last + sum_diagonal -a[0][n-1] -a[n-1][0];
  cout<<"Sum of Zig-Zag pattern is "<<total_sum;
}