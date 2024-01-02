function fruitShop(input){
    const product = input[0];
    const day = input[1];
    const quantity = Number(input[2]);

    let price = 0;
    switch(day){
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            switch(product){
                case "banana":
                    price = 2.5;
                    break;
                case "apple":
                    price = 1.2;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.7;
                    break;
                case "pineapple":
                    price = 5.5;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    console.log("error");
                    break;
            }
            break;
        case "Saturday":
        case "Sunday":
            switch(product){
                case "banana":
                    price = 2.7;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.6;
                    break;
                case "kiwi":
                    price = 3;
                    break;
                case "pineapple":
                    price = 5.6;
                    break;
                case "grapes":
                    price = 4.2;
                    break;
                default:
                    console.log("error");
                    break;
            }
            break;
        default:
            console.log("error");
            break;            
    }

    const total = price * quantity;

    if(total > 0){
    console.log(total.toFixed(2));
    }else{
        console.log();
    }
}

fruitShop(["orange",
"Sunday",
"3"])





