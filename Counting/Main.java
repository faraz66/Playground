#include<iostream>
using namespace std;
#include<string>
int main()
{
  string s;
  getline(cin,s);
  int digits,vowels,consonants,white_spaces,symbols;
  digits=vowels=consonants=white_spaces=symbols=0;
  for(int i=0;s[i];++i)
  {
    if(s[i]>='0' && s[i]<='9')
      digits+=1;
    else if(s[i]==' ')
      white_spaces+=1;
    else if(s[i]=='a' || s[i]=='e' || s[i]=='i'|| s[i]=='o' || s[i]=='u')
      vowels+=1;
	else if(s[i]=='A' || s[i]=='E' || s[i]=='I'|| s[i]=='O' || s[i]=='U')
      vowels+=1;
    else if((s[i]>='a'&& s[i]<='z') || (s[i]>='A'&& s[i]<='Z'))
      consonants+=1;
    else
      symbols+=1;
  }
   cout << "Vowels:" << vowels << endl;
    cout << "Consonants:" << consonants << endl;
  cout << "White Spaces:" << white_spaces << endl;
    cout << "Digits:" << digits << endl;
  cout << "Symbols:" << symbols << endl;
    
  
}