function newHouse(input){
    const typeFlower = input[0];
    const numOfFlowers = Number(input[1]);
    const budget = Number(input[2]);

    let price = 0;
    switch(typeFlower){
        case "Roses":
            price = numOfFlowers * 5;
            if(numOfFlowers > 80){
                price = price * 0.90;
            }
            break;
        case "Dahlias":
            price = numOfFlowers * 3.8;
            if(numOfFlowers > 90){
                price = price * 0.85;
            }
            break;
        case "Tulips":
            price = numOfFlowers * 2.8;
            if(numOfFlowers > 80){
                price = price * 0.85;
            }
            break;
        case "Narcissus":
            price = numOfFlowers * 3;
            if(numOfFlowers < 120){
                price = price + (price * 0.15);
            }
            break;
        case "Gladiolus":
            price = numOfFlowers * 2.5;
            if(numOfFlowers < 80){
                price = price + (price * 0.20);
            }
            break;
    }

    if(price <= budget){
        let leftMoney = budget - price;
        console.log(`Hey, you have a great garden with ${numOfFlowers} ${typeFlower} and ${leftMoney.toFixed(2)} leva left.`)
    }else{
        let neededMoney = price - budget;
        console.log(`Not enough money, you need ${neededMoney.toFixed(2)} leva more.`)
    }
}

newHouse(["Tulips",
"88",
"260"]);