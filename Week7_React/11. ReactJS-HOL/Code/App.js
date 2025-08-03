import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(0);

  // Function to increment counter
  const increment = () => {
    setCounter(prev => prev + 1);
    sayHello();
    showMessage();
  };

  const decrement = () => {
    setCounter(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello!");
  };

  const showMessage = () => {
    alert("You clicked Increase!");
  };

  // Function with argument
  const greet = (message) => {
    alert(`Message: ${message}`);
  };

  // Synthetic event
  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="App" style={{ padding: '20px', textAlign: 'center' }}>
      <h1>🧪 Event Examples App</h1>

      <h2>Counter: {counter}</h2>
      <button onClick={increment}>Increase</button>
      <button onClick={decrement} style={{ marginLeft: '10px' }}>Decrease</button>

      <br /><br />

      <button onClick={() => greet("Welcome")}>Say Welcome</button>

      <br /><br />

      <button onClick={handleClick}>OnPress</button>

      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
