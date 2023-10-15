function vacationBooksList(input){

    let numberOfPages = Number(input[0]);
    let pages = Number(input[1]);
    let numberOfDays = Number(input[2]);

    let result = (numberOfPages / pages) / numberOfDays;

    console.log(result);
}

vacationBooksList(["432 ", "15 ", "4 "]);