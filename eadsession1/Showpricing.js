function showPricingCycle(){
    var currencyList=document.getElementsByName("dropdown");
    var dispLabel=document.getElementById("priceLabel");
    var pack;
    var type = [];
    type  = document.getElementsByName("cyclepack");            
    for(i = 0; i < type.length; i++) { 
        if(type[i].checked) 
            pack = type[i].value; 
    }
    if(pack="cycleDaily"){
        dispLabel.innerHTML="5 INR";
    }
}