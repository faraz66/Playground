//Example reads in two strings (w/out spaces) and compares them for equality
#include <cstring>
#include <iostream>
using namespace std;
int main()
{
    char *str1=new char[20];
    char *str2=new char[20];
    cin>>str1;
    cin>>str2;
    if(!strcmp(str1, str2))
        cout<<"It is correct";
       else
       cout<<"It is wrong";
}