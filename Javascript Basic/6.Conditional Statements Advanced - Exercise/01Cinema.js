function cinema(input){
    const type = input[0];
    const row = Number(input[1]);
    const columns = Number(input[2]);

    let price = 0;
    switch(type){
        case "Premiere":
            price = 12;
            break;
        case "Normal":
            price = 7.5;
            break;
        case "Discount":
            price = 5;
            break;
    }

    const total = row * columns * price;
    console.log(`${total.toFixed(2)} leva`);
}

cinema(["Normal",
"21",
"13"]);
