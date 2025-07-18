char* gcdOfStrings(char* str1, char* str2) {
 
  // 1 allocate str1str2
  int len1 = strlen(str1);
  int len2 = strlen(str2);
  char *str1str2 = malloc(sizeof(char) * (len1 + len2));
  char *str2str1 = malloc(sizeof(char) * (len1 + len2));
  
  strcpy(str1str2, str1);
  strcat(str1str2, str2);

  strcpy(str2str1, str2);
  strcat(str2str1, str1);

  if(strcmp(str2str1, str1str2) == 0){
    free(str1str2);
    free(str2str1);
    return "";
  }

  while(len1 > 0){
    int temp = len1;
    len1 = len2 % len1;
    len2 = temp;
  }

  char *result = malloc(sizeof(char) * (len2 + 1));
  strcat(result, str1str2, len2);
  result[len2] = '\0';

  return 0;
}