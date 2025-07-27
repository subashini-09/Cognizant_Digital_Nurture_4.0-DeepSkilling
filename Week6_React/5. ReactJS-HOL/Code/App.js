import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails
        name="React Bootcamp"
        trainer="John Doe"
        status="ongoing"
        startDate="2025-07-01"
        endDate="2025-07-30"
      />
      <CohortDetails
        name="NodeJS Basics"
        trainer="Jane Smith"
        status="completed"
        startDate="2025-06-01"
        endDate="2025-06-30"
      />
    </div>
  );
}

export default App;
