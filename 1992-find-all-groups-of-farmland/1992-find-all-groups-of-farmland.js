var findFarmland = function(land) {
    const m = land.length;
    const n = land[0].length;
    const res = [];
    
    const exploreFarmland = (r1, c1) => {
        let r2 = r1;
        let c2 = c1;
        
        while (r2 < m && land[r2][c1] === 1) {
            c2 = c1;
            while (c2 < n && land[r2][c2] === 1) {
                land[r2][c2] = 0;
                c2++;
            }
            r2++;
        }
        
        return [r1, c1, r2 - 1, c2 - 1];
    };
    
    for (let r1 = 0; r1 < m; r1++) {
        for (let c1 = 0; c1 < n; c1++) {
            if (land[r1][c1] === 1) {
                const coordinates = exploreFarmland(r1, c1);
                res.push(coordinates);
            }
        }
    }
    
    return res;
};