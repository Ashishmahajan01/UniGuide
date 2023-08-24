import React, { useState, useEffect } from 'react';



const University = () => {
    const[Universities,setUniversities]=useState([]);

    const hardcodedImageURL="data:image/jpeg;base64,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"

   const getData=async()=>{
        const response= await fetch('http://localhost:8080/university/');
        setUniversities( await response.json());
        console.log(response.data);
    }

    useEffect(() => {
        getData();
      }, []);
  return (
    <div>
      <div>
    <h2 align="center">List of Universities</h2>
    <div className="container-fluid mt-5 " >
        <div className="row text-center" >
            
        {

         Universities.map((curElem) => {
                
                     const { uniImage, uniName, uniDescription,uniId,uniAddress, uniCity,uniWebsite } = curElem;
                return (
                      <div className="col-10 col-md-4 mt-5" key={uniId} style={{marginBottom:"50px"}} >
              <div className="card p-2">
                        <div className="d-flex align-items-center" >
                                <div className="image"> <img src={ hardcodedImageURL } className="rounded" width="155" /> </div>
                            <div className="ml-3 w-100 " style={{alignContent:""}}>
                                    <h3 className="mb-0 mt-0 textLeft">{uniName}</h3>
                                    <br></br>
                                    <ul>
                                    <li><span className="text-left"><b> Address :</b>{uniAddress }</span></li>
                                    <li><span className="text-left"> <b>College Description :</b> {uniDescription }</span></li>

                                    </ul>                              
                            </div>
                     </div>
                  </div>
            </div>
                )
        })        

        }
            
        </div>
    </div>
</div>
    </div>
  )
}

export default University;
