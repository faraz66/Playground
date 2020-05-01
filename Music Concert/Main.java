#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,*p,b,g;
  cin>>n;
  p = (int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>*(p+i);
  for(int i=0;i<n;i++)
    if(*(p+i)%2==0)
      b++;
    else
      g++;
  cout<<g<<endl<<b;
 
  return 0;
}