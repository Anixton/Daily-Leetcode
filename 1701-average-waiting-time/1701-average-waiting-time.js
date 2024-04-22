var averageWaitingTime = function(customers) {
    let totalTimePassed = 0;
    let waitTime = 0;

    for (const customer of customers) {
        const arrivalTime = customer[0];
        const serviceTime = customer[1];
        
        totalTimePassed = Math.max(arrivalTime, totalTimePassed); 
        totalTimePassed += serviceTime; 
        waitTime += (totalTimePassed - arrivalTime); 
    }

    return waitTime / customers.length; 
};
