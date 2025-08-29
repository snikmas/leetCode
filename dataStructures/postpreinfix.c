#include <ctype.h>
#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int infixToPostfix(char *input, char *output){

    char stack[99];
    int lenSt = -1;
    int lenI = strlen(input);
    int lenO = -1;

    for(int i = 0; i < len; i++){
        if(isalpha(input[i])) output[++lenO] = input[i];
        else {
            if(input[i] == '(' && lenSt != -1){
                // stack[++lenSt] = input[i];
                push(input[i]); // push to the stack
            } else if(input[i] == '/' || input[i] == '*'){
                // stack[++lenSt] = input[i];
                char a = pop() // pop from the stack
                push(a); // push to the stack
                
            } else if((input[i] == '+' || input[i] == '-') && (stack[lenSt - 1] != '*' || stack[lenSt - 1] != '/')){
                // stack[++lenSt] = input[i];
                char a = pop() // pop from the stack
                push(a); // push to the stack
            } else if(input[i] != ')'){
                // a case if in the stack /* and we now got + / -
                // 1. have to output stack until */
                // 2. put
                while(stack[lenSt - 1] == '-' || stack[lenSt - 1] == '+'){
                    // output[++lenO] = stack[--lenSt];
                    char a = pop() // pop from the stack
                    push(a); // push to the output
                }
                // stack[++lenSt] = input[i];
                
                char a = pop() // pop from the stack
                push(a); // push to the output
                
            } else {
                // a case with )
                while(stack[lenSt - 1] != '('){
                    output[++lenO] = stack[--lenSt];
                }
                lenSt--;
            }
        }

    }
}

int main(void){
    
    // postfix prefix infix
    // A + B
    // (A + B) * C
    // A + B * C
    // (A - B) / (C + D)
    // A * (B + C) - D / E
    char input[99];
    char output[99]
    printf("Input: ");
    scanf("%s", input);
    postfix(input, output);
        
    
    return 0;
}