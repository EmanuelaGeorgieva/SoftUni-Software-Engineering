function onTimeForTheExam(input){
    const examHour = Number(input[0]);
    const examMinutes = Number(input[1]);
    const hourOfArrival = Number(input[2]);
    const minOfArrival = Number(input[3]);

    const examTime = examHour * 60 + examMinutes;
    const arrivalTime = hourOfArrival * 60 + minOfArrival;
    const diff = Math.abs(examTime - arrivalTime);
    const hour = Math.floor(diff / 60);
    let min = diff % 60;
    if(min === 0 || (min < 10 && hour > 0)){
        min = `0${min}`;
    }

    if(examTime === arrivalTime){
        console.log(`On time`);
    }else if(arrivalTime > examTime && diff < 60){
        console.log(`Late`);
        console.log(`${min} minutes after the start`);
    }else if(arrivalTime > examTime && diff >= 60){
        console.log(`Late`);
        console.log(`${hour}:${min} hours after the start`);
    }else if(diff <= 30){
        console.log(`On time`);
        console.log(`${min} minutes before the start`);
    }else if(diff > 30 && diff < 60){
        console.log(`Early`);
        console.log(`${min} minutes before the start`);
    }else{
        console.log(`Early`);
        console.log(`${hour}:${min} hours before the start`);
    }
         
}

onTimeForTheExam(["11",
"30",
"12",
"29"])
;