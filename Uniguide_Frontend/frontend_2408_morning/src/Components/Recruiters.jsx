import React, { useState } from 'react';
import axios from 'axios';
import { URL } from '../config';
import { useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import "../CSS/Recruiters.css"





const Recruiters = () => {
    const [recruiterList, setRecruiterList] = useState([]);
    const navigate = useNavigate()
  const [formData, setFormData] = useState({
    recuEndDate: '',
    recuJobDesc: '',
    recuJobProfile: '',
    recuLink: '',
    recuName: '',
    recuRegDate: '',
  });
 
  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSubmit = (event) => {
    event.preventDefault();



    setRecruiterList((prevList) => [...prevList, formData]);
    setFormData({
      recuEndDate: '',
      recuJobDesc: '',
      recuJobProfile: '',
      recuLink: '',
      recuName: '',
      recuRegDate: '',
    });
    
    event.preventDefault();

      try {
          console.log(formData);
       axios.post(`${URL}/recruitment/`, formData).then((response) => {
          const result = response.data
           const status = response.status
             console.log(result);
         
        if (status === 200) {
            toast.success('Data added successfully')
            navigate("/recruitlist")
     
         } else {
            toast.warning('Data not added')
                navigate('/recruit')
            }
          
        })
        .catch(); {
       //   navigate('/login')
      }
    } catch (error) {
      console.error('Error adding event:', error);
    }
  };
    
   

  return (
    <div className="recruiters-page">
      <h2>Recruiters Page</h2>
      <form className="recruiter-form" onSubmit={handleSubmit}>
        <label>
          Recruiter End Date:
          <input
            type="date"
            name="recuEndDate"
            value={formData.recuEndDate}
            onChange={handleInputChange}
            className={formData.recuEndDate.length ? '': 'error'}
            required 
            
          />
        </label>
        <br />
        <label>
          Recruiter Job Description:
          <textarea
            id='desc'
            name="recuJobDesc"
            value={formData.recuJobDesc}
            onChange={handleInputChange}
            className={formData.recuJobDesc.length ? '': 'error'}
            required
          />
        </label>
        <br />
        <label>
          Recruiter Job Profile:
          <input
            type="text"
            name="recuJobProfile"
            value={formData.recuJobProfile}
            onChange={handleInputChange}
            className={formData.recuJobProfile.length ? '': 'error'}
            required
          />
        </label>
        <br />
        <label>
          Recruiter Link:
          <input
            type="text"
            name="recuLink"
            value={formData.recuLink}
            onChange={handleInputChange}
            className={formData.recuLink.length ? '': 'error'}
            required
          />
        </label>
        <br />
        <label>
          Recruiter Name:
          <input
            type="text"
            name="recuName"
            value={formData.recuName}
            onChange={handleInputChange}
            className={formData.recuName.length ? '': 'error'}
            required
          />
        </label>
        <br />
        <label>
          Recruiter Registration Date:
          <input
            type="date"
            name="recuRegDate"
            value={formData.recuRegDate}
            onChange={handleInputChange}
            className={formData.recuRegDate.length ? '': 'error'}
            required
          />
        </label>
        <br />
        <div className="addrecruiters-center-button">
        <center>       
        <button align="center" type="submit">Add Recruiter</button>
        </center>       
        </div>
      </form>
      <center></center>
    </div>
  );
};

export default Recruiters;


