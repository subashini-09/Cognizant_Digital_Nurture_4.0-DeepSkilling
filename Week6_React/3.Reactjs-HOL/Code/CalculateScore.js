import React, { useState } from 'react';
import '../Stylesheets/mystyle.css';  // ✅ Import stylesheet

function CalculateScore() {
  const [name, setName] = useState('');
  const [school, setSchool] = useState('');
  const [total, setTotal] = useState('');
  const [goal, setGoal] = useState('');
  const [average, setAverage] = useState(null);

  const handleCalculate = () => {
    if (!isNaN(total) && total !== '') {
      const avg = parseFloat(total) / 5;
      setAverage(avg.toFixed(2));
    } else {
      setAverage('Invalid total');
    }
  };

  return (
    <div className="form-container">
      <h2>Student Score Calculator</h2>

      <input
        type="text"
        placeholder="Enter Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />

      <input
        type="text"
        placeholder="Enter School"
        value={school}
        onChange={(e) => setSchool(e.target.value)}
      />

      <input
        type="number"
        placeholder="Enter Total Marks (out of 500)"
        value={total}
        onChange={(e) => setTotal(e.target.value)}
      />

      <input
        type="text"
        placeholder="Enter Goal"
        value={goal}
        onChange={(e) => setGoal(e.target.value)}
      />

      <button onClick={handleCalculate}>Calculate Average</button>

      {average && (
        <div className="result">
          <h3>Student Details:</h3>
          <p><strong>Name:</strong> {name}</p>
          <p><strong>School:</strong> {school}</p>
          <p><strong>Total Marks:</strong> {total}</p>
          <p><strong>Goal:</strong> {goal}</p>
          <p><strong>Average Score:</strong> {average}</p>
        </div>
      )}
    </div>
  );
}

export default CalculateScore;
