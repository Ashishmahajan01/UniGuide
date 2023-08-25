import React, { useState, useEffect } from 'react';
import axios from 'axios'; // You'll need to have Axios or another HTTP client installed

function ProfileSidebar() {
  const [profileData, setProfileData] = useState({});
  const [isSidebarOpen, setIsSidebarOpen] = useState(false);

  useEffect(() => {
    
    fetchProfileData();
  }, []);

  const fetchProfileData = async () => {
    try {
      const response = await axios.get('/api/profile'); 
      setProfileData(response.data);
    } catch (error) {
      console.error('Error fetching profile data:', error);
    }
  };

  const toggleSidebar = () => {
    setIsSidebarOpen(!isSidebarOpen);
  };

  return (
      <div>
          {/* style={{ display: 'flex', justifyContent: 'flex-end', paddingRight: '20px' }} */}
      <div >
        {/* Profile icon in the navbar */}
        <button onClick={toggleSidebar}>
          {isSidebarOpen ? 'Close Profile' : 'Open Profile'}
        </button>
      </div>

      {/* Profile sidebar */}
      {isSidebarOpen && (
        <div className="profile-sidebar" >
          <h2>Profile</h2>
          <p>User ID: {profileData.userId}</p>
          <p>Email: {profileData.email}</p>
          <p>Role: {profileData.role}</p>
          <p>User Name: {profileData.userName}</p>
          <button>Change Password</button>
          {/* <button onClick={toggleSidebar}>Close</button> */}
        </div>
      )}

      {/* The rest of your page content */}
      {/* ... */}
    </div>
  );
}

export default ProfileSidebar;
