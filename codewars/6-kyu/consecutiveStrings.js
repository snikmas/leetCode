
function longestConsec(strarr, k) {
    // your code
  if (strarr.length == 0) return ''
  let longest = '';
  for(let i = 0; i <= strarr.length - (k); i++){
    let str = ''
    for(let ii = i; ii < i + k; ii++){
      str = str.concat('', strarr[ii]) 
    }
    if(str.length > longest.length) longest = str;
  }
  
  return longest
}
console.log(longestConsec(["zone", "abigail", "theta", "form", "libe", "zas"], 2))
console.log(longestConsec(["ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"], 1))
console.log(longestConsec([], 3))
console.log(longestConsec(["itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"], 2))
console.log(longestConsec(["wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"], 2))
console.log(longestConsec(["zone", "abigail", "theta", "form", "libe", "zas"], -2))
console.log(longestConsec(["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"], 3))
console.log(longestConsec(["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"], 15))
console.log(longestConsec(["it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"], 0))