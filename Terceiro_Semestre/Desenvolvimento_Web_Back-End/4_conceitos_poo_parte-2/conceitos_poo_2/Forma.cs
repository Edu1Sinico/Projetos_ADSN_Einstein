using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_2
{
    // Classe abstrata
    public abstract class Forma
    {

        public string Cor { get; set; }
        public Forma(string cor)
        {
            Cor = cor;
        }

        // Método abstrato - NÃO POSSUI IMPLEMENTAÇÃO
        public abstract double CalcularArea();

        public abstract double CalcularPerimetro();

        // Método Concreto - POSSUI IMPLEMENTAÇÃO
        public void Desenhar()
        {
            Console.WriteLine($"Desenhando a forma {Cor}");
        }

    }
}