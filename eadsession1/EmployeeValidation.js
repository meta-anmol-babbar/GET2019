function EmplyeeForm(){
    var empFromdiv = document.getElementById("empForm");
    var togbutton=document.getElementById("Submit")
    var password=document.getElementById("password").value;  
    var confirmPassword=document.getElementById("confirmpassword").value; 
    var email=document.getElementById("email").value;
    var namereg=/^[A-Za-z][A-Za-z]+/;
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    var name = document.getElementById("name").value;
    var empId=Math.floor(Math.random() * 100);
    oFormObject = document.forms['v'];

    if(namereg.test(name)==false){
      alert('Enter avalid name');
    }
    else if (reg.test(email) == false) 
    {
        alert('Invalid Email Address');
    }
    else if(password!=confirmPassword) {
      alert('Passwords Do Not Match');
    }
    else{
     empFromdiv.style.display = "none";
     togbutton.innerHTML= "Show Element";
     alert("Congrats! \nYour account is created...! \nYour Employee Id is " + empId);
     oFormElement = oFormObject.elements["empId"].value=empId;


    } 
}