function workingHours(input){
    const time = Number(input[0]);
    const day = input[1];

    if(time >= 10 && time <= 18 && day != 'Sunday'){
        console.log('open');
    }else{
        console.log('closed');
    }
}

workingHours(["19",
"Friday"]);