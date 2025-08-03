import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = () => {
    const euroValue = (parseFloat(rupees) / 90).toFixed(2); // Example rate: ₹90 = €1
    setEuro(euroValue);
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h2>Currency Convertor</h2>
      <input
        type="number"
        placeholder="Enter amount in Rupees"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit} style={{ marginLeft: '10px' }}>
        Convert
      </button>

      {euro && (
        <p style={{ marginTop: '10px' }}>
          💶 Euro Equivalent: <strong>€{euro}</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConvertor;
