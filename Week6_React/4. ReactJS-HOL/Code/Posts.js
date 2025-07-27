import React, { Component } from 'react';
import Post from './Post'; // ✅ This is your data model class

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  // ✅ Fetch and convert each post into a Post class instance
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error('Failed to fetch posts');
        }
        return response.json();
      })
      .then(data => {
        const postObjects = data.slice(0, 10).map(
          item => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        console.error('Fetch error:', error);
        this.setState({ hasError: true });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.error('Caught in componentDidCatch:', error, info);
    alert('An error occurred while displaying posts.');
    this.setState({ hasError: true });
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h2>Error loading posts. Try again later.</h2>;
    }

    return (
      <div>
        <h2>Blog Posts</h2>
        {posts.map(post => (
          <div key={post.id} style={{ border: '1px solid #ccc', padding: '15px', marginBottom: '10px' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
