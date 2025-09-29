// Event Delegation in JS
//
// A technique where you attach a signle event listener to a parent element instead of adding listeners to each child element individually. Works cuz of event bubble up the DOM tree
//
// What for?
// 1. Better perfomance: fewer listeners = faster
// 2. Dynamic content: Works for elements added after page load
// 3. Cleaner code
//
// How It works? 
// 1. attach listener to a common ancestor (ul/table/doc) <- общий родитель
// 2. in the handler: use event.target to chech which child element was interacted with
// 3. optionally filter the event using matches() or closest()