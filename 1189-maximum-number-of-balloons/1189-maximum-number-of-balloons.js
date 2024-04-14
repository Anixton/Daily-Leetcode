/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function(text) {
    let bCount = 0;
    let aCount = 0;
    let lCount = 0;
    let oCount = 0;
    let nCount = 0;
    
    for(let index = 0; index < text.length; index++) {
        switch (text[index]) {
          case "b":
            bCount++;
            break;
          case "a":
            aCount++;
            break;
          case "l":
            lCount++;
            break;
          case "o":
            oCount++;
            break;
          case "n":
            nCount++;
            break;
          default:
            break;
        }
    }
    
    lCount = Math.floor(lCount / 2);
    oCount = Math.floor(oCount / 2);
    
    return Math.min(Math.min(lCount, oCount), Math.min(nCount,Math.min(bCount,aCount)));
};