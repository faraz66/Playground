#include<iostream>
using namespace std;
void addMatrix(int **a,int **b,int r,int c)
{ 
 int i,j,d[r][c];
 for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  d[i][j]=a[i][j]+ b[i][j];
  
   for(i=0;i<r;i++)
   {
  for(j=0;j<c;j++)
   cout<<d[i][j]<<" ";
  cout<<endl;
   }
}
int main()
{	
 int r,c,i,j;
 cin>>r>>c;
 int **a , **b;
 a = new int *[r];
 b = new int *[r];
 for(i=0;i<r;i++)
 {
   a[i]= new int[c];
   b[i]= new int[c];
 }
 for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  cin>>a[i][j];
  
 for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  cin>>b[i][j];
  
   addMatrix(a,b,r,c);
}