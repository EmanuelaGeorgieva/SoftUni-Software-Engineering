function lunchBreak(input){
    const nameOfSeries = input[0];
    const durationOfAnEpisode = Number(input[1]);
    const durationOfTheBreak = Number(input[2]);

    const lunchTime = durationOfTheBreak / 8;
    const breakTime = durationOfTheBreak / 4;

    const leftTime = durationOfTheBreak - lunchTime - breakTime;
    const neededTime = Math.ceil(durationOfAnEpisode - leftTime);

    if(leftTime >= durationOfAnEpisode){
        console.log(`You have enough time to watch ${nameOfSeries} and left with ${neededTime} minutes free time.`);
    }else{
        console.log(`You don't have enough time to watch ${nameOfSeries}, you need ${neededTime} more minutes.`);
    }
}

lunchBreak(["Game of Thrones",
"60",
"96"]);