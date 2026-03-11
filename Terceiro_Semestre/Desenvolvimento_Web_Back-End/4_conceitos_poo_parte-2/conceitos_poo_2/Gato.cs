using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_2
{
    // Conceito de herança (Gato herdando de Animal)
    public class Gato : Animal
    {
        // Método sobrescrito
        public override void EmitirSom()
        {
            // Lógica da classe pai
            base.EmitirSom();

            //Lógica especifica
            Console.WriteLine("Miau");
        }

        public void Pular()
        {
            Console.WriteLine("Gato pulou");
        }

        public void Pular(string nome)
        {
            Console.WriteLine($"Gato {nome} pulou.");
        }

        public void Pular(string nome, string raca) {
            Console.WriteLine($"Gato {nome}, raça {raca}, pulou.");
        }
    }
}