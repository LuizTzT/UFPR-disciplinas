### Vamos implementar juntos uma calculadora baseada em TDD.
- O usuário sempre passa 3 argumentos. Dois
números reais e a operação que deseja fazer.
- public static void double calcula(double a, double b,
String op)
- Cada operação terá um método estático com as
seguintes assinaturas:
- public static void double soma(double a, double b)
- public static void double subtracao(double a, double b)
- public static void double divisao(double a, double b)
- public static void double multiplicacao(double a, double b)

### Casos de teste
- 3+5=8 (método soma)
- 2+5=7 (método soma)
- -3.5 + 5=1.5 (método soma)
- 6/5=3 (método dividir)
- 6/0=Infinito (método dividir)
- 3 + NaN = NaN (método soma)
- 3+5=8 (método calcula)
- 3 ? 7 = RuntimeException (“Operação não implementada)
