import axios from "axios";
import { useEffect, useState } from "react";
import { URL } from "../config";
import "../CSS/Feedback.css";

function Feedback() {
  return (
    <div className="feedback-container">
      <h1>Feedback Form</h1>
      <textarea id="feedbackTextarea" placeholder="Write your feedback here..."></textarea>
      <div className="button-container">
        <button id="addButton">Add Feedback</button>
        <button id="editButton">Edit Feedback</button>
        <button id="submitButton">Submit Feedback</button>
      </div>
    </div>
  );
}
export default Feedback;