function minPatches(nums: number[], n: number): number {
	var faltantes = 1;
	var resultado = 0;
	var ina = 0;

	while (faltantes <= n) {
		if (ina < nums.length && nums[ina] <= faltantes) {
			faltantes += nums[ina];
			ina++;
		}
		else {
			faltantes += faltantes;
			resultado++;
		}
	}
	return resultado;
};
