// src/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Kohli', 'Pant', 'Pandya', 'Jadeja', 'Shami'];
  const evenTeam = ['Rohit', 'Gill', 'Rahul', 'Bumrah', 'Chahal', 'Surya'];

  // Destructuring
  const [odd1, odd2, ...restOdd] = oddTeam;
  const [even1, even2, ...restEven] = evenTeam;

  const T20players = ['Rohit', 'Surya', 'Pant'];
  const RanjiPlayers = ['Pujara', 'Saha', 'Iyer'];

  // Merge arrays
  const allPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        {restOdd.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        {restEven.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h3>Merged List (T20 + Ranji Trophy Players)</h3>
      <ul>
        {allPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
