class Solution {
    public int maxProfit(int[] prices) {
        double buy1 = Double.POSITIVE_INFINITY; //Variable con el menor precio al que se puede comprar
        double sell1 = 0; //primera venta despues de realizar la primera compra buy1
        double buy2 = Double.POSITIVE_INFINITY; //segundo valor de compra  
        double sell2 = 0; //valor maximo de proft realizado despues de las dos compras 

        for (double actualprice : prices){ 
        buy1 = Math.min(buy1, actualprice);           //Primer precio más bajo para la primera compra
        sell1 = Math.max(sell1, actualprice - buy1);  // Máxima ganancia después de la primera venta
        buy2 = Math.min(buy2, actualprice - sell1);     // Segunda compra después de la primera venta
        sell2 = Math.max(sell2, actualprice - buy2);   //Máxima ganancia o profit
        
        //System.out.println("compra1:" + buy1 + "   profit 1:" + sell1 + "\ncompra2:" + buy2 + "   profit total:" + sell2 + "\n\n");

    }
    return (int)sell2;

    }
}