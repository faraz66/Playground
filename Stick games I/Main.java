#include<iostream>
using namespace std;
int main()
{
  int n,m,turns;
  cin>>n>>m;
  if(n<m)
    turns=n;
  else
    turns=m;
  if(turns%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}