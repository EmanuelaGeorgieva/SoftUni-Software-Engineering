function journey(input){
    let buget = Number(input[0]);
    let season = input[1];

    let destination = "";
    if(buget <= 100){
        destination = `Bulgaria`;
        switch(season){
            case "summer":
                buget = buget * 0.30;
                break;
            case "winter":
                buget = buget * 0.70;
                break;
        }
    }else if(buget > 100 && buget <= 1000){
        destination = `Balkans`;
        switch(season){
            case "summer":
                buget = buget * 0.40;
                break;
            case "winter":
                buget = buget * 0.80;
                break;
        }
    }else if(buget > 1000){
        destination = `Europe`;
        buget = buget * 0.90;
    }

    console.log(`Somewhere in ${destination}`)

    if(season == "summer" && destination != "Europe"){
        console.log(`Camp - ${buget.toFixed(2)}`);
    }else{
        console.log(`Hotel - ${buget.toFixed(2)}`);
    }
}
journey(["1500", "summer"]);