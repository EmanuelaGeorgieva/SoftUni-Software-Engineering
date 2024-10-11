function vacation(count, type, day){
    let price = 0;
    if(type === 'Students'){
        switch(day){
            case 'Friday':
                price += 8.45;
                break;
            case 'Saturday':
                price += 9.80;
                break;
            case 'Sunday':
                price += 10.46;
                break;
        }
    }else if(type === 'Business'){
        switch(day){
            case 'Friday':
                price += 10.90;
                break;
            case 'Saturday':
                price += 15.60;
                break;
            case 'Sunday':
                price += 16;
                break;
        }
    }else if(type === 'Regular'){
        switch(day){
            case 'Friday':
                price += 15;
                break;
            case 'Saturday':
                price += 20;
                break;
            case 'Sunday':
                price += 22.50;
                break;
        }
    }

    let sum = price * count;

    if(type === 'Students' && count >= 30){
        sum *= 0.85;
    }else if(type === 'Business' && count >= 100){
        sum -= price * 10;
    }else if(type === 'Regular' && count >= 10 && count <= 20){
        sum *= 0.95;
    }

    console.log(`Total price: ${sum.toFixed(2)}`);
}

//vacation(30,"Students","Sunday");
vacation(101,
    "Business",
    "Saturday");