using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_1
{
    public class Pessoa
    {
        // Fields (Campos)
        private string nome;
        private int idade;

        // Properties (Propriedades) 
        public string Nome {get;set;}
        public int Idade {get;set;}
        public string Nacionalidade {get;set;}

        // Construtores
        public Pessoa()
        {
            
        }
        
        // Sobrecarga de construtor
        public Pessoa(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        // Métodos
        public string Apresentar()
        {
            return $"\nNome: {Nome}.\nIdade: {Idade}.\n";
        }
    }
}