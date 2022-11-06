const outside = 'foo';

(function() {
  const inside = 'bar';

  console.log(outside); // 'foo'
  console.log(inside); // 'bar'
})();

console.log(outside); // 'foo'
// console.log(inside); // ReferenceError

// const outside = 'foo';

// This only works for block-scope variables (i. e. `const` and `let`).
{
  const inside = 'bar';

  console.log(outside); 'foo'
  console.log(inside); 'bar'
}

console.log(outside); // 'foo'
console.log(inside); // ReferenceError
