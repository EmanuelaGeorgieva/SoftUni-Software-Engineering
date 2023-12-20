function shopping(input){
    const videoCard = 250;
    const peterBudget = Number(input[0]);
    const countOfVideoCards = Number(input[1]);
    const countOfProcessors = Number(input[2]);
    const countOfRamMemory = Number(input[3]);

    let totalVideoCard = countOfVideoCards * videoCard;
    let totalProcessors = (totalVideoCard * 0.35) * countOfProcessors;
    let totalRamMemory = (totalVideoCard * 0.1) * countOfRamMemory;

    let totalPrice = totalVideoCard + totalProcessors + totalRamMemory;

    if(countOfVideoCards > countOfProcessors){
        totalPrice *= 0.85;
    }

    if(totalPrice <= peterBudget){
        const leftMoney = peterBudget - totalPrice;
        console.log(`You have ${leftMoney.toFixed(2)} leva left!`);
    }else{
        const neededMoney = totalPrice - peterBudget;
        console.log(`Not enough money! You need ${neededMoney.toFixed(2)} leva more`);
    }
}

shopping(["920.45",
"3",
"1",
"1"])
;