class Solution(object):
    def maxProfit(self, prices):
        
        buy1 = float('inf') # Variable con el menor precio al que se puede comprar
        sell1 = 0           # Primera venta despues de realizar la primera compra buy1
        buy2 = float('inf') # Segundo valor de compra  
        sell2 = 0           # Valor maximo de proft realizado despues de las dos compras    

        for actualprice in prices:
            buy1 = min(buy1, actualprice)           # Primer precio más bajo para la primera compra
            sell1 = max(sell1, actualprice - buy1)  # Máxima ganancia después de la primera venta
            buy2 = min(buy2, actualprice - sell1)   # Segunda compra después de la primera venta
            sell2 = max(sell2, actualprice - buy2)  # Máxima ganancia o profit
            
            #print("compra1:", buy1, "   profit 1:", sell1, "\n
            #       compra2:", buy2, "   profit total:", sell2, "\n\n")

        return sell2