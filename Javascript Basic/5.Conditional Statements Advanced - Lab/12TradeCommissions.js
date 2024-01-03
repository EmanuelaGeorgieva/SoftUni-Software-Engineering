function tradeCommissions(input){
    const town = input[0];
    const sales = Number(input[1]);

    let commission = 0;
    switch(town){
        case "Sofia":
            if(sales >= 0 && sales <= 500){
                commission = 0.05;
            }else if(sales > 500 && sales <= 1000){
                commission = 0.07;
            }else if(sales > 1000 && sales <= 10000){
                commission = 0.08;
            }else if(sales > 10000){    
                commission = 0.12;
            }else{
                console.log('error');
            }    
            break;
        case "Varna":
            if(sales >= 0 && sales <= 500){
                commission = 0.045;
            }else if(sales > 500 && sales <= 1000){
                commission = 0.075;
            }else if(sales > 1000 && sales <= 10000){
                commission = 0.10;
            }else if(sales > 10000){    
                commission = 0.13;
            }else{
                console.log('error');
            }    
            break;
        case "Plovdiv":
            if(sales >= 0 && sales <= 500){
                commission = 0.055;
            }else if(sales > 500 && sales <= 1000){
                commission = 0.08;
            }else if(sales > 1000 && sales <= 10000){
                commission = 0.12;
            }else if(sales > 10000){    
                commission = 0.145;
            }else{
                console.log('error');
            }    
            break;
        default:
            console.log('error');
            break;
    }

    const total = sales * commission;
    if(total > 0){
    console.log(total.toFixed(2));
    }else{
        console.log();
    }
}

tradeCommissions(["Plovdiv",
"10000.01"]);
