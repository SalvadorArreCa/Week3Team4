class Solution {
    public int minPatches(int[] nums, int n) {
        int resultado = 0;
        int faltantes = 1;
        int ina = 0;

        while (faltantes <= n) {
            if (ina < nums.length && nums[ina] <= faltantes){
                faltantes += nums[ina];
                ina++;
            } 
            else {
                faltantes += faltantes;
                resultado++;
            }
        }
        return resultado;
    }
}
