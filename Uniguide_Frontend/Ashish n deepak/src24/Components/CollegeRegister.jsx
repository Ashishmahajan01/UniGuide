import React from 'react';
import { useForm } from 'react-hook-form';
import Dropzone from 'react-dropzone';
import '../CSS/CollegeRegistration.css';

const CollegeRegister = () => {

    const { register, handleSubmit } = useForm();

    const onSubmit = data => {
        console.log(data);
    };
  return (
    <div style={{marginTop:"20px",marginBottom:"20px"}}>
       <div className="registration-container">
            <h2>College Registration</h2>
            <form onSubmit={handleSubmit(onSubmit)}>
                <label>Name:</label>
                <input type="text" {...register('name')} />

                <label>Description:</label>
                <textarea {...register('description')} />

                <label>City:</label>
                <input type="text" {...register('city')} />

                <label>State:</label>
                <input type="text" {...register('state')} />

                <label>University:</label>
                <select {...register('university')}>
                    <option value="university1">University 1</option>
                    <option value="university2">University 2</option>
                    {/* Add more options */}
                </select>

                <label>College Image:</label>
                <Dropzone>
                    {({ getRootProps, getInputProps }) => (
                        <div className="dropzone" {...getRootProps()}>
                            <input {...getInputProps()} />
                            <p>Drag & drop an image here, or click to select one</p>
                        </div>
                    )}
                </Dropzone>

                <label>College Website:</label>
                <input type="text" {...register('website')} />

                <button type="submit">Register</button>
            </form>
        </div>
    </div>
  )
}

export default CollegeRegister
