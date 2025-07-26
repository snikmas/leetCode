

function Node(data) {
  this.data = data;
  this.next = null;
}

function getNth(node, index) {
  // Your code goes here.
  
  count = 0;
  if (index < 0) throw new Error("Invalid index");
  for(let i = node; i != null; i = i.next){
    if(count == index) return i
    count++;
  }
  
  // Index out of bounds
  throw new Error("Index out of range");
  
}

