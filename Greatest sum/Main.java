#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c],sum_of_rows[r],sum_of_columns[c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  
  for(i=0;i<r;i++)
  { 
    int sum=0;
    for(j=0;j<c;j++)
    sum+=a[i][j];
    sum_of_rows[i]=sum;
  }
  
  for(i=0;i<r;i++)
  {
    int sum=0;
    for(j=0;j<c;j++)
    sum+=a[j][i];
    sum_of_columns[i]=sum;
  }	
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  cout<<sum_of_rows[i]<<" ";
  cout<<endl;
  
  int max_value=0,b=0;
  for(i=0;i<r;i++)
  {
    if(sum_of_rows[i]>max_value)
    {
      max_value=sum_of_rows[i];
		  	b=i;
    }
  }
 
  cout<<"Row "<<b+1<<" has maximum sum";
  cout<<endl;
  
  cout<<"Sum of columns is ";
   for(i=0;i<c;i++)
	cout<<sum_of_columns[i]<<" ";
  cout<<endl;
  
  max_value=0;
  b=0;
  for(i=0;i<r;i++)
  { 
    if(max_value<sum_of_columns[i])
    {
      max_value=sum_of_columns[i];
		  	b=i;
	 }
  }
  cout<<"Column "<<b+1<<" has maximum sum"<<endl;
}