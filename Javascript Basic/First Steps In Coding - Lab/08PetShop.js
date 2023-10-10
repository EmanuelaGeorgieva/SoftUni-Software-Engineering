function petShop(input){

    let dogFood = input[0];
    let catFood = input[1];

    let totalDogFood = dogFood * 2.50;
    let totalCatFood = catFood * 4;

    let sum = totalCatFood + totalDogFood;

    console.log(`${sum} lv.`)
}

petShop(["13",
"9"]
);