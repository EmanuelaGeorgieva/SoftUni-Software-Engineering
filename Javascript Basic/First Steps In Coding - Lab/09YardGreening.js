function yardGreening(input){

    let yard = input[0];

    let sum = yard * 7.61;
    let sumDiscount = sum * 0.18;
    let sumWithDiscount = sum - sumDiscount;

    console.log(`The final price is: ${sumWithDiscount} lv.`);
    console.log(`The discount is: ${sumDiscount} lv."`)
}

yardGreening(["150"]);