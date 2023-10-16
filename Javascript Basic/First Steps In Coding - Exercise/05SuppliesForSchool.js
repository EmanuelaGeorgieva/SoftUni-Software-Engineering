function suppliesForSchool(input){

    const priceForPens = 5.80;
    const priceForMarkers = 7.20;
    const priceForDetergent = 1.20;

    let packOfPens = Number(input[0]);
    let packOfMarkers = Number(input[1]);
    let litersDetergent = Number(input[2]);
    let discount = Number(input[3]);

    let totalPriceForPens = priceForPens * packOfPens;
    let totalPriceForMarkers = priceForMarkers * packOfMarkers;
    let totalPriceForDetergent = priceForDetergent * litersDetergent;

    let totalPrice = totalPriceForPens + totalPriceForMarkers + totalPriceForDetergent;
    let totalPriceWithDiscount = totalPrice - (totalPrice * discount / 100);

    console.log(totalPriceWithDiscount);
}

suppliesForSchool(["4 ", "2 ", "5 ", "13 "]);