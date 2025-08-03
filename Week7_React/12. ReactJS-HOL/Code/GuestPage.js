// src/GuestPage.js
import React from 'react';
import FlightList from './FlightList';

const GuestPage = () => {
  return (
    <div>
      <h2>Welcome Guest! You can only browse available flights.</h2>
      <FlightList />
    </div>
  );
};

export default GuestPage;
