 #include <string.h>
 #include <iostream>
 using namespace std;
#include <bits/stdc++.h>

bool isPalindrom(string s){
	string cleans="";
    transform(s.begin(), s.end(), s.begin(), ::toupper);
    //get just alpha character
	for(int i=0 ;i<s.size();i++){
		if(isalpha(s[i])){
			s.push_back(s[i]) ;
		}
	}
	bool isPal=true;
	for(int i=0;i<cleans.size();i++){
		if(cleans[i]!=cleans[cleans.size()-i-1]){
			isPal=false ;
			break;
		}
	}
	return isPal ;
}
int main(){
	cout<<isPalindrom("rada,r");
	return 0 ;
}
