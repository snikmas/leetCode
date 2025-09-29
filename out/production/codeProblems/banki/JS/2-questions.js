// how this works in js

// this in js refects to the context in which a function is executed. it points to the object that is currently owning or invoking the funciton
// how this is determined depends on how the function is called:

// 1. global context: in the globa; scope, this refers to the global object (window in browsers)
// 2. function call: in a regular function (non-strict mode), this refers to the global object. in strict mode, it's undefined
// 3. method call: when a funciton is called as a  method of an object, this refers to that object
// 4. constructor call: inside a constructor funciton called with new, this refers to the newly created instance
// 5. arrow functions arrow functions do not have their own this. instead they inherit this from the surrounding lexical context
// 6. explixit binding: this can be eplixity set usign call appy bind()()()