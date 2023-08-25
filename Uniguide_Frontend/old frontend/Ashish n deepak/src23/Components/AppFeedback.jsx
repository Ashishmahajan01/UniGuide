import React, { useState } from 'react';
import axios from 'axios';
import { URL } from '../config';
import { useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { ToastContainer } from 'react-toastify';
import "../CSS/AppFeedbackForm.css";

const AppFeedbackForm = () => {
    const [feedbackList, setFeedbackList] = useState([]);
     const navigate = useNavigate()
  const [formData, setFormData] = useState({
   appfeedId: '',
      appfeedDate: '',
      appfeedDesc: '',
      appfeedRating: '',
      userId: '',
  });

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
    };

   const handleStarClick = (ratingValue) => {
    setFormData((prevData) => ({
      ...prevData,
      appfeedRating: ratingValue,
    }));
    };

    
  const handleSubmit = async (event) => {
    event.preventDefault();
    setFeedbackList((prevList) => [...prevList, formData]);
    setFormData({
      appfeedId: '',
      appfeedDate: '',
      appfeedDesc: '',
      appfeedRating: '',
      userId: '',
    });
      
    event.preventDefault();
      try {
          console.log(formData);
       axios.post(`${URL}/appfeedback/`, formData).then((response) => {
           const status = response.status
        if (status === 200) {
            toast.success('Feedback Submitted succcessfully')
            navigate('/home')
         } else {
                navigate('/appfeedback')
            }
          
        })
        .catch(); { }
    } catch (error) {
      console.error('Error adding event:', error);
    }
  };
  const handleEdit = (index) => {
    const editedFeedback = feedbackList[index];
    setFormData(editedFeedback);
  };
const ratingIcons = ['★', '★', '★', '★', '★'];
  return (
    <div className="app-box app-feedback-form " style={{alignSelf:'center',margin:'auto',marginTop:'10px',marginBottom:"10px"}}>
                <h2 className="app-heading1">Application Feedback</h2><br></br><br></br>
                    <form onSubmit={handleSubmit} className="app-feed-form">
                    {/* <label>
                    ID:
                    <input
                        type="text"
                        name="appfeedId"
                        value={formData.appfeedId}
                        onChange={handleInputChange}
                    />
                    </label>
                    <br /> */}
                    <label className="label">
                    Date:
                    <input
                        type="date"
                        name="appfeedDate"
                        value={formData.appfeedDate}
                        onChange={handleInputChange}
                    />
                    </label>
                    <br />
                    <label>
                    Description:
                    <textarea
                        name="appfeedDesc"
                        value={formData.appfeedDesc}
                        onChange={handleInputChange}
                    />
                    </label>
                    <br />
                    <label className="label">
                    {/* Rating:
                    <input
                        type="number"
                        name="appfeedRating"
                        min="1"
                        max="5"
                        value={formData.appfeedRating}
                        onChange={handleInputChange}
                    /> */}Rating:
                    <div className="app-star-rating">
                        {[1, 2, 3, 4, 5].map((value) => (
                        <span
                            key={value}
                            className={`app-star ${value <= formData.appfeedRating ? 'filled' : ''}`}
                            onClick={() => handleStarClick(value)}
                        >
                            ★
                        </span>
                        ))}
                    </div>
                    </label>
                    <br />
                    <label className="label">
                    User ID:
                    <input
                        type="text"
                        name="userId"
                        value={formData.userId}
                        onChange={handleInputChange}
                    />
                    </label>
                    <br />
                    <center><button type="submit" className="button">Submit Feedback</button></center>
                </form>
                {/* <h2>Feedback List</h2> */}
                <ul>
                    {feedbackList.map((feedback, index) => (
                    <li key={index}>
                        <p>ID: {feedback.appfeedId}</p>
                        <p>Date: {feedback.appfeedDate}</p>
                        <p>Description: {feedback.appfeedDes}</p>
                        <p>Rating: {feedback.appfeedRating}</p>
                        <p>User ID: {feedback.userId}</p>
                        <button onClick={() => handleEdit(index)}>Edit</button>
                    </li>
                    ))}
                </ul>
    </div>
  );
};

export default AppFeedbackForm;