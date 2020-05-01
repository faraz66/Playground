 #include<iostream>
#include<string>
using namespace std; 
int main() 
{ 
    string name;
  getline(cin,name);
    int i;
    for(i = name.length() - 1; i >= 0; i--)
    {
        cout<<name[i];
    }
    return 0;

}