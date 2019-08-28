function showPricing(){
    var dispLabel=document.getElementById("priceLabel");
    var pack;
    var vehicleType=vehicleForm();
    var daily,Monthly,Yearly;
    var type = [];
    var e = document.getElementById("dropdown");
    var currency = e.options[e.selectedIndex].value;
    type  = document.getElementsByName("pack1");            
    for(i = 0; i < type.length; i++) { 
        if(type[i].checked) 
            pack = type[i].value; 
    }
    if(currency=="INR"){
     if(vehicleType=="cycle"){
        daily=5;
        Monthly=100;
        Yearly=500;
    }
    else if(vehicleType=="motorcycle"){
        daily=10;
        Monthly=200;
        Yearly=1000;
    }
    else if(vehicleType=="4wheeler"){
        daily=20;
        Monthly=500;
        Yearly=3500;
    }
}
else if(currency=="YEN"){
    if(vehicleType=="cycle"){
       daily=7;
       Monthly=147;
       Yearly=740;
   }
   else if(vehicleType=="motorcycle"){
       daily=15;
       Monthly=295;
       Yearly=1480;
   }
   else if(vehicleType=="4wheeler"){
       daily=30;
       Monthly=740;
       Yearly=5175;
   }
}
else if(currency=="Dollor"){
    if(vehicleType=="cycle"){
       daily=0.70;
       Monthly=1.40;
       Yearly=7;
   }
   else if(vehicleType=="motorcycle"){
       daily=0.14;
       Monthly=3;
       Yearly=14;
   }
   else if(vehicleType=="4wheeler"){
       daily=0.3;
       Monthly=7;
       Yearly=50;
   }
}
        if(pack=="daily"){
            dispLabel.innerHTML=daily+" "+currency;    
        }
        else if(pack=="monthly"){
            dispLabel.innerHTML=Monthly+" "+currency;    
        }
        else if(pack=="yearly"){
            dispLabel.innerHTML=Yearly+" "+currency;    
        }
    
   
    
}