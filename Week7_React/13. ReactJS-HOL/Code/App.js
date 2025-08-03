import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [selected, setSelected] = useState('book');
  const [showCourse, setShowCourse] = useState(true);
  const showNothing = false;

  // 1. Function-based rendering
  const renderSelectedComponent = () => {
    if (selected === 'book') return <BookDetails />;
    else if (selected === 'blog') return <BlogDetails />;
    else if (selected === 'course') return <CourseDetails />;
    else return <p>No Selection</p>;
  };

  return (
    <div className="App" style={{ textAlign: 'center', padding: '20px' }}>
      <h1>📝 Blogger App</h1>

      <div style={{ marginBottom: '20px' }}>
        <button onClick={() => setSelected('book')}>Book</button>
        <button onClick={() => setSelected('blog')} style={{ marginLeft: '10px' }}>Blog</button>
        <button onClick={() => setSelected('course')} style={{ marginLeft: '10px' }}>Course</button>
      </div>

      <hr />

      {/* 1. Ternary Operator */}
      <h2>1. Ternary Rendering</h2>
      {selected === 'book' ? <BookDetails /> : <p>Not viewing books.</p>}

      {/* 2. Logical AND */}
      <h2>2. Logical && Rendering</h2>
      {showCourse && <CourseDetails />}

      {/* 3. If-Else via Function */}
      <h2>3. Function-based Rendering</h2>
      {renderSelectedComponent()}

      {/* 4. Switch Statement */}
      <h2>4. Switch Rendering</h2>
      {{
        book: <BookDetails />,
        blog: <BlogDetails />,
        course: <CourseDetails />
      }[selected] || <p>No match</p>}

      {/* 5. IIFE Rendering */}
      <h2>5. IIFE Inline Rendering</h2>
      {(() => {
        if (selected === 'book') return <BookDetails />;
        if (selected === 'blog') return <BlogDetails />;
        if (selected === 'course') return <CourseDetails />;
        return <p>Nothing selected</p>;
      })()}

      {/* 6. False short-circuit */}
      <h2>6. False Condition Rendering</h2>
      {showNothing && <p>This will not be shown</p>}
    </div>
  );
}

export default App;
