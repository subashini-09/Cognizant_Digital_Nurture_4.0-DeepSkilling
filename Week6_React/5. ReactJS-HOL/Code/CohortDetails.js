import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = (props) => {
  const { name, trainer, status, startDate, endDate } = props;

  return (
    <div className={styles.box}>
      <h3 style={{ color: status === 'ongoing' ? 'green' : 'blue' }}>{name}</h3>
      <dl>
        <dt>Trainer:</dt>
        <dd>{trainer}</dd>

        <dt>Status:</dt>
        <dd>{status}</dd>

        <dt>Start Date:</dt>
        <dd>{startDate}</dd>

        <dt>End Date:</dt>
        <dd>{endDate}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
