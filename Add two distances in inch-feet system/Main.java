#include<iostream>
using namespace std;
struct height
{
  int feet;
  float inch;
};

int main()
{
  height h1,h2,sum;
  cin>>h1.feet>>h1.inch;
  cin>>h2.feet>>h2.inch;

  sum.feet=h1.feet+h2.feet;
  sum.inch=h1.inch+h2.inch;
  if(sum.inch>=12.0)
  {
    ++sum.feet;
    sum.inch-=12.0;
  }
  
  cout<<sum.feet<<"'-"<<sum.inch<<"\"";
}