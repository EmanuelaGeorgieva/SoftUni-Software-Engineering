function number100ton200(input){

    let num = Number(input[0]);

    if (num > 200){
        console.log("Greater than 200");
    } else if(num < 100){
        console.log("Less than 100");
    } else {
        console.log("Between 100 and 200");
    }
}

number100ton200(["120"]);