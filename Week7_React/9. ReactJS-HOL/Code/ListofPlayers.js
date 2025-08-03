
import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 85 },
    { name: 'Rohit Sharma', score: 92 },
    { name: 'Rishabh Pant', score: 68 },
    { name: 'KL Rahul', score: 77 },
    { name: 'Hardik Pandya', score: 40 },
    { name: 'Shubman Gill', score: 73 },
    { name: 'Ravindra Jadeja', score: 55 },
    { name: 'Jasprit Bumrah', score: 35 },
    { name: 'Mohammed Shami', score: 80 },
    { name: 'Suryakumar Yadav', score: 74 },
    { name: 'Yuzvendra Chahal', score: 66 },
  ];

  // Using map to display
  const playerList = players.map((player, index) => (
    <li key={index}>{player.name} - {player.score}</li>
  ));

  // Filter score < 70
  const lowScorers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>

      <h3>Players with score less than 70</h3>
      <ul>
        {lowScorers.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
