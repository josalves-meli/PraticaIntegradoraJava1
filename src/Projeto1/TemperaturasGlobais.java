package Projeto1;

public class TemperaturasGlobais
{
    public static void main(String args[])
    {
        int maior = 0;
        int indexmaior = 0;
        int menor = 0;
        int indexmenor = 0;
        String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assuncion", "Sao Paulo", "Lima", "Santiago", "Lisboa", "Tokio"};
        int temperaturas[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        for (int i = 0; i < cidades.length; i++)
        {
            System.out.println("cidade: " + cidades[i] + " minima: " + temperaturas[i][0] + " maxima: " + temperaturas[i][1]);
            if (maior <= temperaturas[i][1])
            {
                maior = temperaturas[i][1];
                indexmaior = i;
            }
            if (menor >= temperaturas[i][0])
            {
                menor = temperaturas[i][0];
                indexmenor = i;
            }
        }
        System.out.println("a maior temperatura eh " + maior + " e pertence a cidade de " + cidades[indexmaior]);
        System.out.println("a menor temperatura eh " + menor + " e pertence a cidade de " + cidades[indexmenor]);
    }
}
