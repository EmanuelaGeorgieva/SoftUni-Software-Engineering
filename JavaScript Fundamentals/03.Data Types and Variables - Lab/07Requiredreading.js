function requiredReading(numberOfPages, pagesReadIn1Hour, hoursPerDay ){
    let totalTime = numberOfPages / pagesReadIn1Hour;
    let totalHoursPerDay = totalTime / hoursPerDay;

    console.log(totalHoursPerDay);
}

requiredReading(212,20 ,2);