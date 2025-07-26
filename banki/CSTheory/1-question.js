// What is recursion and give an exmaple using js

// Reucrsion is a programming techique where a function calls itself in order to solve a problem. Every calls breaks the problem into smaller subprolems until it reaches a base case, which stops the recursion

// Key Poitns:
// you need a base case to prevent infinite recursion

// example
function facotrial(n){
  if (n == 0) return 1; // base case
  else {
    return n * facotrial(n - 1)

  }
}