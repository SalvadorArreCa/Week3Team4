function maxProfit(prices: number[]): number {
    
    let buy1: number = Infinity;    //Variable con el menor precio al que se puede comprar
    let sell1: number = 0;          //primera venta despues de realizar la primera compra buy1
    let buy2: number = Infinity;    //segundo valor de compra  
    let sell2: number = 0;          //valor maximo de proft realizado despues de las dos compras 

    for (let i in prices){ 
        buy1 = Math.min(buy1, prices[i]),           //Primer precio más bajo para la primera compra
        sell1 = Math.max(sell1, prices[i] - buy1),  // Máxima ganancia después de la primera venta
        buy2 = Math.min(buy2, prices[i]-sell1),     // Segunda compra después de la primera venta
        sell2 = Math.max(sell2, prices[i] - buy2)   //Máxima ganancia o profit
        
        //console.log(buy1, sell1, buy2, sell2);
    }
    return sell2;
};