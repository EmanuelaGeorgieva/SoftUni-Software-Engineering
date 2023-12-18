function godzillaVsKong(input){
    const buget = Number(input[0]);
    const stuntman = Number(input[1]);
    const priceForClothesPerPerson = Number(input[2]);

    const decor = buget * 0.1;
    let totalPricePerPerson = priceForClothesPerPerson * stuntman;
    if(stuntman > 150){
        totalPricePerPerson *= 0.9;
    }

    const totalMoney = decor + totalPricePerPerson;

    if(totalMoney > buget){
        let moneyNeeded = totalMoney - buget;
        console.log(`Not enough money!`);
        console.log(`Wingard needs ${moneyNeeded.toFixed(2)} leva more`);
    }else{
        let leftMoney = buget - totalMoney;
        console.log(`Action!`);
        console.log(`Wingard starts filming with ${leftMoney.toFixed(2)} leva left.`);
    }

}

godzillaVsKong(["20000", "120", "55.5"]);