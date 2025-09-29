// ANSWERS FOR: 1 2 3 4 6 10 11 12 13 

//1  What is recursion and give an exmaple using js

// Reucrsion is a programming techique where a function calls itself in order to solve a problem. Every calls breaks the problem into smaller subprolems until it reaches a base case, which stops the recursion

// Key Poitns:
// you need a base case to prevent infinite recursion

// example
function factorial(n){
  if (n == 0) return 1; // base case
  else {
    return n * facotrial(n - 1)

  }
}

// ================================================
// ================================================
// ================================================

// 2 What are types (js)?

// Types in Js are different categories of values that variables can hold; Js is a dynamically typed language, means that variables can hold any type of data and the type can change during runtime

// JS has 7 built-in data types: 
// 1. Primitive Types
// Number; String; Boolean; Undefined (was declared but not assigned); Null; Symbol and Bigint
// 2. Object Types: Object (collection of key-value pairs/arrays/functions/dates/etc) and Function(special kind of it, can be invoked/called)


// ================================================
// ================================================
// ================================================


// 3 What are data structures?
// A data structure is simply an organized way of storing data for use by computer processes. It is a pattern of collecting and organizing data for performing various operations correctly and efficiently.

// Importance:
// 1. helo manage larrge amounts of data
// 2. Optimize perfomance of algorithms
// 3. Enable solving complex problems efficiently

// Common types: 
// Arrays/Linked Lists/Stacks/Queues/Trees/Graphs/Hash Tables


// ================================================
// ================================================
// ================================================


// 4 What is an algorithm?
// An algorithm is an instruction step-by-step for solving a particular problem

// Key Points:
// Input- An algorithm must possess 0 or more well-defined inputs supplied externally to the algorithm.
// Output- An algorithm should have 1 or more well-defined outputs as desired.
// Correctness- Every step of the algorithm must generate a correct output.
// Definiteness-Algorithms should be clear and unambiguous, thus every step of the algorithm should be clear and well defined.
// Finiteness- The algorithm should have a finite number of steps that must be carried out to achieve the task at hand.


// ================================================
// ================================================
// ================================================

// 6	  What is polymorphism?

// Polymorphism is a concept in object-oriented programming that allows objects of different classes to be treated as one superclass. It means one method can work in different ways depending on the object that calls it.

// There are two types:

// Compile-time polymorphism (method overloading): same method name, different parameters.

// Runtime polymorphism (method overriding): a child class changes the behavior of a method from its parent class.

// Polymorphism helps make code easier to manage and extend by allowing objects to be used interchangeably while doing their own specific actions.


// ================================================
// ================================================
// 8-9 QUESTIONS IN THE SEPARATE FILE
// ================================================
// ================================================


// ================================================
// ================================================
// ================================================

// 9	  What is a Doubly Linked List

// A Doubly Linked List is a data structure, the same as Linked List, but unlike the first one, it also stores pointer to the previous node


// ================================================
// ================================================
// ================================================


// 10 What is a Queue

// A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. This means the first element added to the queue is the first one to be removed. It’s like a line at a store — the person who arrives first is served first.

// Queues support two main operations:
// Enqueue — adding an element to the back of the queue
// Dequeue — removing an element from the front of the queue

// Queues are used in many places like task scheduling, breadth-first search algorithms, and buffering data streams.


// ================================================
// ================================================
// ================================================


// 11 What is a Stack

// A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. This means the last element added to the stack is the first one to be removed. Imagine a stack of plates — you add and remove plates from the top.

// The two main operations in a stack are:
// Push — adding an element to the top of the stack
// Pop — removing the top element from the stack

// Stacks are used in many areas such as function call management, undo mechanisms, and expression evaluation.


// ================================================
// ================================================
// ================================================

// 12 what is a hash table

// A hash table is a data structure that stores key-value pairs and allows for fast data retrieval. It uses a hash function to convert a key into an index in an underlying array, where the corresponding value is stored.

// Because the hash function computes the index directly, lookup, insertion, and deletion operations can be very efficient — typically O(1) on average.

// Hash tables handle cases where different keys produce the same index (called collisions) using methods like chaining (linked lists) or open addressing.

// They are widely used in databases, caches, and implementing associative arrays or dictionaries.


// ================================================
// ================================================
// ================================================

// 13 what is a heap

// A heap is a special tree-based data structure that satisfies the heap property:

// In a max-heap, each parent node is greater than or equal to its children.

// In a min-heap, each parent node is less than or equal to its children.

// Heaps are commonly implemented as complete binary trees, often stored in arrays.

// They are mainly used to implement priority queues, where the highest (or lowest) priority element can be quickly accessed and removed.

// Heap operations like insert and extract take O(log n) time.