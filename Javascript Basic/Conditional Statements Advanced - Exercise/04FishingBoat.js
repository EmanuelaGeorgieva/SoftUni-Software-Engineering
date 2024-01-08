function fishingBoat(input){
    const buget = Number(input[0]);
    const season = input[1];
    const numOfFishermen = Number(input[2]);

    let price = 0;
    switch(season){
        case "Spring":
            price = 3000;
            break;
        case "Summer":
        case "Autumn":
            price = 4200;
            break;
        case "Winter":
            price= 2600;
            break;
    }

    if(numOfFishermen <= 6){
        price = price * 0.90;
    }else if(numOfFishermen >= 7 && numOfFishermen <= 11){
        price = price * 0.85;
    }else if(numOfFishermen >= 12){
        price = price * 0.75;
    }

    if(numOfFishermen % 2 === 0 && season != "Autumn"){
        price = price * 0.95;
    }

    if(buget >= price){
        const leftMoney = buget - price;
        console.log(`Yes! You have ${leftMoney.toFixed(2)} leva left.`)
    }else{
        const neededMoney = price - buget;
        console.log(`Not enough money! You need ${neededMoney.toFixed(2)} leva.`)
    }
}

fishingBoat(["3600",
"Autumn",
"6"]);