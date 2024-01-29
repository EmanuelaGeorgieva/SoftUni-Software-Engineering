function hotelRoom(input){
    const month = input[0];
    const numberOfOvernightsStays = Number(input[1]);

    let studio = 0;
    let apartment = 0;
    let totalPriceStudio = 0;
    let totalPriceApartment = 0;
    switch(month){
        case "May":
        case "October":
            studio = 50;
            apartment = 65;
            if(numberOfOvernightsStays > 7 && numberOfOvernightsStays < 14){
                totalPriceStudio = studio * 0.95;
            }else if(numberOfOvernightsStays > 14){
                totalPriceStudio = studio * 0.70;
                totalPriceApartment = apartment * 0.90;
            }
            break;
        case "June":
        case "September":
            studio = 75.20;
            apartment = 68.70;
            if(numberOfOvernightsStays > 14){
                totalPriceStudio = studio * 0.80;
                totalPriceApartment = apartment * 0.90;
            }
            break;
        case "July":
        case "August":
            studio = 76;
            apartment = 77;
            if(numberOfOvernightsStays > 14){
                totalPriceApartment = apartment * 0.90;
            }
            break;
    }

    if(totalPriceApartment <= 0){
        const resultApartmentNoDiscount = apartment * numberOfOvernightsStays;
        console.log(`Apartment: ${resultApartmentNoDiscount.toFixed(2)} lv.`);
    }else{
    const resultApartment = totalPriceApartment * numberOfOvernightsStays;
    console.log(`Apartment: ${resultApartment.toFixed(2)} lv.`);
    }

    if(totalPriceStudio <= 0){
    const resultStudioNoDiscount = studio * numberOfOvernightsStays;
    console.log(`Studio: ${resultStudioNoDiscount.toFixed(2)} lv.`);
    }else{
    const resultStudio = totalPriceStudio * numberOfOvernightsStays;
    console.log(`Studio: ${resultStudio.toFixed(2)} lv.`);
    }
}

hotelRoom(["August",
"20"]);