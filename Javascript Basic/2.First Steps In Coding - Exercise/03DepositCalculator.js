function depositCalculator(input){

    let amountDeposited = Number(input[0]);
    let termOfTheDeposit = Number(input[1]);
    let annualInterestRate = Number(input[2]);

    let interest = (amountDeposited * annualInterestRate) / 100;
    let interestPerMonth = interest / 12
    let result = amountDeposited + termOfTheDeposit * interestPerMonth;
    
    console.log(result);
}

depositCalculator(["200 ", "3 ", "5.7 "]);