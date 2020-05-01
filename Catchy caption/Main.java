#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   char c[100];
  cin.getline(c,100);
  int len=strlen(c);
  int white_spaces;
  for(int i=0;c[i];++i)
    if(c[i]==' ')
      white_spaces++;
  if(len<=100 && white_spaces<=10)
    cout<<"Caption eligible for the contest";
   else
     cout<<"Caption not eligible for the contest";
}