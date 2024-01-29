function skiTrip(input){
    const daysOfStay = Number(input[0]);
    const typeOfPlace = input[1];
    const rating = input[2];

    let overnightStays = daysOfStay - 1;
    let price = 0;
    let discount = 0;
    let total = 0;
    switch(typeOfPlace){
        case "room for one person":
            price = 18;
            total = price * overnightStays;
            discount = total;
            break;
        case "apartment":
            price = 25;
            total = price * overnightStays;
            if(overnightStays < 10){
                discount = total * 0.70;
            }else if(overnightStays >= 10 && overnightStays < 15){
                discount = total * 0.65;
            }else{
                discount = total * 0.50;
            }
            break;
        case "president apartment":
            price = 35;
            total = price * overnightStays;
            if(overnightStays < 10){
                discount = total * 0.90;
            }else if(overnightStays >= 10 && overnightStays < 15){
                discount = total * 0.85;
            }else{
                discount = total * 0.80;
            }
            break;
    }

    if(rating == `positive`){
        discount = discount + (discount * 0.25);
    }else if(rating == `negative`){
        discount = discount - (discount * 0.10);
    }

    console.log(discount.toFixed(2));

}

skiTrip(["30",
"president apartment",
"negative"])

