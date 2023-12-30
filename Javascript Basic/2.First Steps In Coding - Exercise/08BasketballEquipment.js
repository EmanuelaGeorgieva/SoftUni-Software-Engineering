function basketballEquipment(input){
    const yearTax = Number(input[0]);

    let priceOfTrainers = yearTax - 0.4 * yearTax;
    let priceSuit = priceOfTrainers - 0.2 * priceOfTrainers
    let basketballBall = priceSuit / 4;
    let basketballAccessories = basketballBall / 5;

    let total = yearTax + priceOfTrainers + priceSuit + basketballBall + basketballAccessories;

    console.log(total);
}

basketballEquipment(["365"]);