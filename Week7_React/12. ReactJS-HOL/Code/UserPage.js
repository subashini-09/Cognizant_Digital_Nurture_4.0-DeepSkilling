// src/UserPage.js
import React from 'react';
import FlightList from './FlightList';

const UserPage = () => {
  return (
    <div>
      <h2>Welcome User! You can book tickets.</h2>
      <FlightList showBooking={true} />
    </div>
  );
};

export default UserPage;
