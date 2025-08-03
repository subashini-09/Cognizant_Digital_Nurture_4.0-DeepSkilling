// src/FlightList.js
import React from 'react';

const FlightList = ({ showBooking = false }) => {
  const flights = [
    { id: 1, from: 'Chennai', to: 'Delhi', price: 4500 },
    { id: 2, from: 'Bangalore', to: 'Mumbai', price: 4000 },
    { id: 3, from: 'Kolkata', to: 'Goa', price: 4700 },
  ];

  const bookNow = (flight) => {
    alert(`Ticket booked from ${flight.from} to ${flight.to} for ₹${flight.price}`);
  };

  return (
    <div>
      <h3>Available Flights:</h3>
      <table style={{ margin: 'auto', borderCollapse: 'collapse' }}>
        <thead>
          <tr>
            <th>From</th>
            <th>To</th>
            <th>Price (₹)</th>
            {showBooking && <th>Action</th>}
          </tr>
        </thead>
        <tbody>
          {flights.map((flight) => (
            <tr key={flight.id}>
              <td>{flight.from}</td>
              <td>{flight.to}</td>
              <td>{flight.price}</td>
              {showBooking && (
                <td>
                  <button onClick={() => bookNow(flight)}>Book Now</button>
                </td>
              )}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default FlightList;
