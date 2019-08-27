function vehicleForm(){
    var vehicleFromdiv = document.getElementById("vehicleForm");
    var togbutton=document.getElementById("submit");
    var namereg=/^[A-Za-z][A-Za-z]+/;
    var name = document.getElementById("vname").value;
    var vehicleNumber=document.getElementById("vnumber").value;
    var vehicleType;
    var type = [];
    type  = document.getElementsByName("vtype");            
    for(i = 0; i < type.length; i++) { 
        if(type[i].checked) 
            vehicleType = type[i].value; 
    }
    if(namereg.test(name)==false){
      alert('Enter A Valid Name');
    }
    else if(vehicleNumber==""){
        alert('Enter A Valid Vehicle Number');
    }
    else{
    vehicleFromdiv.style.display = "none";
     togbutton.innerHTML= "Show Element";
     alert(" " + vehicleType);
    } 
}