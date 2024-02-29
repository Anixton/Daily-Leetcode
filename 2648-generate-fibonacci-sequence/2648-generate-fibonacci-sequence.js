/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let firstValue=0;
    let secondValue=1;
    
    while(true) {
        yield firstValue;
        
        let nextValue = firstValue+secondValue;
        firstValue=secondValue;
        secondValue=nextValue;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */