
bool isSubsequence(char* s, char* t) {
   
  int n = strlen(s); // abc and ahbgdc
  int m = strlen(t); // n = 3; m = 6

  int j = 0; // j = 0;
  for(int i = 0; i < m && j < n; i++){ // i < m/6 && j < n/3 (n - small string)
    if(s[j] == t[i]) j++; // if small string == big string, j++ for small/ stop it if n == max
  }



  return (j == n); 
}