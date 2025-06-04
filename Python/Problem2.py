class Solution(object):
    def minPatches(self, nums, n):
        faltantes = 1
        resultado = 0
        ina = 0

        while faltantes <= n:
            if ina < len(nums) and nums[ina] <= faltantes:
                faltantes += nums[ina]
                ina += 1
            else:
                faltantes += faltantes
                resultado += 1
        return resultado
