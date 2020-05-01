#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j;
  cin>>r>>c;
  int a[r][c],b[c][r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  if(r==c)
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      b[j][i]=a[i][j];
  else
     for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      b[j][i]=a[i][j];
  
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      cout<<b[i][j]<<" ";
    }  
	 cout<<endl;
  }
}  
