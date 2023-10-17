function repainting(input){
    const priceNylon = 1.50;
    const pricePaint = 14.50;
    const pricePaintThinner = 5;
    const priceForBags = 0.4;
    const percentForPaint = 0.1;
    const extraNaylonPerSqMetar = 2;

    let nylon = Number(input[0]);
    let paint = Number(input[1]);
    let paintThinner = Number(input[2]);
    let hours = Number(input[3]);

    let totalPriceForNylon = (nylon + extraNaylonPerSqMetar) * priceNylon;
    let totalPriceForPaint = (paint + (paint * percentForPaint)) * pricePaint;
    let totalPriceForPaintThinner = paintThinner * pricePaintThinner;
    let totalPrice = totalPriceForNylon + totalPriceForPaint + totalPriceForPaintThinner + priceForBags;

    let paimentForWorkers = (totalPrice * 0.30) * hours;

    let result = totalPrice + paimentForWorkers;

    console.log(result);
}

repainting(["10 ",
"11 ",
"4 ",
"8 "]
);