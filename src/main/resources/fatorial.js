function fatorial(n) {
	if (n == 1) return 1;
	return n * fatorial(n-1);
}
n = 3
println("O fatorial de " + n + " é: " + fatorial(n));