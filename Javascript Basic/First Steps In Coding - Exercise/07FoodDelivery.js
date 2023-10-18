function foodDelivery(input){
    const chickenMenu = 10.35;
    const fishMenu = 12.40;
    const veganMenu = 8.15;
    const delivery = 2.50;

    let chickenMenuNum = Number(input[0]);
    let fishMenuNum = Number(input[1]);
    let veganMenuNum = Number(input[2]);

    let total = (chickenMenu * chickenMenuNum) + (fishMenu * fishMenuNum) + (veganMenu * veganMenuNum);
    let totalProcent = total * 0.20;
    let totalWithProcent = total + totalProcent

    let result = totalWithProcent + delivery;
    console.log(result);
}

foodDelivery(["9 ", "2 ", "6 "]);