//  What is a Linked List

// THEORY:  
// A linked list is a data structure consisting of a sequence of nodes, where each node contains data and a pointer to the next node in the sequence.
//Unlike arrays, linked lists do not store elements contiguously in memory; instead, nodes are connected via pointers

// Time Complexity (Big O)
// Unlike arrays again, accessing an element by index takes O(n) time: you need to traverse through list sequentially from the start. Array's time complexity is O(1) (direct index)

// Types: Single, Double, Circular

// Advantages: 
// 1. can easily grow during runtime
// 2. adding/removing nodes is faster than arrayas
// Disadvantages:
// 1. No random access: time complexity problem
// 2. For node you need more memory: data + pointer

// When to use: 
// 1. Need frequently insert/delete data
// 2. don't know how many elements need to store
// 3. need dynamic memory allocation

// IMPLEMENTATION in Js:

// Our Node:

class Node {
  constructor(data){
    this.data = data
    this.next = null;
  }
}

// LinkedList:
class LinkedList{
  constructor(){
    this.head = null;
  }
}

let userPrompt;

function addNode(data, myList){
  let newNode = new Node(data);
  newNode.next = myList.head;
  myList.head = newNode;

  return myList;
}

function output(myList){
  for(let i = myList; i.next != null; i = i.next){
    console.log(i.data);
  }
}


let myList = new LinkedList();

while(true){
  userPrompt = prompt("input data (number) (Exit to quit): ");

  if(userPrompt == "Exit") break;

  myList = addNode(userPrompt, myList)

  output(myList);
}