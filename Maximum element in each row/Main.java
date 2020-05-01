#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max_value;
  cin>>r>>c;
  int z[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>z[i][j];
  for(i=0;i<r;i++)
  {
    max_value=0;
    for(j=0;j<c;j++)
    {
      if(z[i][j]>max_value)
        max_value=z[i][j];
    }
      cout<<max_value<<endl;
  }
  }
